package com.codewritedevelopment.EvaAircraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.codewritedevelopment.EvaAircraft.Service.AcftApuEngineAlertServiceImpl;
import com.codewritedevelopment.EvaAircraft.Service.AcftServiceImpl;
import com.codewritedevelopment.EvaAircraft.Service.AcftSgnfctEqptServiceImpl;
import com.codewritedevelopment.EvaAircraft.entities.Acft;
import com.codewritedevelopment.EvaAircraft.entities.AcftApuEngineAlert;
import com.codewritedevelopment.EvaAircraft.entities.AcftSgnfctEqpt;

@Controller
@RequestMapping(path = "/demo")
public class MainController {

	@Autowired
	private AcftServiceImpl acftService;
	
	@Autowired
	private AcftApuEngineAlertServiceImpl acftApuEngineService;
	
	

	@Autowired
	private AcftSgnfctEqptServiceImpl acftSgnfctEqptService;
	
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Acft> getAllUsers() {
		// This returns a JSON or XML with the users
		System.out.println("hi...");
		return acftService.getAircraft();
	}
	
	@GetMapping(path="/craft")
	public @ResponseBody Iterable<AcftApuEngineAlert> getAllCraft() {
		// This returns a JSON or XML with the users
		System.out.println("hi.two..");
		return acftApuEngineService.getAlerts();
	}
	
	@GetMapping(path="/eqpt")
	public @ResponseBody Iterable<AcftSgnfctEqpt> getAllEqpt() {
		// This returns a JSON or XML with the users
	 
		return acftSgnfctEqptService.getEqptList();
	}
	
	@GetMapping(path="/acftList")
	public ModelAndView viewAll(ModelAndView modelAndView) {		
		modelAndView.setViewName("acft");
		modelAndView.getModel().put("acftList", acftService.getAircraft() );			
		System.out.println("Returning " + acftService.getAircraft().size() + " Acft to acft.jsp");						
		return modelAndView;
	}
	
	@GetMapping(path="/acftL")
	public ModelAndView viewAllList(ModelAndView modelAndView) {		
		modelAndView.setViewName("Aircraft");	
		modelAndView.getModel().put("acftList", acftService.getAircraft() );			
		System.out.println("Returning " + acftService.getAircraft().size() + " Acft to acft.jsp");						
		return modelAndView;
	}
	
	@GetMapping(path="/acftengine")
	public ModelAndView viewAllEngineList(ModelAndView modelAndView) {		
		modelAndView.setViewName("Engine");	
		modelAndView.getModel().put("engList", acftApuEngineService.getAlerts() );			
		System.out.println("Returning " + acftApuEngineService.getAlerts().size() + " Engine");
		
		
		List<AcftApuEngineAlert> theList = acftApuEngineService.getAlerts();
		
		
		for (AcftApuEngineAlert acftApuEngineAlert : theList) {
			System.out.println(acftApuEngineAlert);
			
		}
		
		System.out.println(modelAndView);
	 
		return modelAndView;
	}
	
	
	@GetMapping(path="/acftsgnfct")
	public ModelAndView viewAllSgnfctList(ModelAndView modelAndView) {		
		modelAndView.setViewName("Sign");	
		modelAndView.getModel().put("sgnList", acftSgnfctEqptService.getEqptList());			
		System.out.println("Returning " + acftSgnfctEqptService.getEqptList().size() + " Engine");
		
		System.out.println(modelAndView);
	 
		return modelAndView;
	}
}
