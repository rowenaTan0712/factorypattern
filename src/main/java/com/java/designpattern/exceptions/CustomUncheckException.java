package com.java.designpattern.exceptions;

public class CustomUncheckException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomUncheckException(String exception, Throwable error) {
		super(exception, error);
	}

}
