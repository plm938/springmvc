package com.atguigu.springmvc.test;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.FORBIDDEN, reason="sdd!")
public class UserNameNotMatchPasswordException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	
}
