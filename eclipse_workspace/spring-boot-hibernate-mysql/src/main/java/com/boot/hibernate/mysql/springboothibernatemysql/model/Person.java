package com.boot.hibernate.mysql.springboothibernatemysql.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter // from lombok
@Getter // from lombok
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date dob;
}
