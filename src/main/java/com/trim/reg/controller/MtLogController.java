package com.trim.reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.trim.reg.dto.MtLogDTO;
import com.trim.reg.model.MtLog;
import com.trim.reg.service.MtLogService;


@Controller
@RequestMapping(value="/mtLog")
public class MtLogController {
	
	@Autowired
	private MtLogService mtLogService;
	
	@RequestMapping(value="/listLog")
	public ModelAndView listOfMtLog(){
//		ModelAndView modelAndView = new ModelAndView("/mtLog/mtLog-list");
//		List<MtLog> mtLogList = mtLogService.getMtLogList();
//		modelAndView.addObject("mtLogList", mtLogList);
//		return modelAndView;
		
		MtLogDTO mtLogDTO = new MtLogDTO();
		ModelAndView modelAndView = new ModelAndView("/mtLog/mtLog-list");
		List<MtLog> mtLogList = mtLogService.getMtLogList();
		modelAndView.addObject("mtLogList", mtLogList);
		modelAndView.addObject("mtLogDTO", mtLogDTO);
		return modelAndView;		
	}
	
}
