/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-10
 * 
 */
package com.example.pagespeedv2.jsondata;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Component
public class Usability implements Serializable{
	private static final Logger logger = LoggerFactory.getLogger(Speed.class);

	@OneToOne	
	@JoinColumn(name = "jsonResults_id")
	@Id
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
	logger.info("Parsed score= {} from Usability class", getScore().toString());
	return score.toString();
}

}
