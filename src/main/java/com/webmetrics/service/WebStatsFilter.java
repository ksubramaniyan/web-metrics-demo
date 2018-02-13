package com.webmetrics.service;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WebStatsFilter implements Filter {

	public void destroy() {
		System.out.println("WebStats -> destroy()");		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("WebStats -> doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)");	
		arg2.doFilter(arg0, arg1);
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("WebStats -> init(FilterConfig arg0)");	
		
	}

}
