package com.bootstrap.bootstrap_study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtr {
	
	@RequestMapping(value = "index")
	public String Home() {
		return "view/index";
	}
	
	@RequestMapping(value = "about")
	public String about() {
		return "view/about";
	}
	
	@RequestMapping(value = "blog")
	public String blog() {
		return "view/blog";
	}
	
	@RequestMapping(value = "blog-single")
	public String blog_single() {
		return "view/blog-single";
	}
	
	@RequestMapping(value = "contact")
	public String contact() {
		return "view/contact";
	}
	
	@RequestMapping(value = "portfolio")
	public String portfolio() {
		return "view/portfolio";
	}
	
	@RequestMapping(value = "portfolio-details")
	public String portfolio_details() {
		return "view/portfolio-details";
	}
	
	@RequestMapping(value = "services")
	public String services() {
		return "view/services";
	}
	
	@RequestMapping(value = "team")
	public String team() {
		return "view/team";
	}
}
