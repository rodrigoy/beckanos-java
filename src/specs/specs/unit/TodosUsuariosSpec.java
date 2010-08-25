package specs.unit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import beckanos.model.TodosUsuarios;


public class TodosUsuariosSpec {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
	EntityManager manager = emf.createEntityManager();
	
	@Test
	public void deveLogarComSucesso() throws Exception {
		TodosUsuarios todosUsuarios = new TodosUsuarios(manager);
		todosUsuarios.autenticar("admin", "teste123");
	}
	
	@Test(expected=Exception.class)
	public void deveRecusarLoginErrado() throws Exception {
		TodosUsuarios todosUsuarios = new TodosUsuarios(manager);
		todosUsuarios.autenticar("admin", "bla bla bla");
	}	

}
