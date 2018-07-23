package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Eleve;

public class ModeleEleve 
{
	/*ARRAY* */
	public static ArrayList<Eleve> selectAll()
	{
		ArrayList<Eleve> lesEleves = new ArrayList<Eleve>();
		String requete = "SELECT * FROM compteeleve;";
		
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			
			while(unRes.next())
			{
				int ideleve = unRes.getInt("ideleve");	
				int age = unRes.getInt("age");	
				int galop = unRes.getInt("galop");
				int privilege = unRes.getInt("privilege");	
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String adresse = unRes.getString("adresse");
				String adressemail = unRes.getString("adressemail");
				String sexe = unRes.getString("sexe");
				String pseudo = unRes.getString("pseudo");
				String mdp = unRes.getString("mdp");	
				String imageeleve = unRes.getString("imageeleve");	
				String dateenregistre = unRes.getString("dateenregistre");	
				
				Eleve unEleve = new Eleve(ideleve, age, galop, privilege, nom, prenom, adresse, adressemail, sexe, pseudo, mdp, imageeleve, dateenregistre);
				lesEleves.add(unEleve);
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return lesEleves;
	}
	/* INSERT S ID & PRIV & DateEnr  */
	public static void insert(Eleve unEleve)
	{
		String requete = "INSERT INTO compteeleve (nom, prenom, adresse, adressemail, sexe, age, galop, pseudo, mdp, imageeleve) VALUES ('" 
				+ unEleve.getNom() + "', '" 
				+ unEleve.getPrenom() + "', '" 
				+ unEleve.getAdresse() + "', '" 
				+ unEleve.getAdressEmail() + "', '" 
				+ unEleve.getSexe() + "', '" 
				+ unEleve.getAge() + "', '" 
				+ unEleve.getGalop() + "', '" 
				+ unEleve.getPseudo() + "', '" 
				+ unEleve.getMdp() + "', '" 
				+ unEleve.getImageeleve()+ "');";
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();

			Statement unStat = uneBDD.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
	}
	/* DELETE* */
	public static void delete(String pseudo)
	{
		String requete = "DELETE FROM compteeleve WHERE pseudo='" + pseudo + "';";
		
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
	}
	/*UPDATE S ID & PRIV & DateEnr  */
	public static void update(Eleve unEleve, String pseudo)
	{
		String requete = "UPDATE compteeleve SET "
								+ "nom = '"+ unEleve.getNom() +"', prenom ='"+ unEleve.getPrenom() +"', "
								+ "adresse ='"+ unEleve.getAdresse() +"', adressemail ='"+ unEleve.getAdressEmail() +"', "
								+ "sexe ='"+ unEleve.getSexe() +"', age ='"+ unEleve.getAge() +"', "
								+ "galop ='"+ unEleve.getGalop() +"', pseudo ='"+ unEleve.getPseudo() +"', "
								+ "mdp ='"+ unEleve.getMdp()+"', imageeleve ='"+ unEleve.getImageeleve()+"' "
						+ "WHERE pseudo='"+ pseudo +"';";
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
	}
	/*WHERE* */
	public static Eleve selectWhere(String pseudo, String mdp)
	{
		String requete = "SELECT * FROM compteeleve WHERE pseudo='" + pseudo + "' AND mdp='" + mdp + "';";
		
		Eleve unEleve = null;
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			
			if(unRes.next())
			{
				int ideleve = unRes.getInt("ideleve");
				int age = unRes.getInt("age");	
				int galop = unRes.getInt("galop");
				int privilege = unRes.getInt("privilege");	
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String adresse = unRes.getString("adresse");			
				String sexe = unRes.getString("sexe");
				String adressemail = unRes.getString("adressemail");	
				String imageeleve = unRes.getString("imageeleve");	
				String dateenregistre = unRes.getString("dateenregistre");	
				
				unEleve = new Eleve(ideleve, age, galop, privilege, nom, prenom, adresse, adressemail, sexe, pseudo, mdp, imageeleve, dateenregistre);
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return unEleve;
	}
}
