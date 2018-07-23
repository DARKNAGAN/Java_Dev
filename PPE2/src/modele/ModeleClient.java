package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Client;

public class ModeleClient 
{
	public static ArrayList<Client> selectAll()
	{
		ArrayList<Client> lesClients = new ArrayList<Client>();
		String requete = "select * from Client;";
		
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
				String email = unRes.getString("email");
				int idclient = unRes.getInt("idclient");	
				
				Client unClient = new Client(idclient, nom, prenom, email, adresse);
				lesClients.add(unClient);
			}
			
			unStat.close();
			unRes.close();
			uneBDD.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete " + requete);
		}
		
		return lesClients;
	}
}
