package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.patient;

public class patientDao {
	  EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev"); 
	   EntityManager entityManager=entityManagerFactory.createEntityManager();
	   EntityTransaction entityTransaction=entityManager.getTransaction();
	   
	   
//	   to delete the data we use below code  
//	   public void remove(int id) {
//			// TODO Auto-generated method stub
//			patient p=entityManager.find(patient.class,id);
//			 entityTransaction.begin();	  
//			   entityManager.remove(p);
//			   entityTransaction.commit(); 
//		}
//		
//	}

//the below code is used to insert the value
public void insert(patient patient){
	   entityTransaction.begin();
	   entityManager.persist(patient);
	   entityTransaction.commit();   
}
}		



//	   the below code is used to update the data in database
//	   public void update(int id,long phnumber){
//		   patient p=entityManager.find(patient.class, id);
//		   p.setPhnumber(phnumber);
//		   entityTransaction.begin();
//		  
//		   entityManager.merge(p);
//		   entityTransaction.commit();   
//	   }
	

	
		



