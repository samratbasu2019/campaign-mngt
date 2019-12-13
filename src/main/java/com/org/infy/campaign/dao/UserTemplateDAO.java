package com.org.infy.campaign.dao;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.org.infy.campaign.entity.UserTemplate;
import com.org.infy.campaign.repository.UserTemplateRepository;
import com.org.infy.campaign.request.model.UserTemplatePojo;
import com.org.infy.campaign.response.model.ResponseStatus;

@Repository
public class UserTemplateDAO {

	private final static Logger log = Logger.getLogger(UserTemplateDAO.class);
	@Autowired
	private UserTemplateRepository utRepository;

	public ResponseStatus addUserTemplate(UserTemplatePojo utpojo) {
		UserTemplate ut = new UserTemplate();
		ResponseStatus resStatus = new ResponseStatus();
		try {
			ut.setUserid(utpojo.getUserid());
			ut.setTemplateData(utpojo.getTemplateData());
			ut.setDate(utpojo.getDate());
			ut.setContactEmails(utpojo.getContactEmails());
			ut.setContactAlias(utpojo.getContactAlias());
			utRepository.saveAndFlush(ut);
			resStatus.setStatCode(200);
			resStatus.setStatus("success");
			resStatus.setMessage("Data successfully saved");

		} catch (Exception ex) {
			resStatus.setStatCode(401);
			resStatus.setStatus("failure");
			resStatus.setMessage(ex.getCause().toString());
			ex.printStackTrace();
		}
		return resStatus;
	}

	public Object findTemplateByID(String templateId) {
		Object obj = null;
		obj = utRepository.findSingleTemplateById(Integer.parseInt(templateId));
		return obj;
	}

	public Object findTemplateByUserId(String userId) {
		Object obj = null;
		obj = utRepository.findTemplateByUserId(Integer.parseInt(userId));
		return obj;
	}

	public ResponseStatus updateUserTemplate(Integer id, UserTemplatePojo utPojo) {
		UserTemplate ut = utRepository.findSingleTemplateById(id);
		ResponseStatus resStatus = new ResponseStatus();
		try {
			if (ut != null) {
				ut.setContactAlias(utPojo.getContactAlias());
				ut.setContactEmails(utPojo.getContactEmails());
				ut.setTemplateData(utPojo.getTemplateData());
				ut.setDate(utPojo.getDate());
				ut.setUserid(ut.getUserid());
				utRepository.save(ut);
				resStatus.setStatCode(200);
				resStatus.setStatus("success");

				resStatus.setMessage("Data successfully updated");
			}
			else {
				resStatus.setStatCode(401);
				resStatus.setStatus("failure");
				resStatus.setMessage("Bad request, template id do not exist");
			}

		} catch (Exception ex) {
			resStatus.setStatCode(401);
			resStatus.setStatus("failure");
			resStatus.setMessage(ex.getCause().toString());
			ex.printStackTrace();
		}
		return resStatus;
	}

	public Object findAllUserTemplate() {
		Object obj = null;
		obj = utRepository.findAll();
		return obj;
	}

}
