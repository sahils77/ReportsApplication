package in.sahil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.sahil.service.ReportServiceImpl;

@Controller
public class ReportController 
{
    @Autowired
	private ReportServiceImpl service;
    
    @GetMapping("/")
    public String indexPage()
    {
    	return "index";
    }
	
}
