package com.untilwed.studyingjpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudyingjpaApplication {


	public static void main(String[] args) {
		SpringApplication.run(StudyingjpaApplication.class, args);
	}
}
