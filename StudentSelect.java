package com.StudentsInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentSelect {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction(); 
	Student st1=em.find(Student.class, 102);
	if(st1!=null)
	{
		System.out.println("Stuident id: "+st1.getId());
		System.out.println("Student name: "+st1.getName());
		System.out.println("Student Name: "+st1.getAge());
	}
	else System.out.println("Student not Found!!!...");
	}
}
