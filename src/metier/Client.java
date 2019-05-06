package metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tools.ConnexionBDD;

public class Client 
{
	// Chaques champs de la table client = attributs privés
	// Générer getter setter
	// Méthode remplir objet a partir de bdd
	
	private int idClient;
	private String pseudo;
	private String couleur;
	private ConnexionBDD connex;
	
	public void init(ConnexionBDD connex)
	{
		this.connex = connex;
	}
	
	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public void fillClient(int idClient) throws SQLException// select infos table Client -> valeurs champs = attributs classe Client 
	{
		ConnexionBDD.getConnexion();
		Statement state = ((Connection) connex).createStatement();
		ResultSet resultat = state.executeQuery("SELECT idClient FROM Client");
		resultat   = idClient;
	}
	
	
	// m2THODE METTRE a jour bdd a partir de l'objet
	
	public void saveClient() // sauvegarder si idClient ==  0 , faire insert 
							// si idCli =! 0, update 
	{
		
	}
	
	
}
