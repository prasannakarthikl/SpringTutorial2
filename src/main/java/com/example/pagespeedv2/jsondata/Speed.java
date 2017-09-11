/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-10
 * 
 */
package com.example.pagespeedv2.jsondata;

import javax.persistence.Column;
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
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@Entity
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Speed {
	private static final Logger logger = LoggerFactory.getLogger(Speed.class);
	
/*	@OneToOne	
	@JoinColumn(name = "jsonResults_id")
	@Id
	private JSONResults JSONResultsId;*/
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "id")
	 private Long id;
	
	@ManyToOne
	@JoinColumn(name = "jsonResults_id")
	private JSONResults JSONResultsId;
	
@JsonProperty("score")
private Integer score;

@JsonProperty("score")
public Integer getScore() {
return score;
}

@JsonProperty("score")
public void setScore(Integer score) {
this.score = score;
}
@Override
public String toString(){
	logger.info("Parsed score= {} from Speed class", getScore().toString());
	return score.toString();
}

}
