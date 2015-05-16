package com.trim.reg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trim.reg.service.ClientBankService;
import com.trim.reg.service.ClientDataService;
import com.trim.reg.service.ClientEtcService;
import com.trim.reg.service.ClientFamilyService;

@Controller
@RequestMapping(value="/register")
public class RegisterController {
	
	@Autowired
	private ClientBankService clientBankService;
	@Autowired
	private ClientDataService clientDataService;
	@Autowired
	private ClientEtcService clientEtcService;
	@Autowired
	private ClientFamilyService clientFamilyService;
	
	@RequestMapping(value="/registeradd", method=RequestMethod.POST)
	public ModelAndView addRegisterPage(){
		ModelAndView modelAndView = new ModelAndView("/registerform");
		return modelAndView;
	}
	
}
