package com.khadri.spring.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.khadri.spring.rest.entity.Student;

@Service
public class StudentService {

	@Autowired
	private RestTemplate restTemplate;

	public void getAllStudentInformation() {

		// call producer service ???
		// http://localhost:8080/A2022_Spring_REST_Basic2/register/view

		ResponseEntity<Student> responseEntity = restTemplate
				.getForEntity("http://localhost:8080/A2022_Spring_REST_CRUD_Produce2/register/view", Student.class);
		Student std = responseEntity.getBody();

		System.out.println(std);
	}
}
