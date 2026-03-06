package com;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete_By_Using_Email {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String delete = "delete from User_Information user where user.email = ?1";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Database_Properties");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query query = em.createQuery(delete);
		System.out.println("Enter user email id : ");
		String email = sc.next();
		query.setParameter(1, email);
		int result = query.executeUpdate();
		if(result != 0) {
			System.out.println("Data deleted");
		}else {
			System.out.println("No data deleted");
		}
		et.commit();
		em.clear();
		sc.close();
	}
}