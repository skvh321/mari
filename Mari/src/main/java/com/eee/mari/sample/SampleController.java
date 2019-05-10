package com.eee.mari.sample;



import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	private static final Logger logger=LoggerFactory.getLogger(SampleController.class);
	@Resource
	SampleService service;
	@RequestMapping("/")
	public String SampleCon() {
		logger.info("sapleCon");
		service.sample();
		return "basicView/sample";
		
	}
}
