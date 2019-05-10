package com.eee.mari.sample;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDAO {
	@Autowired
	SqlSession ss;
	public void sample() {
		
		System.out.println(ss.selectList("sample.select"));
	}
}
