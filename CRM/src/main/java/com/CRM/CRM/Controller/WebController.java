package com.CRM.CRM.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping(value = "/{path:[^\\.]*}")
	public String forwardToAngular() {
		return "forward:/index.html";
	}
}