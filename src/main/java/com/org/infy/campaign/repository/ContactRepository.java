package com.org.infy.campaign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.infy.campaign.entity.ContactDetails;

public interface ContactRepository extends JpaRepository<ContactDetails, Integer>{
	public List<ContactDetails> findContactById(Integer userId);
	public List<ContactDetails> findContactByUserId(Integer userId);
}
