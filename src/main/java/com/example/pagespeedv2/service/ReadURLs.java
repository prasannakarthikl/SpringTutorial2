/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-09
 * 
 */
package com.example.pagespeedv2.service;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public interface ReadURLs {
	
	public List<String> getURLs();

}
