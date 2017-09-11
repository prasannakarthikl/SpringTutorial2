/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-09
 * 
 */
package com.example.pagespeedv2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class FetchURLsAsList {
	
	private static final Logger logger = LoggerFactory.getLogger(FetchURLsAsList.class);
	
	private ReadURLs readURLs;
	
	@Value("${ReadURLsfrom}") 
	String serviceSelectorProperty;
	
	@Autowired
	private ReadURLsFromSeedFile readURLsFromSeedFile;
	
	@Autowired
	private ReadURLsFromSitemap readURLsFromSitemap;	
	
	public ReadURLs getFetchURLs() {
		return readURLs;
	}
	@Autowired
	public void setFetchURLs() {
		if(serviceSelectorProperty.equalsIgnoreCase("file")){
			this.readURLs = readURLsFromSeedFile;
			logger.info("Configuring to fetch urls from file...");
		}
		else{
			this.readURLs = readURLsFromSitemap;
			logger.info("Configuring to fetch urls from Sitemap...");
		}
	}
	
	public List<String> retrieveURLsAsList(){
		return getFetchURLs().getURLs();
	}

}
