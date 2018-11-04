package tn.esprit.JMlessous.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.JMlessous.persistence.User;


@Local
public interface TodoServiceLocal {
	void addUserTestMethod(User u);
	

}
