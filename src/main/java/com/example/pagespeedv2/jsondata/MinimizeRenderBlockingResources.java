/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-10
 * 
 */
package com.example.pagespeedv2.jsondata;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"localizedRuleName",
"ruleImpact"
})
public class MinimizeRenderBlockingResources {

@JsonProperty("localizedRuleName")
private String localizedRuleName;
@JsonProperty("ruleImpact")
private Integer ruleImpact;

@JsonProperty("localizedRuleName")
public String getLocalizedRuleName() {
return localizedRuleName;
}

@JsonProperty("localizedRuleName")
public void setLocalizedRuleName(String localizedRuleName) {
this.localizedRuleName = localizedRuleName;
}

@JsonProperty("ruleImpact")
public Integer getRuleImpact() {
return ruleImpact;
}

@JsonProperty("ruleImpact")
public void setRuleImpact(Integer ruleImpact) {
this.ruleImpact = ruleImpact;
}

}