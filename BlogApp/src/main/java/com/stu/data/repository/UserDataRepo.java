package com.stu.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stu.data.entities.UserData;

public interface UserDataRepo extends JpaRepository<UserData, Integer>
{

}
