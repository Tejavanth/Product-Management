package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	    @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return null;
	    }

	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	    	
	    	Class<?>[] classes = {MvcConfiguration.class}; 
	        return classes;
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[] { "/" };
	    }
}
