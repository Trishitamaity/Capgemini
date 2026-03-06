package com;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Display_User_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = "select user from User_Information user";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Database_Properties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery(select);
		List<User_Information> list = query.getResultList();
		System.out.println(list);
		et.commit();
		em.clear();
		sc.close();
	}
}