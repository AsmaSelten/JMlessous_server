package com.github.adminfaces.starter.infra.security;

import com.github.adminfaces.template.session.AdminSession;

import tn.esprit.JMlessous.persistence.RoleUser;
import tn.esprit.JMlessous.persistence.User;
import tn.esprit.JMlessous.services.UserService;

import org.omnifaces.util.Faces;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Specializes;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;


/**
 * Created by rmpestano on 12/20/14.
 *
 * This is just a login example.
 *
 * AdminSession uses isLoggedIn to determine if user must be redirect to login page or not.
 * By default AdminSession isLoggedIn always resolves to true so it will not try to redirect user.
 *
 * If you already have your authorization mechanism which controls when user must be redirect to initial page or logon
 * you can skip this class.
 */
@Named
@SessionScoped
@Specializes
@ManagedBean
public class LogonMB extends AdminSession implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String currentUser;
    private String email;
    private String password;
    private boolean remember;
    private String role;
    
    @EJB
	UserService userService;
   

	public static User user;



    public void login() throws IOException {
		currentUser = email;
		user = userService.authenticate(email, password);
		role= "Client";
		if (user == null)
			return;
		Faces.getExternalContext().getFlash().setKeepMessages(true);
		if (user.getRole() == RoleUser.Client){
			role= "Client";
			Faces.redirect("client/clientHome.jsf");
			
		}
		else {
			role= "Administrateur";
			Faces.redirect("administrateur/adminHome.jsf");
			
		}
	}


    @Override
    public boolean isLoggedIn() {

    	
        return currentUser != null;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }
    
    public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
}
