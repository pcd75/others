package com.nath.webservice.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDetails {
	//timestamp
	private LocalDateTime timeStamp;
	
	//message
	private String message;
	
	//details
	private String details;

}
