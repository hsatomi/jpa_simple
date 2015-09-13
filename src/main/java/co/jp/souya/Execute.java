package co.jp.souya;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

public class Execute {

	@Test
	public void test1(){

		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();

		TestCase padmin = em.find(TestCase.class, 1);



		
		
		em.close();
		emf.close();	
		
		
		
		
		
		System.out.println("test");
	}
	
	
}
