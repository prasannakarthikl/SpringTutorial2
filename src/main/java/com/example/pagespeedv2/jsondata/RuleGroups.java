/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-10
 * 
 */
package com.example.pagespeedv2.jsondata;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@Entity
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "RuleGroups")
public class RuleGroups {
	private static final Logger logger = LoggerFactory.getLogger(RuleGroups.class);

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id")
	 private Long id;
	
	@ManyToOne
	@JoinColumn(name = "jsonResults_id")
	private JSONResults JSONResultsId;		

@JsonProperty("SPEED")
private Speed Speed;

/*@JsonProperty("USABILITY")
private Usability Usability;
*/
@JsonProperty("SPEED")
public Speed getSpeed() {
	logger.info("Get Spped method"+ Speed.toString());
	return Speed;
}

@JsonProperty("SPEED")
public void setSpeed(Speed Speed) {
	logger.info("Set Spped method"+ Speed.toString());
this.Speed = Speed;
}

/*@JsonProperty("USABILITY")
public Usability getUsability() {
return Usability;
}

@JsonProperty("USABILITY")
public void setUsability(Usability Usability) {
this.Usability = Usability;
}
*/
/*@Override
public String toString(){
	
	if(null!=getUsability()){
		logger.info("Usability is not NULL, adding to JSONObject");
		return "{"+"Speed="+getSpeed().toString()+"},{"+"Usability="+getUsability().toString()+"}";
	}
	else{
		logger.info("Usability is NULL, adding as 0 to JSONObject");
		return "{"+"Speed="+getSpeed().toString()+"},{"+"Usability="+0+"}";
	}
}
*/
}