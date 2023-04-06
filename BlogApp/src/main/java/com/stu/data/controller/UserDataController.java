package com.stu.data.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stu.data.payload.UserDataDto;
import com.stu.data.service.UserDataService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/UserData/")
public class UserDataController 
{
	
	
	@Autowired
	private UserDataService userDataService;
	
	private static final Log LOGGER= LogFactory.getLog(UserDataController.class);
	
	@PostMapping("/")
	public ResponseEntity<UserDataDto> createUserData( @RequestBody  @Valid UserDataDto userDataDto)
	{
		UserDataDto createUserData = this.userDataService.createUserData(userDataDto);
		
		LOGGER.info("inside the UserData Sucessfully insert >>>> "+createUserData);
		return new ResponseEntity<UserDataDto>(createUserData, HttpStatus.CREATED);
	}

}
