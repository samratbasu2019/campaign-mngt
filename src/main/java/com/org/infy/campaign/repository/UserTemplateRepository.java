package com.org.infy.campaign.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.infy.campaign.entity.UserTemplate;

public interface UserTemplateRepository extends JpaRepository<UserTemplate, Integer>{
	public List<UserTemplate> findTemplateByUserId(Integer userid);
	public UserTemplate findSingleTemplateById(Integer id);
	public List<UserTemplate> findAll();

}
