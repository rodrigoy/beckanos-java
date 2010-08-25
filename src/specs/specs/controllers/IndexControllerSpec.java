package specs.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import beckanos.controllers.IndexController;
import beckanos.controllers.Sessao;
import beckanos.model.TodosUsuarios;
import beckanos.model.Usuario;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.util.test.MockResult;


public class IndexControllerSpec {
	
	Result result;
	Sessao sessao;
	TodosUsuarios todosUsuarios;
	
	@Before
	public void criarMocks() throws Exception {
		todosUsuarios = Mockito.mock(TodosUsuarios.class);
		sessao = Mockito.mock(Sessao.class);
		result = new MockResult();
		
		Mockito.when(todosUsuarios.autenticar("jose", "teste123")).thenReturn(new Usuario());
		Mockito.when(todosUsuarios.autenticar("jose", "blablabla")).thenThrow(new Exception("Senha inválida"));
	}
	
	@Test
	public void devePermitirLoginComUsuarioESenhaValido() {
		IndexController controller = new IndexController(result, sessao, todosUsuarios);
		controller.autenticar("jose", "teste123");
	}
	
	@Test
	public void deveRecusarLoginComUsuarioOuSenhaInvalido() {
		IndexController controller = new IndexController(result, sessao, todosUsuarios);
		controller.autenticar("jose", "blablabla");
	}
	

}
