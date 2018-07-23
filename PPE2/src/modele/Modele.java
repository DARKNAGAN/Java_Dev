package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import controleur.Profil;

public class Modele
{
	public static ArrayList<Profil> selectAll()
	{
		ArrayList<Profil> lesProfils = new ArrayList<Profil>();
		String requete = "select * from Profil;";
		
		try {
			BDD uneBDD = new BDD("localhost", "ppe2", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			
			while(unRes.next())
			{
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String adresse = unRes.getString("adresse");
				String mail = unRes.getString("mail");
				String mdp = unRes.getString("mdp");
				String droits = unRes.getString("droits");
								
				Profil unProfil = new Profil(nom, prenom, adresse, mail, mdp, droits);
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
	
	public static void insert(Profil unProfil)
	{
		String requete = "insert into Profil (nom, prenom, adresse, mail, mdp, droits) values ('" 
				+ unProfil.getNom() + "', '" 
				+ unProfil.getPrenom() + "', '" 
				+ unProfil.getAdresse() + "', '" 
				+ unProfil.getMail() + "', '" 
				+ unProfil.getMdp() + "', '" 
				+ unProfil.getDroits() + "');";
		try {
			BDD uneBDD = new BDD("localhost", "ppe2", "root", "");
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
	
	public static void delete(String mail)
	{
		String requete = "delete from Profil where mail='" + mail + "';";
		
		try {
			BDD uneBDD = new BDD("localhost", "ppe2", "root", "");
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
	
	public static Profil selectWhere(String mail, String mdp)
	{
		String requete = "select * from Profil where mail='" + mail + "' and mdp='" + mdp + "';";
		
		Profil unProfil = null;
		try {
			BDD uneBDD = new BDD("localhost", "ppe2", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			
			if(unRes.next())
			{
				String nom = unRes.getString("nom");
				String prenom = unRes.getString("prenom");
				String adresse = unRes.getString("adresse");
				String droits = unRes.getString("droits");
				
				unProfil = new Profil(nom, prenom, adresse, mail, mdp, droits);
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
