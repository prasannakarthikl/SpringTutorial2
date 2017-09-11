/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-09
 * 
 */
package com.example.pagespeedv2.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class ReadURLsFromSeedFile implements ReadURLs{
	
	private static final Logger logger = LoggerFactory.getLogger(ReadURLsFromSeedFile.class);
	
	public List<String> getURLs(){
		logger.info("getURLs() method from ReadURLsFromSeedFile Class called...");
		final String FILE_NAME = "urls.txt";
		List<String> urlList = new LinkedList<>();
		try(Stream<String> stream = Files.lines(Paths.get(FILE_NAME))) {
			stream.forEach(e -> {
				urlList.add(e);
				logger.info("Read {} from urls.txt file", e);
				});
		} catch (IOException e) {
			logger.error("Error while reading urls.txt file: " + e.getStackTrace());
		}
		return urlList;
	}


}
