package beckanos.controllers;

import beckanos.model.TodosUsuarios;
import beckanos.model.Usuario;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class IndexController {

	Result result;
	Sessao sessao;
	TodosUsuarios todosUsuarios;
	
	public IndexController (Result result, Sessao sessao, TodosUsuarios todosUsuarios) {
		this.result = result;
		this.sessao = sessao;
		this.todosUsuarios = todosUsuarios;
	}
	
	@Path("/home")
	public void home() {
	}
	
	@Path("/logout")
	public void logout() {
		sessao.logout();
		result.redirectTo(IndexController.class).login();	
	}
	
	@Path("/login")
	public void login() {
	}
	
	@Path("/autenticar")
	@Post
	public void autenticar(String login, String senha) {
		try {
			Usuario usuarioAutenticado = todosUsuarios.autenticar(login, senha);
			sessao.setUsuarioLogado(usuarioAutenticado);
			result.redirectTo(IndexController.class).home();
		} catch (Exception e) {
			result.include("erro", e.getMessage());
			result.forwardTo(IndexController.class).login();
		}
	}

}