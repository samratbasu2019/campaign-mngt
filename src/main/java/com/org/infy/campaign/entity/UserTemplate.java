package com.org.infy.campaign.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_templates")
public class UserTemplate {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id") 
	private Integer id;
	@Column(name = "userid") 
	private Integer userId;
	private String templateData;
	private String date;
	private String contactAlias;
	private String contactEmails;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userId;
	}
	public void setUserid(Integer userid) {
		this.userId = userid;
	}
	public String getTemplateData() {
		return templateData;
	}
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContactAlias() {
		return contactAlias;
	}
	public void setContactAlias(String contactAlias) {
		this.contactAlias = contactAlias;
	}
	public String getContactEmails() {
		return contactEmails;
	}
	public void setContactEmails(String contactEmails) {
		this.contactEmails = contactEmails;
	}

}
