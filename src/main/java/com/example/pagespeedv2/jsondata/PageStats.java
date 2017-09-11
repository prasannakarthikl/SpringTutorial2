/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-10
 * 
 */
package com.example.pagespeedv2.jsondata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * 
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageStats {

@JsonProperty("htmlResponseBytes")
private int htmlResponseBytes;
@JsonProperty("textResponseBytes")
private int textResponseBytes;
@JsonProperty("cssResponseBytes")
private int cssResponseBytes;
@JsonProperty("imageResponseBytes")
private int imageResponseBytes;
@JsonProperty("javascriptResponseBytes")
private int javascriptResponseBytes;
@JsonProperty("otherResponseBytes")
private int otherResponseBytes;

@JsonProperty("htmlResponseBytes")
public int getHtmlResponseBytes() {
return htmlResponseBytes;
}

@JsonProperty("htmlResponseBytes")
public void setHtmlResponseBytes(int htmlResponseBytes) {
this.htmlResponseBytes = htmlResponseBytes;
}

@JsonProperty("textResponseBytes")
public int getTextResponseBytes() {
return textResponseBytes;
}

@JsonProperty("textResponseBytes")
public void setTextResponseBytes(int textResponseBytes) {
this.textResponseBytes = textResponseBytes;
}

@JsonProperty("cssResponseBytes")
public int getCssResponseBytes() {
return cssResponseBytes;
}

@JsonProperty("cssResponseBytes")
public void setCssResponseBytes(int cssResponseBytes) {
this.cssResponseBytes = cssResponseBytes;
}

@JsonProperty("imageResponseBytes")
public int getImageResponseBytes() {
return imageResponseBytes;
}

@JsonProperty("imageResponseBytes")
public void setImageResponseBytes(int imageResponseBytes) {
this.imageResponseBytes = imageResponseBytes;
}

@JsonProperty("javascriptResponseBytes")
public int getJavascriptResponseBytes() {
return javascriptResponseBytes;
}

@JsonProperty("javascriptResponseBytes")
public void setJavascriptResponseBytes(int javascriptResponseBytes) {
this.javascriptResponseBytes = javascriptResponseBytes;
}

@JsonProperty("otherResponseBytes")
public int getOtherResponseBytes() {
return otherResponseBytes;
}

@JsonProperty("otherResponseBytes")
public void setOtherResponseBytes(int otherResponseBytes) {
this.otherResponseBytes = otherResponseBytes;
}

@Override
public String toString(){
	int responseInBytes = getHtmlResponseBytes() + getTextResponseBytes() + getCssResponseBytes() +
			getImageResponseBytes() + getJavascriptResponseBytes() + getOtherResponseBytes();
	return "{pageStats:"+((responseInBytes/1024)/1024)+"}";
}

}