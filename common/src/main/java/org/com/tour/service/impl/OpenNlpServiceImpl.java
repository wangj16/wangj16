package org.com.tour.service.impl;

import org.com.tour.service.OpenNlpService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
// @Configurable
// @ComponentScan(basePackages = "org.com.tour.service")
@Component
public class OpenNlpServiceImpl implements OpenNlpService {
	
	@Transactional	
	public String[] sentenceParser(String paragraph) {
		
		System.out.println("openNlp: aaaaaaaaaaaaaaaaaaaaaaaaa    ");
		
		return null;
	}
}
