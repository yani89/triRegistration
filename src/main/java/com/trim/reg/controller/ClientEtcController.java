package com.trim.reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trim.reg.model.ClientEtc;
import com.trim.reg.service.ClientEtcService;

@Controller
@RequestMapping(value="/clientEtc")
public class ClientEtcController {
	
	@Autowired
	private ClientEtcService clientEtcService;
	
	@RequestMapping(value="/clientEtcList")
	public ModelAndView clientEtcList(){
		ModelAndView modelAndView = new ModelAndView("/clientEtc/client-etc-list");
		List<ClientEtc> clientEtcList = clientEtcService.getClientEtcList();
		modelAndView.addObject("clientEtcList", clientEtcList);
		return modelAndView;
	}
}
