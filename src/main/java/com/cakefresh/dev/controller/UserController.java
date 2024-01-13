package com.cakefresh.dev.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

//import org.hibernate.usertype.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cakefresh.dev.models.UserTypeJPA;
import com.cakefresh.dev.payload.response.MessageResponse;
import com.cakefresh.dev.repository.UserTypeRepository;
import com.cakefresh.dev.request.wrapper.UserDetailsWrapper;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;

import com.cakefresh.dev.exception.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/rest-api/v1.0/users")
public class UserController {
	
}
