package com.krishna.simplehttpadserver.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ad {
	
	private String partner_id;
	private Integer duration;
	private String ad_content;
	
	public Ad() {
	
	}
	
	public Ad(String partner_id, Integer duration, String ad_content) {
		super();
		this.partner_id = partner_id;
		this.duration = duration;
		this.ad_content = ad_content;
	}

	public String getPartner_id() {
		return partner_id;
	}
	public void setPartner_id(String partner_id) {
		this.partner_id = partner_id;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getAd_content() {
		return ad_content;
	}
	public void setAd_content(String ad_content) {
		this.ad_content = ad_content;
	}
	
}

