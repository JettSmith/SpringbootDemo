package com.zj.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局通用异常处理类
 * @author ZJ
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest req,Exception e) {
		
		return "服务器繁忙";
		
	}
	
}
