package com.eee.mari.NQBoard;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional

@Service
public class NQBoardService {
	@Resource
	NQBoardDAO dao;
	
	public List NQList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
