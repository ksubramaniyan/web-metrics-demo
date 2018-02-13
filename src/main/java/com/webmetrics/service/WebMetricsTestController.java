package com.webmetrics.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebMetricsTestController {
	
	@RequestMapping("api/getDelayed")
	public String getDelayedServerResponse(@RequestParam(value = "delay", required = false) String delay) {
		int iDelay = 0 ; 
		try {
			if (delay != null && delay.trim().length() != 0) {
				iDelay = Integer.parseInt(delay);
				Thread.sleep(iDelay);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "response delayed for " + iDelay +" milliseconds";
	}
	
	@RequestMapping("api/getDelayed/v1/{delay}")
	public String getDelayedServerResponsePath(@PathVariable(value = "delay") String delay) {
		int iDelay = 0 ; 
		try {
			if (delay != null && delay.trim().length() != 0) {
				iDelay = Integer.parseInt(delay);
				Thread.sleep(iDelay);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "response delayed for " + iDelay +" milliseconds";
	}
}
