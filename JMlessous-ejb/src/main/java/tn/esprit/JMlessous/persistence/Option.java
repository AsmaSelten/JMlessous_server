package tn.esprit.JMlessous.persistence;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("option")
public class Option extends Titre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	double prixAchat;

}
