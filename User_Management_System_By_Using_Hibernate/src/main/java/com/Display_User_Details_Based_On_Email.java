package com;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Display_User_Details_Based_On_Email {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = "select user from User_Information user where user.email = ?1";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Database_Properties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery(select);
		System.out.println("Enter user email id : ");
		String email = sc.next();
		query.setParameter(1, email);
		Object result = query.getSingleResult();
		System.out.println(result);
		et.commit();
		em.clear();
		sc.close();
	}
}