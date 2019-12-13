package com.org.infy.campaign.dao;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.infy.campaign.entity.ContactDetails;

import com.org.infy.campaign.repository.ContactRepository;
import com.org.infy.campaign.request.model.ContactDetailsPojo;

import com.org.infy.campaign.response.model.ResponseStatus;

@Repository
public class CampaignContactDAO {
	private final static Logger log = Logger.getLogger(CampaignContactDAO.class);
	@Autowired
	private ContactRepository ccRepository;

	public ResponseStatus updateDataset(ContactDetailsPojo cdpojo) {
		ContactDetails cotactDetails = new ContactDetails();
		ResponseStatus resStatus = new ResponseStatus();
		try {
			cotactDetails.setContactEmails(cdpojo.getContactEmails());
			cotactDetails.setAliasGroup(cdpojo.getAliasGroup());
			cotactDetails.setUserId(cdpojo.getUserId());
			ccRepository.save(cotactDetails);
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

	public Object findRecordSet(String userID) {
		Object obj = null;
		obj = ccRepository.findContactByUserId(Integer.parseInt(userID));
		return obj;
	}

}
