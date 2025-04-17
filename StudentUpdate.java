package com.StudentsInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentUpdate {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction(); 
	Student st1=em.find(Student.class, 102);
	if(st1!=null)
	{
		st1.setAge(24);
		et.begin();
		em.merge(st1);
		et.commit();
		System.out.println("Data Updated");
	}
	else System.out.println("Id Not Found");
	}
}
