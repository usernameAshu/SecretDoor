package com.mohanty.secretdoor.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SecretExceptionResponse {

	private String message;
	private String hint;
	private String support;

}
