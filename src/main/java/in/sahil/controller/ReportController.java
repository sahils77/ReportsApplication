package in.sahil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.sahil.request.SearchRequest;
import in.sahil.service.ReportServiceImpl;

@Controller
public class ReportController 
{
    @Autowired
	private ReportServiceImpl service;
    
    @GetMapping("/")
    public String indexPage(Model model)
    {
    	SearchRequest search=new SearchRequest();
    	
    	model.addAttribute("search", search);
    	model.addAttribute("names", service.getPlanNames());
    	model.addAttribute("status", service.getPlanStatus());
    	return "index";
    }
	
}
