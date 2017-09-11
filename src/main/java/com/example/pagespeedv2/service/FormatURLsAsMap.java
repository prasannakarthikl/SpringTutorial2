/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-09
 * 
 */
package com.example.pagespeedv2.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class FormatURLsAsMap {
	
	private static final Logger logger = LoggerFactory.getLogger(FormatURLsAsMap.class);
	
	@Autowired
	private FetchURLsAsList fetchURLsAsList;
	
	@Value("${pageSpeed.pagespeedBaseURL}")
	private String pageSpeedBaseURL;
	
	@Value("${pageSpeed.strategy}")
	private String strategyValues;
	
	@Value("${pageSpeed.apiKey}")
	private String pageSpeedApiKey;
	
	public Map<String,String> formatURLs(){
		logger.info("formatURLs() from FormatURLsAsMap Class called...");
		List<String> formattedURLList = fetchURLsAsList.retrieveURLsAsList();
		Map<String,String> formattedURLData = new HashMap<>();
		try{
			for(String strategy :strategyValues.split(";") ){
				for(String pageURL: formattedURLList){
					String formattedURL = pageSpeedBaseURL + "url="+pageURL+"&strategy="+strategy+"&key="+pageSpeedApiKey;				
					formattedURLData.put(formattedURL, strategy);
					logger.info("Added {} and {} to the map", formattedURL, strategy);
				}
			}
		}
		catch(Exception e){
			logger.error("Error while formatting urls..."+e); 
		}
		return formattedURLData;
		
	}
	
}
