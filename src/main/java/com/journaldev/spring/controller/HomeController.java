package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.taglibs.standard.lang.jstl.EqualsOperator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.journaldev.spring.model.Addition;
import com.journaldev.spring.model.User;

@Controller
public class HomeController {
	Map<String, String> hm=new HashMap();
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "firstpage";
	}

//	@RequestMapping(value = "/user", method = RequestMethod.POST)
//	public String user(@Validated User user, Model model) {
//		System.out.println("User Page Requested");
//		model.addAttribute("userName", user.getUserName());
//		return "user";
//	}
	@RequestMapping(value= "/add", method = RequestMethod.POST)
	public String addition( @RequestParam("num1")  int i, @RequestParam("num2")  int j ,Model model) {
		//Addition sum1= new Addition(i,j);
		model.addAttribute("result", i+j);
		return "resultPage";
	}
  @RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("userid") String username,  @RequestParam("pass") String password , Model model ) {
	  hm.put(username, password);
	  System.out.println("username:"+username);
	  return "register";
  }
  
  
  @RequestMapping(value = "/signup", method = RequestMethod.GET)
 	public String signup( Model model ) {
 	  return "signup";
   }
	
  @RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String sigin( Model model ) {
	  return "signin";
 }
  
  
  @RequestMapping(value = "/detail", method = RequestMethod.POST)
	public String success(@RequestParam("exisuserid") String existuserid,  @RequestParam("existpass") String existpassword , Model model ) {
	  
	  System.out.println("username:"+existuserid);
	  if(hm.containsKey(existuserid)&&existpassword.equals(hm.get(existuserid)))
	   return "detail";
	  else{
		  model.addAttribute("msg", "UserId or Password is incorrect");
		return "signin";  
	  }
  }
  
	
	
	
	
	
	
	
	
	
	

	
}
