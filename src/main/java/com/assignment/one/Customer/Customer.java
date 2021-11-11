package com.assignment.one.Customer;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Setter
@Getter
@Entity
@Table(name="customer_table")
public class Customer {
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	
	@NotBlank(message="mandatory field")
	private String name;
	
	
	@NotBlank(message="mandatory field")
	private String address;
	

	
	
	

}
