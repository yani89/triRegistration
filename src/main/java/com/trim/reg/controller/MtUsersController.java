package com.trim.reg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trim.reg.dto.MtUserDTO;
import com.trim.reg.model.MtUsers;
import com.trim.reg.service.MtUsersService;

@Controller
@RequestMapping(value="/mtuser")
public class MtUsersController {
	
	@Autowired
	private MtUsersService mtUsersService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addMtUsersPage(){
		ModelAndView modelAndView = new ModelAndView("/mtUsers/mtuser-add");
		modelAndView.addObject("mtuser",new MtUsers());
		return modelAndView;
		
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addMtUsers(@ModelAttribute("mtuser") MtUsers mtUsers,BindingResult result){
		//INSERT INTO `registration_lg`.`mt_users` (`ID`, `NAME`, `USERNAME`, `EMAIL`, `PASSWORD`, `ROLE`, `SALT`, `STATUS`, `FIRST_LOGIN`, `REG_DATE`, `MODIF_DATE`) VALUES ('2', '1', '1', '1', '1', '1', '1', '1', '1', '2015-05-06', '2015-05-05');
		ModelAndView modelAndView = new ModelAndView("home");
		mtUsersService.addMtUsers(mtUsers);
		String message = "Users was successfully added";
		System.out.println("test data sudah masuk sini belum " + message);
		modelAndView.addObject("message", message);
		return modelAndView;
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView listOfMtUsers(){
//		ModelAndView modelAndView = new ModelAndView("mtusers-list");
//		List<MtUsers> mtUserslist = mtUsersService.getMtUsersList();
//		modelAndView.addObject("mtUsersList", mtUserslist);
//		
//		return modelAndView;
		
		MtUserDTO mtUserDTO = new MtUserDTO();
		ModelAndView modelAndView = new ModelAndView("/mtUsers/mtusers-list");
		List<MtUsers> mtUserslist = mtUsersService.getMtUsersList();
		modelAndView.addObject("mtUsersList", mtUserslist);
		modelAndView.addObject("mtUsersDTO", mtUserDTO);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{ID}", method=RequestMethod.GET)
	public ModelAndView editMtUsersPage(@PathVariable Integer ID){
		ModelAndView modelAndView = new ModelAndView("/mtUsers/mtusers-edit");
		MtUsers mtUsers = mtUsersService.getMtUsers(ID);
		modelAndView.addObject("mtuser", mtUsers);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{ID}", method=RequestMethod.POST)
	public ModelAndView edditingMtUsersPage(@ModelAttribute MtUsers mtUsers,@PathVariable Integer ID){
		ModelAndView modelAndView = new ModelAndView("home");
		mtUsersService.updateMtUsers(mtUsers);
		
		String message = "Users was succesfully edited";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{ID}", method=RequestMethod.GET)
	public ModelAndView deleteMtUsers(@PathVariable Integer ID){
		ModelAndView modelAndView = new ModelAndView("home");
		mtUsersService.deleteMtUsers(ID);
		String message = "Users was succesffuly deleted";
		modelAndView.addObject("message", message);
		return modelAndView;
	}
}
