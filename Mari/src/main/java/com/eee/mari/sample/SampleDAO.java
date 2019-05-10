package com.eee.mari.sample;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SampleDAO {
	@Autowired
	SqlSession ss;
	public List sample() {
		
		return ss.selectList("sample.select");
	}
}
