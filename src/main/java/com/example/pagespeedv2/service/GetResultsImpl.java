/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-09
 * 
 */
package com.example.pagespeedv2.service;

import java.util.Map;

import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.pagespeedv2.jsondata.JSONResults;

/**
 * 
 */
@Service
public class GetResultsImpl implements GetResults {
	
	private static final Logger logger = LoggerFactory.getLogger(GetResultsImpl.class);
	JSONArray finalResultJSON = new JSONArray();
	
	@Autowired
	private ConfigureRestTemplate configureRestTemplate;
	
	@Autowired
	private FormatURLsAsMap formatURLsAsMap;
	
	@Autowired
	private JSONResults jsonResults;
	
	//@Autowired
	//private ModJSONData modJSON;
	
	
	public void getJSONResults(){
		RestTemplate restTemplate = configureRestTemplate.getRestTemplate();

		logger.info("getJSONResults() from GetResultsImpl Class called...");
		Map<String,String> formattedURLs = formatURLsAsMap.formatURLs();
		for (Map.Entry<String, String> entry : formattedURLs.entrySet()) {
		    logger.info("Read URLs as = " + entry.getKey() + " with Strategy = " + entry.getValue());
		    try{
		    	JSONResults results = restTemplate.getForObject(entry.getKey(), JSONResults.class);
		    	//results.pageSpeedResults();
		    
		    
		    }catch(Exception e){
		    	logger.error("Error during REST service call..."+ e);
		    }
		}
		
	}


}
