/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-09
 * 
 */
package com.example.pagespeedv2.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pagespeedv2.service.GetResultsImpl;

/**
 * 
 */
@RestController
public class RunReports {
	private static final Logger logger = LoggerFactory.getLogger(RunReports.class);
	
	@Value("${app.enableCronJob}")
	private String enableCronJob;
	
	@Autowired
	private GetResultsImpl getResults;
	
	@Scheduled(cron="${app.schedule}")
	public void generateReports() {
		logger.info("generateReports() method from RunReports Class called via Scheduler...");
		if(enableCronJob.equalsIgnoreCase("true")){
			logger.info("Starting Cron Job...");
			getResults.getJSONResults();
		}
		else{
			logger.info("Cron Job initiation halted based on app.enableCronJob property");
		}
	}
	@GetMapping("/generateReports")
	public void generateReports(HttpServletRequest request) {
		logger.info("generateReports() method from RunReports Class called via HTTP Request...");
		getResults.getJSONResults();
		
	}
	
}
