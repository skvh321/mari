package com.eee.mari.sample;



import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	@Resource
	SampleService service;
	@RequestMapping("/")
	public String basicCon() {
		System.out.println("sampleCon");
		service.sample();
		return "basicView/sample";
		
	}
}
