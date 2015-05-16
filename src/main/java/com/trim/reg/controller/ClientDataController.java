package com.trim.reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trim.reg.model.ClientData;
import com.trim.reg.service.ClientDataService;

@Controller
@RequestMapping(value="/clientdata")
public class ClientDataController {
	
	@Autowired
	private ClientDataService clientDataService;
	
	@RequestMapping(value="/listClientData")
	public ModelAndView listOfClientData(){
		ModelAndView modelAndView = new ModelAndView("clientData/client-datalist");
		List<ClientData> clientDataList = clientDataService.getClientDataList();
		modelAndView.addObject("clientDataList", clientDataList);
		return modelAndView;
	}
}
