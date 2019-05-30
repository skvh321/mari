package com.eee.mari.NQBoard;



import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/NQBoard/*")
public class NQBoardController {
	private static final Logger logger=LoggerFactory.getLogger(NQBoardController.class);
	@Resource
	NQBoardService service;
	
	@RequestMapping("/NQlist")
	public String NQBoardList(Model model) {
		logger.info("NQlist");
		/*
		 * List list=service.NQList(); model.addAttribute("list",list);
		 */
		return "NQBoard/NQlist";
		
	}
	
}
