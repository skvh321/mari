package com.eee.mari.sample;



import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SampleController {
	private static final Logger logger=LoggerFactory.getLogger(SampleController.class);
	@Resource
	SampleService service;
	
	@RequestMapping("/")
	public String SampleCon(Model model) {
		logger.info("sapleCon");
		List list=service.sample();
		model.addAttribute("list",list);
		return "tiles/basicView/body";
		
	}
	
}
