package com.per;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToManyMain 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Person person1=new Person();
	person1.setName("srikanth");
	person1.setPhno(7780504072l);
	
	Person person2=new Person();
	person2.setName("sumanth");
	person2.setPhno(7032833574l);
	
	Person person3=new Person();
	person3.setName("chandra");
	person3.setPhno(7788992222l);
	
	Cab cab1=new Cab();
	cab1.setDname("harish");
	cab1.setCost(2000);
	
	Cab cab2=new Cab();
	cab2.setDname("surendra");
	cab2.setCost(4000);
	
	Cab cab3=new Cab();
	cab3.setDname("aravind");
	cab3.setCost(1000);
	
	Cab cab4=new Cab();
	cab4.setDname("guru");
	cab4.setCost(6000);
	
	List<Cab> list1=new ArrayList<Cab>();
	list1.add(cab3);
	list1.add(cab2);
	list1.add(cab1);
	
	List<Cab> list2=new ArrayList<Cab>();
	list2.add(cab1);
	list2.add(cab4);
	list2.add(cab1);
	
	List<Cab> list3=new ArrayList<Cab>();
	list3.add(cab3);
	list3.add(cab2);
	
	List<Cab> list4=new ArrayList<Cab>();
	list4.add(cab3);
	list4.add(cab2);
	list4.add(cab1);
	
	person1.setCabs(list1);
	person2.setCabs(list2);
	person3.setCabs(list3);
	
	entityTransaction.begin();
	entityManager.persist(person1);
	entityManager.persist(person2);
	entityManager.persist(person3);
	entityManager.persist(cab1);
	entityManager.persist(cab2);
	entityManager.persist(cab3);
	entityManager.persist(cab4);
	entityTransaction.commit();
	
}
}
