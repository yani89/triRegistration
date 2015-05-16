package com.trim.reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trim.reg.dto.ClientBankDTO;
import com.trim.reg.model.ClientBank;
import com.trim.reg.service.ClientBankService;

@Controller
@RequestMapping(value="/clientbank")
public class ClientBankController {
	
	@Autowired 
	private ClientBankService clientBankService;
	
	@RequestMapping(value="/listClientBank")
	public ModelAndView listOfClientBank(){
//		ModelAndView modelAndView = new ModelAndView("/clientBank/client-banklist");
//		List<ClientBank> clientBank = clientBankService.getClientBankList();
//		modelAndView.addObject("clientBankList", clientBank);
		
		ClientBankDTO clientDTO = new ClientBankDTO();
		ModelAndView modelAndView = new ModelAndView("/clientBank/client-banklist");
		List<ClientBank> clientBank = clientBankService.getClientBankList();
		modelAndView.addObject("clientBankList", clientBank);
		modelAndView.addObject("clientBankDTO", clientDTO);
		return modelAndView;
	}
}
