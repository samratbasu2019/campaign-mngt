package com.org.infy.campaign.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.infy.campaign.dao.UserTemplateDAO;
import com.org.infy.campaign.request.model.UserTemplatePojo;
import com.org.infy.campaign.response.model.ResponseStatus;

@Service 
public class UserTemplateService {
	private final static Logger log = Logger.getLogger(UserTemplateService.class);
	@Autowired
	private UserTemplateDAO utDao;

	public ResponseStatus addUserTemplate(UserTemplatePojo utpojo) {
		ResponseStatus resStat= utDao.addUserTemplate(utpojo);
		return resStat;
	}
	public Object getByTemplateID(String templateId) {
		Object resStat= utDao.findTemplateByID(templateId);
		return resStat;
	}
	
	public Object getByUserID(String userId) {
		Object resStat= utDao.findTemplateByUserId(userId);
		return resStat;
	}
	
	public Object findAllService() {
		Object resStat= utDao.findAllUserTemplate();
		return resStat;
	}
	
	public ResponseStatus updateUserTemplate(Integer templateid, UserTemplatePojo utpojo) {
		ResponseStatus resStat= utDao.updateUserTemplate(templateid, utpojo);
		return resStat;
	}


}
