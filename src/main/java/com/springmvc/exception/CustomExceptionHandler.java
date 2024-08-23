package com.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	@ExceptionHandler(NumberFormatException.class)
	public String numberExcption() {

		return "error";
	}

	@ExceptionHandler(NullPointerException.class)
	public String nullPointerExcption() {

		return "error";
	}

	// All Exception handle by this method
	@ExceptionHandler(Exception.class)
	public String allException() {
		return "error";
	}
}
