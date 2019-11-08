package com.java.factorypattern.exceptions;

public class CustomCheckException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public CustomCheckException(String exception, Throwable error) {
		super(exception, error);
	}
}
