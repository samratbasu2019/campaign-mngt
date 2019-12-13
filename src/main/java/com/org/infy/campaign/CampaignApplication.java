package com.org.infy.campaign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.apache.log4j.Logger;
/*******************************************************************************
 * Copyright (c) 2019  Infosys Ltd. All rights reserved.
 * 
 *  Contributors:
 *      Samrat Basu.
 *      May 27, 2019
 ******************************************************************************/
@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan({"com.org.infy.campaign"})
//@EnableJpaRepositories( basePackages = "com.org.infy.campaign")
//@EntityScan("com.org.infy.campaign.entity")
public class CampaignApplication {
	private final static Logger log = Logger.getLogger(CampaignApplication.class);
	
	public static void main(String[] args) {
		log.debug("Infy campaign Started...");
		SpringApplication.run(CampaignApplication.class, args);
	}

}
