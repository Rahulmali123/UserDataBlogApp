package com.stu.data.payload;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDataDto 
{
	private int id;
	
	@NotBlank
	@Size(min = 3,message = "min 3 char only")
	private String name;
	
	@NotBlank
	 @Email(message="Enter valid Email Id.")
	private String email;
	
	 @Pattern(regexp="^[a-zA-Z0-9]{4}",message="length must be 4") 
	private String pass;
	
	
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date date;

	@Digits(message="Number should contain 10 digits.", fraction = 0, integer = 10)
	private String phNum;
	

	
	@NotBlank
	private String about;


}
