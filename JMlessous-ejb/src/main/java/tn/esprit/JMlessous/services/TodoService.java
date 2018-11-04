package tn.esprit.JMlessous.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.JMlessous.interfaces.TodoServiceLocal;
import tn.esprit.JMlessous.persistence.User;

@Stateless
public class TodoService implements TodoServiceLocal {

	@PersistenceContext(unitName = "JMlessous-ejb")
	EntityManager em;
	
	@Override
	public void addUserTestMethod(User u) {
		em.persist(u);
		
	}

}
