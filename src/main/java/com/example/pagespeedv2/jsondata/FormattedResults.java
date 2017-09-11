/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-10
 * 
 */
package com.example.pagespeedv2.jsondata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.annotations.SerializedName;

/**
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormattedResults {
	
	@SerializedName("ruleResults")
	private RuleResults ruleResults;

	public RuleResults getRuleResults() {
		return ruleResults;
	}

	public void setRuleResults(RuleResults ruleResults) {
		this.ruleResults = ruleResults;
	}
	@Override
	public String toString(){
		return "RuleRESULTS="+ruleResults.toString();
	}

}
