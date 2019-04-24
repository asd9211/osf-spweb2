package com.dao.impl;

import java.util.HashMap;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.AddrDAO;


@Repository
public class AddrDAOImpl implements AddrDAO {
	
	@Autowired
	private SqlSessionFactory ssf;

	public List<Map<String, String>> selectList() {
		Map<String,String>param = new HashMap<String,String>();

		SqlSession ss = ssf.openSession();
		param.put("adNum", "20");
		
		return ss.selectList("addr.selectAddrList", param);
		
	}
	

	
}
