package com.example.demo.emp.service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmpVO {
    
    String employeeId;
	String firstName;
	String lastName;
	String email;
	
	//@JsonFormat(pattern = "yyyy-MM-dd HH")
	String hireDate;   //LocalDateTime  , Date
	
	String jobId;
	String departmentId;
	Integer salary;
	
	@JsonIgnore 
	Integer[] employeeIds;
}
