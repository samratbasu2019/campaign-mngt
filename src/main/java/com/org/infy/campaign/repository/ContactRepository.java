package com.org.infy.campaign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.infy.campaign.entity.ContactDetails;

public interface ContactRepository extends JpaRepository<ContactDetails, Integer>{
	public List<ContactDetails> findContactByUserId(Integer userId);
	public ContactDetails findSingleContactByUserId(Integer userId);
	public List<ContactDetails> findAll();
}
