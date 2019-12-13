package com.org.infy.campaign.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.infy.campaign.dao.CampaignContactDAO;
import com.org.infy.campaign.request.model.ContactDetailsPojo;
import com.org.infy.campaign.response.model.ResponseStatus;;

/*******************************************************************************
 * Copyright (c) 2019 Infosys Ltd. All rights reserved.
 * 
 * Contributors: Samrat Basu. June 14, 2019
 * 
 * @param <T>
 ******************************************************************************/
@Service
public class ContactDetailService {
	private final static Logger log = Logger.getLogger(ContactDetailService.class);
	@Autowired
	private CampaignContactDAO ccDao;

	public ResponseStatus updateContact(ContactDetailsPojo cdpojo) {
		ResponseStatus resStat= ccDao.updateDataset(cdpojo);
		return resStat;
	}
	public Object getContact(String userID) {
		Object resStat= ccDao.findRecordSet(userID);
		return resStat;
	}

}