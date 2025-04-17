package com.StudentsInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentInsert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction(); 
	Student st1=new Student();
	st1.setId(105);
	st1.setName("Nirmala");
	st1.setAge(27);
	et.begin();
	em.persist(st1);
	System.out.println("Data Saved!!!");
	et.commit();

	}
}
