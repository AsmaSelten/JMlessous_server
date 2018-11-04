package tn.esprit.JMlessous.persistence;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "nom", nullable = true, length = 50)
	private String nom;
	
	@Column(name = "adresse", nullable = true, length = 250)
	private String adresse;

	@Column(name = "prenom", nullable = true, length = 50)
	private String prenom;

	// login
	@Column(name = "login", nullable = true, length = 50, unique = true)
	private String login;

	// password
	@Column(name = "password", nullable = true, length = 50)
	private String password;

	// activate
	@Column(name = "activate", nullable = true)
	private int activate;

	// code
	@Column(name = "code", nullable = true, length = 50)
	private String code;

	// phoneNumber
	@Column(name = "telephone", nullable = true, length = 9)
	private String telephone;

	// mail
	@Column(name = "mail", nullable = true, length = 50)
	private String mail;
	
	private RoleUser role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActivate() {
		return activate;
	}

	public void setActivate(int activate) {
		this.activate = activate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public RoleUser getRole() {
		return role;
	}

	public void setRole(RoleUser role) {
		this.role = role;
	}


	

	


}
