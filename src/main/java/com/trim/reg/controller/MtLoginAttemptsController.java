package com.trim.reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trim.reg.dto.MtLoginAttemptsDTO;
import com.trim.reg.model.MtLoginAttempts;
import com.trim.reg.service.MtLoginAttemptsService;

@Controller
@RequestMapping(value="/mtLogin")
public class MtLoginAttemptsController {
	
	@Autowired
	private MtLoginAttemptsService mtLoginAttemptService;
	
	@RequestMapping(value="/mtList")
	public ModelAndView listOfMtLoginAttempt(){
//		ModelAndView modelAndView = new ModelAndView("/mtLogin/mtLogin");
//		List<MtLoginAttempts> mtLoginAttempts = mtLoginAttemptService.getMtLoginAttemptList();
//		modelAndView.addObject("mtLoginAttemptList", mtLoginAttempts);
//		return modelAndView;
		
		MtLoginAttemptsDTO mtLoginAttemptsDTO = new MtLoginAttemptsDTO();
		ModelAndView modelAndView = new ModelAndView("/mtLogin/mtLogin");
		List<MtLoginAttempts> mtLoginAttempts = mtLoginAttemptService.getMtLoginAttemptList();
		modelAndView.addObject("mtLoginAttemptDTO", mtLoginAttemptsDTO);
		modelAndView.addObject("mtLoginAttemptList", mtLoginAttempts);
		return modelAndView;		
	}
}
