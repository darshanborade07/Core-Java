package com.app.custom_exception;

public class AuthorizationException extends RuntimeException {
	public AuthorizationException(String msg) {
		super(msg);
	}
}
