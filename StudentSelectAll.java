package com.StudentsInfo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class StudentSelectAll {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("balu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction(); 
	String hql="from Student";
	Query query=em.createQuery(hql);
	List<Student> stu=query.getResultList();
	for(Student s:stu)
	{
		System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
	}
	}
}
