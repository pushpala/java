package com.bus.login;

import com.bus.dao.RegistartionDAO;
import com.bus.model.Registration;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegistrationController {
	
	@Autowired 
	RegistartionDAO regDAO;

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String openRegPage(Model model) {		
		
		model.addAttribute("reg",new Registration() );
		
		return "Registration";
	}
	
	@RequestMapping(value="regSubmit" , method=RequestMethod.POST)
	public String regSubmitted(@Valid @ModelAttribute("reg") Registration reg, BindingResult bindingResult,  Model model){	
		
		if(bindingResult.hasErrors()){
			return "Registration";
		}
		
		if(bindingResult.hasErrors()){
			return "registration";
		}
		
		String msg =regDAO.addNewUser(reg); 
		
		if(msg.equals("Succesfully registered")){
			return "login";	
		}else{
			model.addAttribute("regError", msg);
			return "registration";
		}			
	}
}
