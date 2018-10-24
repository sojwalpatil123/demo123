package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ServiceInterface.ServiceI;
import com.model.Login;
import com.model.User;



@Controller
public class Homecontroller {

	@Autowired
	ServiceI service;
	
	@RequestMapping("/")
	public String loginPage()
	{
		
		System.out.println("login page");
		
		return "Login";
	}
	
	@RequestMapping("/register")
	public String RegisterPage()
	{
		
		System.out.println("register page");
		
		return "User";
	}
	
	@RequestMapping("/Register")
	public ModelAndView RegisterData(@ModelAttribute User u,@ModelAttribute Login l)
	{
		
		
		u.setLogin(l);
		System.out.println("Data Register to enter");
		User us=service.SaveData(u);
		if(us!=null)
		{
			
			return new ModelAndView("Login","msg","Data Saved");
		}
		else
		{
			
			return new ModelAndView("Register");
			
		}
		
	}
		
	
	
	
	@RequestMapping("/login")
public ModelAndView Login(@ModelAttribute User u,@ModelAttribute Login l)
{
		
	System.out.println("in login");
	Login lo=service.findAllByUsernameAndPassword(l.getUsername(),l.getPassword());
	
	if(lo!=null)
	{
		
	List<User> li=service.getAll();
	return new ModelAndView("Success","list",li);
		
		
	}
	else
	{
		return new ModelAndView("Login","msg","Incorrect username and password");
	}
	
		
}
	
	@RequestMapping("/del")
	public ModelAndView delete(@ModelAttribute User u,@ModelAttribute Login l)
	
	{
		
		u.setLogin(l);
		List<User> li=service.delete(u);
		
		return new ModelAndView("Success","list",li);
		
	}

	
	@RequestMapping("/edit")
	public ModelAndView edit(@ModelAttribute User u,@ModelAttribute Login l)
	{
		
		u.setLogin(l);
		User us=service.edit(u);
		
		
			
			return new ModelAndView("edit","eds",us);

		
		
	}
		
	@RequestMapping("/update")
	public ModelAndView update(@ModelAttribute User u,@ModelAttribute Login l)

	{
		
		u.setLogin(l);
		List<User> li=service.Update(u);
		return new ModelAndView("Success","list",li);
		
		
	}
		
	
	
	
	
	
}
