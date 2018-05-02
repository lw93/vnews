package com.maven.ssm.config;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maven.ssm.api.vo.ResVNewsVO;
import com.maven.ssm.util.Constant;

/**
 * @Project: vnews
 * @Class: GlobalExceptionHandler.java
 * @Description: 异常过滤配置
 * @Date: 2018年4月1日
 * @author liuwei5
 */
@ControllerAdvice  
//如果返回的为json数据或其它对象，添加该注解  
@ResponseBody 
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)  	
	public Object handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {  
		ResVNewsVO response = new ResVNewsVO();
	    //http://ningandjiao.iteye.com/blog/1995747
		response.setCode(Constant.FAIL_CODE);
		BindingResult bindingResult = e.getBindingResult();		
		FieldError error = bindingResult.getFieldErrors().iterator().next();	
    	response.setMessage(error.getField() + error.getDefaultMessage());
    	return response;
	}  

    @ExceptionHandler(ConstraintViolationException.class)
    public Object handleServiceException(ConstraintViolationException e) {
    	ResVNewsVO response = new ResVNewsVO();
	    //http://blog.csdn.net/JE_GE/article/details/53326516
		response.setCode(Constant.FAIL_CODE);
		Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
		ConstraintViolation<?> violation = violations.iterator().next();
		String message = violation.getMessage();	
    	response.setMessage(violation.getPropertyPath().toString() + message);	    
    	return response;
    }
    
    @ExceptionHandler(Exception.class)
    public Object handleServiceException(Exception e) {
    	ResVNewsVO response = new ResVNewsVO();
		response.setCode(Constant.FAIL_CODE);
		String message = e.getMessage();
    	response.setMessage(message);	    
    	return response;
    }
}
