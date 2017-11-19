package com.netflixeEureka.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@RequestMapping("/appointment/get")
	public String getAppointmrnt() {
		return "showing appointment detail";
	}

}
