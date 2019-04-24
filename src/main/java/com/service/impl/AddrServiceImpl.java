package com.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AddrDAO;
import com.service.AddrService;

@Service
public class AddrServiceImpl implements AddrService {
	@Autowired
	private AddrDAO adao;
	
	public List<Map<String, String>> selectList() {
		
		return adao.selectList();
	}

}
