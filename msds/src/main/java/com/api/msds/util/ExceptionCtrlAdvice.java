package com.api.msds.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.api.msds.domain.ErrorResult;

@RestControllerAdvice
public class ExceptionCtrlAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(RestApiException.class)
    protected ErrorResult handleCustomException(RestApiException ex) {
       return new ErrorResult(ex.getErrorCode(), "잘못된 입력 값입니다.");
    };
	
    /*
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(IllegalArgumentException.class)
	public ErrorResult illegalExHandle() {
		return new ErrorResult("BAD", "잘못된 입력 값입니다.");
	}
	*/

	
}
