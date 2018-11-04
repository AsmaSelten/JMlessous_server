package tn.esprit.JMlessous.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Credit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getProduit() {
		return produit;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getMontantTransaction() {
		return montantTransaction;
	}

	public void setMontantTransaction(double montantTransaction) {
		this.montantTransaction = montantTransaction;
	}

	public double getApportPersonnel() {
		return apportPersonnel;
	}

	public void setApportPersonnel(double apportPersonnel) {
		this.apportPersonnel = apportPersonnel;
	}

	public double getMontantDemande() {
		return montantDemande;
	}

	public void setMontantDemande(double montantDemande) {
		this.montantDemande = montantDemande;
	}

	public double getMontantMensuel() {
		return montantMensuel;
	}

	public void setMontantMensuel(double montantMensuel) {
		this.montantMensuel = montantMensuel;
	}

	public double getMontantassurance() {
		return montantassurance;
	}

	public void setMontantassurance(double montantassurance) {
		this.montantassurance = montantassurance;
	}

	public boolean isAssure() {
		return assure;
	}

	public void setAssure(boolean assure) {
		this.assure = assure;
	}

	public double getMontantMensuelAssurance() {
		return montantMensuelAssurance;
	}

	public void setMontantMensuelAssurance(double montantMensuelAssurance) {
		this.montantMensuelAssurance = montantMensuelAssurance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "libelle", nullable = true, length = 50)
	private String libelle;

	@Column(name = "objet", nullable = true, length = 50)
	private String objet;
	
	@Column(name = "produit", nullable = true, length = 50)
	private String produit;
	
	@Column(name = "destination", nullable = true, length = 100)
	private String destination;
	

	private double montantTransaction;
	
	private double apportPersonnel;
	
	private double montantDemande;
	
	private double montantMensuel;
	
	private double montantassurance;
	
	private boolean assure;
	
	private double montantMensuelAssurance;

}
