//driver class
//Program to demonstrate on TablePerClass Inheritance


package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		Employee1 e3=new Employee1();
		e3.setId(161);
		e3.setName("Bhushan Shinde");
		e3.setSalary(35000.70f);
		em.persist(e3);
		
		//second emp
		Employee1 e4=new Employee1();
		e4.setId(162);
		e4.setName("Gauri Kolhe");
		e4.setSalary(45000.50f);
		em.persist(e4);
		
		//first Manager
		Manager1 m1=new Manager1();
		m1.setId(602);
		m1.setName("Pratik More");
		m1.setSalary(52000.45f);
		m1.setDeptid(45);
		m1.setDeptname("Finance");
		em.persist(m1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();


	}

}
