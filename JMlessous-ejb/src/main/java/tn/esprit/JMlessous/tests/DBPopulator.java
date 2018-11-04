package tn.esprit.JMlessous.tests;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.esprit.JMlessous.interfaces.TodoServiceLocal;
import tn.esprit.JMlessous.persistence.RoleUser;
import tn.esprit.JMlessous.persistence.User;



@Singleton
@Startup
public class DBPopulator {

	@EJB
	TodoServiceLocal userService;

	@PostConstruct
	public void init() {
		/*User client = new User();
		client.setNom("client");
		client.setPassword("client");
		client.setLogin("client");
		client.setPrenom("client");
		client.setMail("client");
		client.setRole(RoleUser.Client);*/
		/*************************/
		/*User adminstrateur = new User();
		adminstrateur.setNom("admin");
		adminstrateur.setPassword("admin");
		adminstrateur.setLogin("admin");
		adminstrateur.setPrenom("admin");
		adminstrateur.setMail("admin");
		adminstrateur.setRole(RoleUser.Administrateur);*/
		/*************************/
		/*userService.addUserTestMethod(client);
		userService.addUserTestMethod(adminstrateur);*/
	}

	/*****************************************************************************
	 *** 								VALIDE 								   ***
	 *****************************************************************************/
}
