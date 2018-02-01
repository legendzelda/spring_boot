package com.legendzelda.springboot.legendzelda.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * created by bu.han on 2018/1/31
 * description:
 */
@Component
public class NeoProperties {
	
	@Value("${com.neo.title}")
	private String title;
	@Value("${com.neo.description}")
	private String description;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
