package com.cakefresh.dev.exception;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class ControllerExceptionHandler{
	  
		  @ExceptionHandler(ResourceNotFoundException.class)
		  @ResponseStatus(value = HttpStatus.NOT_FOUND)
		  public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
			
		    ErrorMessage message = new ErrorMessage(
		        HttpStatus.NOT_FOUND.value(),
		        new Date(),
		        ex.getMessage(),
		        request.getDescription(false));
		    
		    return message;
		  }
		  
		  @ExceptionHandler(Exception.class)
		  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
		  public ErrorMessage globalExceptionHandler(Exception ex, WebRequest request) {
			System.out.println(ex);
		    ErrorMessage message = new ErrorMessage(
		        HttpStatus.INTERNAL_SERVER_ERROR.value(),
		        new Date(),
		        ex.getMessage(),
		        request.getDescription(false));
		    
		    return message;
		  }
	  
		  @ExceptionHandler(MethodArgumentNotValidException.class)
		  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
		  public ResponseEntity<?> notValid(MethodArgumentNotValidException ex, WebRequest request) {
		    	
		        List<String> errors = new ArrayList<>();
	
		        ex.getAllErrors().forEach(err -> errors.add(err.getDefaultMessage()));
	
		        Map result = new HashMap<>();
		        result.put("statusCode", HttpStatus.BAD_REQUEST);
		        result.put("timeStamp", new Date());
		        result.put("errors", errors);
		        result.put("message", ((WebRequest) request).getDescription(false));
		        
		        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
		  }
}
