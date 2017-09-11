/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-09
 * 
 */
package com.example.pagespeedv2.jsondata;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
@Entity
@Table(name = "JSONResults")
public class JSONResults {
	private static final Logger logger = LoggerFactory.getLogger(JSONResults.class);
	
	@Id
	@JsonProperty("id")
	@Column(name="id")
	private String id;
	
	@JsonProperty("ruleGroups")
	private RuleGroups ruleGroups;
	/*@JsonProperty("pageStats")
	private PageStats pageStats;
	@JsonProperty("formattedResults")
	private FormattedResults formattedResults;
	*/
	@JsonProperty("id")
	public String getId() {
	return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
	this.id = id;
	}

	@JsonProperty("ruleGroups")
	public RuleGroups getRuleGroups() {
	return ruleGroups;
	}

	@JsonProperty("ruleGroups")
	public void setRuleGroups(RuleGroups ruleGroups) {
	this.ruleGroups = ruleGroups;
	}

/*	@JsonProperty("pageStats")
	public PageStats getPageStats() {
	return pageStats;
	}

	@JsonProperty("pageStats")
	public void setPageStats(PageStats pageStats) {
	this.pageStats = pageStats;
	}

	@JsonProperty("formattedResults")
	public FormattedResults getFormattedResults() {
	return formattedResults;
	}

	@JsonProperty("formattedResults")
	public void setFormattedResults(FormattedResults formattedResults) {
	this.formattedResults = formattedResults;
	}
*/	
/*	public void pageSpeedResults(){
		JSONObject jsonResults = new JSONObject();
		logger.info("FINAL DATA" + ruleGroups.toString() +" -- "+
		pageStats.toString()+ " -- "+ formattedResults.toString());
		
	}
*/}
