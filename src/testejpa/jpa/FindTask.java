package testejpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import testejpa.modelo.Task;

public class FindTask {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tasks2"); 
		EntityManager manager = factory.createEntityManager();
		
		Task resultTask = manager.find(Task.class, 1L);
		System.out.println("ID e descrição da Task pesquisada: " + resultTask.getId() + " / " + resultTask.getDescricao());
		
		manager.close();
	}
	
}