package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.AddrService;

@Controller
public class AddrCt {
	
	@Autowired
	private AddrService as;
	
	@RequestMapping("/addr/list")
	public String goAddrList(Model m) {
		m.addAttribute("addrList", as.selectList());
		return "/addr/list";
	}
}
