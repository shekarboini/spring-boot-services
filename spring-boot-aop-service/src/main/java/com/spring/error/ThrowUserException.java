package com.spring.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThrowUserException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(ThrowUserException.class);
	
	public ThrowUserException(String msg) {
		log.error("ISSUE: {}", msg);
	}

}
