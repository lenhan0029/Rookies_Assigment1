package com.shoes_store.lenhan.exceptions;

public class brandNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public brandNotFoundException() {
		super();
	}

	public brandNotFoundException(String message) {
		super(message);
	}

	public brandNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
