package beckanos.model;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class TodosUsuarios  {

	private EntityManager manager;

	TodosUsuarios(EntityManager manager) {
		this.manager = manager;
	}

	public Usuario autenticar(String login, String senha) throws Exception {
		try {
			Usuario usuario = (Usuario) manager
					.createQuery("from Usuario where login = :login and senha = :senha")
					.setParameter("login", login)
					.setParameter("senha", senha)
					.getSingleResult();
					
			return usuario;

		} catch (NoResultException e) {
			manager.getTransaction().rollback();
			throw new Exception("Usuário senha inválidos!");
		} catch (Exception e) {
			manager.getTransaction().rollback();
			throw new Exception("Ocorreu um erro na autenticação.");
		}
	}

	public Usuario loadByNome(String nome) throws Exception {
		try {
			Query query = manager
					.createQuery("from Usuario e where e.nome = :nome")
					.setParameter("nome", nome);
			Usuario usuario = (Usuario) query.getSingleResult();
			return usuario;

		} catch (NoResultException e) {
			manager.getTransaction().rollback();
			throw new Exception("Nenhum resultado!");
		} catch (Exception e) {
			manager.getTransaction().rollback();
			throw new Exception("Ocorreu um erro na busca!");
		}
	}
}
