package com.emp.employee1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Employee {
	
	private long empId;
	private String name;
	private double salary;
	
	//entity reference
	Address address;//HAS-A relationship

}
