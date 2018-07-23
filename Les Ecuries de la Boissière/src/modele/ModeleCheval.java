package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Cheval;

public class ModeleCheval 
{
	/* ARRAY* */
	public static ArrayList<Cheval> selectAll()
	{
		ArrayList<Cheval> lesChevaux = new ArrayList<Cheval>();
		String requete = "SELECT * FROM cheval;";
		
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			
			while(unRes.next())
			{
				int idcheval = unRes.getInt("idcheval");	
				int age = unRes.getInt("age");
				String nom = unRes.getString("nom");
				String sexe = unRes.getString("sexe");
				String proprietaire = unRes.getString("proprietaire");
				String robe = unRes.getString("robe");
				String type = unRes.getString("type");
				String race = unRes.getString("race");
				String imagecheval = unRes.getString("imagecheval");
				
				
				Cheval unCheval = new Cheval( idcheval,  age,  nom,  sexe,  proprietaire,  robe,  type,  race,  imagecheval);
				lesChevaux.add(unCheval);
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return lesChevaux;
	}
	
	/*INSERT* SID */
	public static void insert(Cheval unCheval)
	{
		String requete = "INSERT INTO cheval (nom, age, sexe, proprietaire, robe, type,  race, imagecheval) VALUES ('" 
				+ unCheval.getNom() + "', '" 
				+ unCheval.getAge() + "', '" 
				+ unCheval.getSexe() + "', '" 
				+ unCheval.getProprietaire() + "', '" 
				+ unCheval.getRobe() + "', '" 
				+ unCheval.getType() + "', '" 
				+ unCheval.getRace() + "', '" 
				+ unCheval.getImagecheval()+ "');";
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
	public static void update(Cheval unCheval, String nom, String proprietaire)
	{
		String requete = "UPDATE cheval SET "
				+ "nom = '"+ unCheval.getNom() +"', proprietaire ='"+ unCheval.getProprietaire() +"', "
						+ "robe ='"+ unCheval.getRobe() +"', type ='"+ unCheval.getType() +"', "
								+ "sexe ='"+ unCheval.getSexe() +"', age ='"+ unCheval.getAge() +"', "
								+ "race ='"+ unCheval.getRace()+"', "+"imagecheval ='"+ unCheval.getImagecheval()+"' "
						+ "WHERE nom='"+ nom + "'AND proprietaire='" + proprietaire + "';";
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
	/*DELETE* */
	public static void delete(String nom, String proprietaire)
	{
		String requete = "DELETE FROM cheval WHERE nom='" + nom + "'AND proprietaire='" + proprietaire + "';";
		
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
	public static Cheval selectWhere(String nom, String proprietaire)
	{
		String requete = "SELECT * FROM cheval WHERE nom='" + nom + "AND proprietaire='" + proprietaire + "';";
		
		Cheval unCheval = null;
		try {
			BDD uneBDD = new BDD("localhost", "ecurie", "root", "");
			uneBDD.seConnecter();
			
			Statement unStat = uneBDD.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			
			if(unRes.next())
			{
				int idcheval = unRes.getInt("idcheval");
				int age = unRes.getInt("age");
				String sexe = unRes.getString("sexe");
				String robe = unRes.getString("robe");
				String type = unRes.getString("type");
				String race = unRes.getString("race");
				String imagecheval = unRes.getString("imagecheval");
				
				unCheval = new Cheval( idcheval,  age,  nom,  sexe,  proprietaire,  robe,  type,  race,  imagecheval);
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return unCheval;
	}

}
