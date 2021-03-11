package com.jcg.springmvc.mongo.controller;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

//import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jcg.springmvc.mongo.User;
import com.jcg.springmvc.mongo.UserService;

import javax.swing.*;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;


@Controller
@RequestMapping("/user")
public class UserController {

	private static Logger log = Logger.getLogger(UserController.class);
	public static File f;

	//@Resource(name="userService")
	@Autowired
	private UserService userService;

	// Displaying the initial users list.
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getPersons(Model model) {
		log.debug("Request to fetch all users from the mongo database");
		List<User> user_list = userService.getAll();		
		model.addAttribute("users", user_list);
		return "index";
		//return "welcome";
	}

	@RequestMapping(value = "/ba", method = RequestMethod.GET)
	public String getba(Model model) throws IOException {
		Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"https://drive.google.com/file/d/1VaYjbgCH0OmUMSfiftEdO02GLp7HopVQ/view?usp=sharing");
			desktop.browse(oURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping(value = "/vbm", method = RequestMethod.GET)
	public String getvmb(Model model) throws IOException {
		Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"https://drive.google.com/file/d/1KF7a9Y3LdrZ2MgFwPro4NOG0YMcprER1/view?usp=sharing");
			desktop.browse(oURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping(value = "/vam", method = RequestMethod.GET)
	public String getvam(Model model) throws IOException {
		Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"https://drive.google.com/file/d/1nd3Jle0ry8X3InRdCQXftoWFSekuCXHK/view?usp=sharing");
			desktop.browse(oURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping(value = "/tbm", method = RequestMethod.GET)
	public String gettbm(Model model) throws IOException {
		Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"https://drive.google.com/file/d/1bPCRJLpxe-XxWj7er75bUVvOFlIrA-qi/view?usp=sharing");
			desktop.browse(oURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping(value = "/tam", method = RequestMethod.GET)
	public String gettam(Model model) throws IOException {
		Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"https://drive.google.com/file/d/1vuaDjJg6BX4J710-mgSpsrjcfSAJ9IM4/view?usp=sharing");
			desktop.browse(oURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping(value = "/tabm", method = RequestMethod.GET)
	public String gettabm(Model model) throws IOException {
		Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"https://drive.google.com/file/d/1uyg0jmaX6j_qjaozRPKRE6GEMr4NMCyp/view?usp=sharing");
			desktop.browse(oURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping(value = "/taam", method = RequestMethod.GET)
	public String gettaam(Model model) throws IOException {
		Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"https://drive.google.com/file/d/1oqiLSMpsH4PRKNNZwH61HtoO3wCup6ll/view?usp=sharing");
			desktop.browse(oURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}

	@RequestMapping(value = "/fr", method = RequestMethod.GET)
	public String getfr(Model model) throws IOException {
		Desktop desktop = java.awt.Desktop.getDesktop();
		try {
			//specify the protocol along with the URL
			URI oURL = new URI(
					"https://drive.google.com/file/d/1ElVYIRcDB3xE8FTR8MHYMT4_wXUZLAMy/view?usp=sharing");
			desktop.browse(oURL);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "index";
	}





		/*@RequestMapping(value = "/vbm", method = RequestMethod.GET)
	public String getvbm(Model model) throws IOException {
		f = new File("C:\\Users\\dayan\\amongodb\\a\\301_project\\images\\vbm.png");
		Desktop dt = Desktop.getDesktop();
		dt.open(f);
		return "index";
	}*/


	/*
	// Opening the add new user form page.
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser(Model model) {
		log.debug("Request to open the new user form page");
		model.addAttribute("userAttr", new User());
		return "form";
	}

	// Opening the edit user form page.
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editUser(@RequestParam(value="id", required=true) String id, Model model) {
		log.debug("Request to open the edit user form page");	
		model.addAttribute("userAttr", userService.findUserId(id));		
		return "form";
	}

	// Deleting the specified user.
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam(value="id", required=true) String id, Model model) {
		userService.delete(id);
		return "redirect:list";
	}

	// Adding a new user or updating an existing user.
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("userAttr") User user) {
		if(user.getId() != null && !user.getId().trim().equals("")) {
			userService.edit(user);
		} else {
			userService.add(user);
		}
		return "redirect:list";
	}*/
}