
package com.example.pagespeedv2.jsondata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AvoidLandingPageRedirects {

    @JsonProperty("ruleImpact")
    private Integer ruleImpact;

    @JsonProperty("ruleImpact")
    public Integer getRuleImpact() {
        return ruleImpact;
    }

    @JsonProperty("ruleImpact")
    public void setRuleImpact(Integer ruleImpact) {
        this.ruleImpact = ruleImpact;
    }
    
    @Override
    public String toString(){
    	return getRuleImpact().toString();
    }

}
