package beckanos.controllers;

import javax.servlet.http.HttpSession;

import beckanos.model.Usuario;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@SessionScoped
@Component
public class Sessao {

	final HttpSession session;

	final static String USUARIO_LOGADO = "usuarioLogado";
	
	public Sessao(HttpSession session) {
		this.session = session;
	}

	public void setUsuarioLogado(Usuario usuario) {
		this.session.setAttribute(USUARIO_LOGADO, usuario);
	}

	public Usuario getUsuarioLogado() {
		return (Usuario) this.session.getAttribute(USUARIO_LOGADO);
	}

	public void logout() {
		this.session.removeAttribute(USUARIO_LOGADO);
	}

}
