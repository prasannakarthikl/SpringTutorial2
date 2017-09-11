/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-09
 * 
 */
package com.example.pagespeedv2.service;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 */
@Service
public class ConfigureRestTemplate {

	private static final Logger logger = LoggerFactory.getLogger(ConfigureRestTemplate.class);
		
	@Value("${server.useProxy}")
	private boolean useProxy;
	
	@Value("${server.proxy.Host}")
	private String proxyHost;
	
	@Value("${server.proxy.Port}")
	private String proxyPort;
	
	public RestTemplate getRestTemplate(){
		logger.info("getRestTemplate() called from ConfigureRestTemplate Class called...");
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		if(useProxy){
			logger.info("Setting proxy for REST Template...");
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, Integer.parseInt(proxyPort)));
			requestFactory.setProxy(proxy);
		}
		return new RestTemplate(requestFactory);
	}
	
}
