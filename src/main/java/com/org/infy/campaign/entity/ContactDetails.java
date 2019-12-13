package com.org.infy.campaign.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*******************************************************************************
 * Copyright (c) 2019 Infosys Ltd. All rights reserved.
 * 
 * Contributors: Samrat Basu. May 27, 2019
 ******************************************************************************/
@Entity
@Table(name = "contact_details")
public class ContactDetails {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "id") 
	private Integer id;
	@Column(name = "user_id") 
	private Integer userId;
	/* @Column(name = "document_id") */
	private String contactEmails;
	/* @Column(name = "file_Name") */
	private String aliasGroup;
	/* @Column(name = "phrase") */
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getContactEmails() {
		return contactEmails;
	}
	public void setContactEmails(String contactEmails) {
		this.contactEmails = contactEmails;
	}
	public String getAliasGroup() {
		return aliasGroup;
	}
	public void setAliasGroup(String aliasGroup) {
		this.aliasGroup = aliasGroup;
	}

}