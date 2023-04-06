package com.stu.data.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stu.data.entities.UserData;
import com.stu.data.payload.UserDataDto;
import com.stu.data.repository.UserDataRepo;
import com.stu.data.service.UserDataService;

@Service
public class UserDataServiceImpl implements UserDataService
{
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserDataRepo userDataRepo;
	
	
	public UserData DtotoUser(UserDataDto userDataDto)
	{
		UserData userData = this.modelMapper.map(userDataDto, UserData.class);
		return userData;
		
	}
	
	public UserDataDto UsertoDto(UserData userData)
	{
		 UserDataDto userDataDto = this.modelMapper.map(userData, UserDataDto.class);
		return userDataDto;
		
	}

	@Override
	public UserDataDto createUserData(UserDataDto userDataDto) 
	{
		UserData userData = this.modelMapper.map(userDataDto, UserData.class);
		 UserData addUserData = this.userDataRepo.save(userData);
		return this.modelMapper.map(addUserData, UserDataDto.class);
		
	}

}
