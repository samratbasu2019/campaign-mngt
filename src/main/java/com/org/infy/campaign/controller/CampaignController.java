package com.org.infy.campaign.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.infy.campaign.entity.ContactDetails;
import com.org.infy.campaign.exception.PaginationErrorResponse;
import com.org.infy.campaign.exception.PaginationException;
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
public class CampaignController<T> {
	private final static Logger log = Logger.getLogger(CampaignController.class);

	@Autowired
	private ContactDetailService cdService;
	
	@RequestMapping(value = "/contacts/updateContact",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseStatus updatePhrases(@RequestBody final ContactDetailsPojo cdPojo) {
		log.debug("Inside Update Phrases Controller");		
		long starttime = System.currentTimeMillis();
		ResponseStatus resStatus = cdService.updateContact(cdPojo);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
	@RequestMapping(value = "/contacts/getContact",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getPhrases(@RequestParam("userid") String userID) {
		log.debug("Inside getPhrases Controller Samrat :" + userID );		
		long starttime = System.currentTimeMillis();
		Object resStatus = cdService.getContact(userID);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
}