package com.org.infy.campaign.controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.infy.campaign.request.model.ContactDetailsPojo;
import com.org.infy.campaign.response.model.ResponseStatus;
import com.org.infy.campaign.service.ContactDetailService;
/*******************************************************************************
 * Copyright (c) 2019  Infosys Ltd. All rights reserved.
 * 
 *  Contributors:
 *      Samrat Basu.
 *      Contributors: Samrat Basu. June 14, 2019
 * @param <T>
 ******************************************************************************/

@RestController
@RequestMapping(value = "/core")
public class CampaignContactController<T> {
	private final static Logger log = Logger.getLogger(CampaignContactController.class);

	@Autowired
	private ContactDetailService cdService;
	
	@RequestMapping(value = "/contacts/addContact",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseStatus addContact(@RequestBody final ContactDetailsPojo cdPojo) {
		log.debug("Inside Update addContact Controller");		
		long starttime = System.currentTimeMillis();
		ResponseStatus resStatus = cdService.addContact(cdPojo);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
	@RequestMapping(value = "/contacts/getContact",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getContact(@RequestParam("userid") String userID) {
		log.debug("Inside getContact Controller :" + userID );		
		long starttime = System.currentTimeMillis();
		Object resStatus = cdService.getContact(userID);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
	@RequestMapping(value = "/contacts/findAll",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object findAll() {
		log.debug("Inside findAll Controller" );		
		long starttime = System.currentTimeMillis();
		Object resStatus = cdService.findAll();	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
	@RequestMapping(value = "/contacts/updateContact",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseStatus updateContact(@RequestParam("userid") String userID, @RequestBody final ContactDetailsPojo cdPojo) {
		log.debug("Inside Update updateContact Controller");		
		long starttime = System.currentTimeMillis();
		ResponseStatus resStatus = cdService.updateContact(Integer.parseInt(userID),cdPojo);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
	
}