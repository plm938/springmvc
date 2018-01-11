package com.atguigu.springmvc.crud.entities;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Past;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Administrator
 */
@Data
public class Employee {

	private Integer id;
	@NotEmpty
	@Digits(integer=10,fraction=10, message = "不是数字")
	private String lastName;

	@Email
	private String email;
	/**1 male, 0 female*/
	private Integer gender;

	private Department department;

	@Past(message = "birth必须是过去的时间")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	
	@NumberFormat(pattern="#,###,###.#")
	private Float salary;

	public Employee(Integer id, String lastName, String email, Integer gender,
			Department department) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.department = department;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
