package com.eee.mari.NQBoard;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class NQBoardDAO {
	@Autowired
	SqlSession ss;
	
	
	public List NQList() {
		
		return ss.selectList("sample.select");
	}
}
