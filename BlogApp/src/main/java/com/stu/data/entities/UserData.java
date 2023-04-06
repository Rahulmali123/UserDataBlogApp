package com.stu.data.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "UsersData")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserData 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "User_name",nullable = false,length = 100)
	private String name;
	
	@Column(name = "User_Email",length = 100)
	private String email;
	
	@Column(name = "User_Pass",length = 100)
	private String pass;
	
	@Column(name = "User_date",length = 100)
	private Date date;

	@Column(name = "User_phNum",length = 100)
    private String phNum;
	
	@Column(name="User_About",length = 100)
	private String about;

}
