package com.org.infy.campaign.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.infy.campaign.request.model.UserTemplatePojo;
import com.org.infy.campaign.response.model.ResponseStatus;
import com.org.infy.campaign.service.UserTemplateService;

@RestController
@RequestMapping(value = "/core")
public class UserTemplateController {
	private final static Logger log = Logger.getLogger(CampaignController.class);

	@Autowired
	private UserTemplateService utService;
	
	@RequestMapping(value = "/template/addUserTemplate",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseStatus addUserTemplate(@RequestBody final UserTemplatePojo utPojo) {
		log.debug("Inside addUserTemplate Controller");		
		long starttime = System.currentTimeMillis();
		ResponseStatus resStatus = utService.addUserTemplate(utPojo);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
	@RequestMapping(value = "/template/getUserTemplate",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getUserTemplate(@RequestParam("templateId") String templateId) {
		log.debug("Inside getUserTemplate Controller :" + templateId );		
		long starttime = System.currentTimeMillis();
		Object resStatus = utService.getByTemplateID(templateId);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
	@RequestMapping(value = "/template/getTemplatebyUserId",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getTemplateByUserId(@RequestParam("userid") String userid) {
		log.debug("Inside getTemplateByUserId Controller :" + userid );		
		long starttime = System.currentTimeMillis();
		Object resStatus = utService.getByUserID(userid);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	@RequestMapping(value = "/template/findAll",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object findAll() {
		log.debug("Inside findAll Controller" );		
		long starttime = System.currentTimeMillis();
		Object resStatus = utService.findAllService();	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
	
	@RequestMapping(value = "/template/updateUserTemplate",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseStatus updateUserTemplate(@RequestParam("templateId") String templateId, @RequestBody final UserTemplatePojo utPojo) {
		log.debug("Inside Update updateContact Controller");		
		long starttime = System.currentTimeMillis();
		ResponseStatus resStatus = utService.updateUserTemplate(Integer.parseInt(templateId),utPojo);	
		long endtime = System.currentTimeMillis();
		log.debug("Total processing time "+ (endtime -starttime)+ " ms.");		
		return resStatus;
	}
}
