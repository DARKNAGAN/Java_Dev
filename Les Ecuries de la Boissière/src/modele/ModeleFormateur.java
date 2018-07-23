package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import controleur.Formateur;
public class ModeleFormateur 
{
	/*ARRAY* */
	public static ArrayList<Formateur> selectAll()
	{
		ArrayList<Formateur> lesFormateurs = new ArrayList<Formateur>();
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
				String mdp = unRes.getString("mdp");
				String login = unRes.getString("login");
				
				Formateur unFormateur = new Formateur(idformateur, age, galop, privilege, nom, prenom, adressemail, sexe, login, mdp);
				lesFormateurs.add(unFormateur);
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return lesFormateurs;
	}
	/* INSERT * SID */
	public static void insert(Formateur unFormateur)
	{
		String requete = "INSERT INTO formateur (nom, prenom, adressemail, sexe, age, galop, privilege, login, mdp) VALUES ('" 
				+ unFormateur.getNom() + "', '" 
				+ unFormateur.getPrenom() + "', '" 
				+ unFormateur.getAdressEmail() + "', '" 
				+ unFormateur.getSexe() + "', '" 
				+ unFormateur.getAge() + "', '" 
				+ unFormateur.getGalop() + "', '" 
				+ unFormateur.getPrivilege() + "', '" 
				+ unFormateur.getLogin() + "', '" 
				+ unFormateur.getMdp() + "');";
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
	/*UPDATE PAS* */
	public static void update(Formateur unFormateur, String login)
	{
		String requete = "UPDATE formateur SET "
				+ "nom = '"+ unFormateur.getNom() +"', prenom ='"+ unFormateur.getPrenom() +"', "
						+ "galop ='"+ unFormateur.getGalop() +"', adressemail ='"+ unFormateur.getAdressEmail() +"', "
								+ "sexe ='"+ unFormateur.getSexe() +"', age ='"+ unFormateur.getAge() +"', "
								+ "login ='"+ unFormateur.getLogin()+"', "+"mdp ='"+ unFormateur.getMdp()+"' "
						+ "WHERE login='"+ login +"';";
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
	public static void delete(String login)
	{
		String requete = "DELETE FROM formateur WHERE login='" + login + "';";
		
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
	/* WHERE* */
	public static Formateur selectWhere(String login, String mdp)
	{
		String requete = "SELECT * FROM formateur WHERE login='" + login + "' AND mdp='" + mdp + "';";
		
		Formateur unFormateur = null;
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
				String adressemail = unRes.getString("adressemail");		
				
				unFormateur = new Formateur(idformateur, age, galop, privilege, nom, prenom,adressemail, sexe, login, mdp);
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return unFormateur;
	}
}
