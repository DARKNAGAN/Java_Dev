package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Profil;

public class Modele
{
	/* ARRAY */
	public static ArrayList<Profil> selectAll()
	{
		ArrayList<Profil> lesProfils = new ArrayList<Profil>();
		String requete = "SELECT * FROM formateur;";
		
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			
			while(unRes.next())
			{
				int idformateur = unRes.getInt("idformateur");	
				int age = unRes.getInt("age");	
				int galop = unRes.getInt("galop");
				int privilege = unRes.getInt("privilege");	
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String adressemail = unRes.getString("adressemail");
				String sexe = unRes.getString("sexe");
				String login = unRes.getString("login");
				String mdp = unRes.getString("mdp");
								
				Profil unProfil = new Profil(idformateur, age, galop, privilege, nom, prenom, adressemail, sexe, login, mdp );
				lesProfils.add(unProfil);
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return lesProfils;
	}
	/* INSERT */ 
	public static void insert(Profil unProfil)
	{
		String requete = "INSERT INTO formateur (age, galop, privilege, nom, prenom, adressemail, sexe, login, mdp ) VALUES ('" 
				+ unProfil.getAge() + "', '" 
				+ unProfil.getGalop() + "', '"
				+ unProfil.getPrivilege() + "', '"
				+ unProfil.getNom() + "', '" 
				+ unProfil.getPrenom() + "', '" 
				+ unProfil.getEmail() + "', '" 
				+ unProfil.getSexe() + "', '" 
				+ unProfil.getLogin() + "', '" 
				+ unProfil.getMdp() + "');";
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
	/* DELETE */
	public static void delete(String adressemail)
	{
		String requete = "DELETE FROM formateur WHERE adressemail='" + adressemail + "';";
		
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
	/* WHERE* Connexion */
	public static Profil selectWhere(String adressemail, String mdp)
	{
		String requete = "SELECT * FROM formateur WHERE adressemail='" + adressemail + "' AND mdp='" + mdp + "';";
		
		Profil unProfil = null;
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			
			if(unRes.next())
			{
				int idformateur = unRes.getInt("idformateur");	
				int age = unRes.getInt("age");	
				int galop = unRes.getInt("galop");
				int privilege = unRes.getInt("privilege");	
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String sexe = unRes.getString("sexe");
				String login = unRes.getString("login");
				
				unProfil = new Profil(idformateur, age, galop, privilege, nom, prenom, adressemail, sexe, login, mdp );
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return unProfil;
	}
}
