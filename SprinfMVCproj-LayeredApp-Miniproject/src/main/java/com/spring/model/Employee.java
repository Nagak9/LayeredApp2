package com.spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Table(name="emp")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Employee {
	@Id
	@SequenceGenerator(name="gen1",sequenceName="emp_id_seq",initialValue=1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer emono;
	@NonNull
	@Column(length=20)
	private String ename;
	@NonNull
	@Column(length=20)
	private String job;
	@NonNull
	private Float sal;
	@NonNull
	private Integer deptno;
	
	
	

}
