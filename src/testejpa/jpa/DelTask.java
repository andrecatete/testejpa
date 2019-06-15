package testejpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import testejpa.modelo.Task;

public class DelTask {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tasks2"); 
		EntityManager manager = factory.createEntityManager();
		
		Task taskResult = manager.find(Task.class, 3L);
		
		manager.getTransaction().begin();
		manager.remove(taskResult);
		manager.getTransaction().commit();
		
		System.out.println("Teste DEL com JPA");
		System.out.println("ID da task excluida: " + taskResult.getId());
		
		manager.close();
	}
	
}