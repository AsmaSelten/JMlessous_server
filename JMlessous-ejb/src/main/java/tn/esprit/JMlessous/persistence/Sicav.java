package tn.esprit.JMlessous.persistence;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("sicav")
public class Sicav extends Titre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	double prixSicav; 

}
