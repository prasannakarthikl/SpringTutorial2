/**
 *
 * @Author: Prasanna Karthik
 * Created on: 2017-Sep-10
 * 
 */
package com.example.pagespeedv2.jsondata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RuleResults {

@JsonProperty("AvoidLandingPageRedirects")
private AvoidLandingPageRedirects avoidLandingPageRedirects;
@JsonProperty("EnableGzipCompression")
private EnableGzipCompression enableGzipCompression;
@JsonProperty("LeverageBrowserCaching")
private LeverageBrowserCaching leverageBrowserCaching;
@JsonProperty("MainResourceServerResponseTime")
private MainResourceServerResponseTime mainResourceServerResponseTime;
@JsonProperty("MinifyCss")
private MinifyCss minifyCss;
@JsonProperty("MinifyHTML")
private MinifyHTML minifyHTML;
@JsonProperty("MinifyJavaScript")
private MinifyJavaScript minifyJavaScript;
@JsonProperty("MinimizeRenderBlockingResources")
private MinimizeRenderBlockingResources minimizeRenderBlockingResources;
@JsonProperty("OptimizeImages")
private OptimizeImages optimizeImages;
@JsonProperty("PrioritizeVisibleContent")
private PrioritizeVisibleContent prioritizeVisibleContent;


@JsonProperty("AvoidLandingPageRedirects")
public AvoidLandingPageRedirects getAvoidLandingPageRedirects() {
return avoidLandingPageRedirects;
}

@JsonProperty("AvoidLandingPageRedirects")
public void setAvoidLandingPageRedirects(AvoidLandingPageRedirects avoidLandingPageRedirects) {
this.avoidLandingPageRedirects = avoidLandingPageRedirects;
}

@JsonProperty("EnableGzipCompression")
public EnableGzipCompression getEnableGzipCompression() {
return enableGzipCompression;
}

@JsonProperty("EnableGzipCompression")
public void setEnableGzipCompression(EnableGzipCompression enableGzipCompression) {
this.enableGzipCompression = enableGzipCompression;
}

@JsonProperty("LeverageBrowserCaching")
public LeverageBrowserCaching getLeverageBrowserCaching() {
return leverageBrowserCaching;
}

@JsonProperty("LeverageBrowserCaching")
public void setLeverageBrowserCaching(LeverageBrowserCaching leverageBrowserCaching) {
this.leverageBrowserCaching = leverageBrowserCaching;
}

@JsonProperty("MainResourceServerResponseTime")
public MainResourceServerResponseTime getMainResourceServerResponseTime() {
return mainResourceServerResponseTime;
}

@JsonProperty("MainResourceServerResponseTime")
public void setMainResourceServerResponseTime(MainResourceServerResponseTime mainResourceServerResponseTime) {
this.mainResourceServerResponseTime = mainResourceServerResponseTime;
}

@JsonProperty("MinifyCss")
public MinifyCss getMinifyCss() {
return minifyCss;
}

@JsonProperty("MinifyCss")
public void setMinifyCss(MinifyCss minifyCss) {
this.minifyCss = minifyCss;
}

@JsonProperty("MinifyHTML")
public MinifyHTML getMinifyHTML() {
return minifyHTML;
}

@JsonProperty("MinifyHTML")
public void setMinifyHTML(MinifyHTML minifyHTML) {
this.minifyHTML = minifyHTML;
}

@JsonProperty("MinifyJavaScript")
public MinifyJavaScript getMinifyJavaScript() {
return minifyJavaScript;
}

@JsonProperty("MinifyJavaScript")
public void setMinifyJavaScript(MinifyJavaScript minifyJavaScript) {
this.minifyJavaScript = minifyJavaScript;
}

@JsonProperty("MinimizeRenderBlockingResources")
public MinimizeRenderBlockingResources getMinimizeRenderBlockingResources() {
return minimizeRenderBlockingResources;
}

@JsonProperty("MinimizeRenderBlockingResources")
public void setMinimizeRenderBlockingResources(MinimizeRenderBlockingResources minimizeRenderBlockingResources) {
this.minimizeRenderBlockingResources = minimizeRenderBlockingResources;
}

@JsonProperty("OptimizeImages")
public OptimizeImages getOptimizeImages() {
return optimizeImages;
}

@JsonProperty("OptimizeImages")
public void setOptimizeImages(OptimizeImages optimizeImages) {
this.optimizeImages = optimizeImages;
}

@JsonProperty("PrioritizeVisibleContent")
public PrioritizeVisibleContent getPrioritizeVisibleContent() {
return prioritizeVisibleContent;
}

@JsonProperty("PrioritizeVisibleContent")
public void setPrioritizeVisibleContent(PrioritizeVisibleContent prioritizeVisibleContent) {
this.prioritizeVisibleContent = prioritizeVisibleContent;
}

@Override
public String toString(){
	return avoidLandingPageRedirects.toString();
}
}
