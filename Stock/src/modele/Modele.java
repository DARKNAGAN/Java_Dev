package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Produit;

public class Modele
{
	
	public static ArrayList<Produit> selectAll()
	{
		ArrayList<Produit> lesProduits = new ArrayList<Produit>();
		String requete ="Select * from produit ; ";
		try
		{
			Bdd uneBdd = new Bdd("localhost", "stock", "root", "");
			uneBdd.seConnecter();
			
			Statement  unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			while (unRes.next())
			{
				String reference = unRes.getString("reference");
				String designation = unRes.getString("designation");
				int qte = unRes.getInt("qte");
				float prix = unRes.getFloat("prix");
				Produit unProduit = new Produit(reference, designation, qte, prix);
				lesProduits.add(unProduit);
			}
			unStat.close();
			unRes.close();
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution de la requete : "+requete);
		}
		
		return lesProduits;
	}
	
	public static void insert (Produit unProduit)
	{
		String requete ="insert into produit (reference, designation, qte, prix)"
				+ " values ('"+unProduit.getReference()+"','"+unProduit.getDesignation()
				+"',"+unProduit.getQte()+","+unProduit.getPrix()+"); ";
		
		try
		{
			Bdd uneBdd = new Bdd("localhost", "stock", "root", "");
			uneBdd.seConnecter();
			
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution requete : "+requete);
		}
	}
	
	public static void delete (String reference)
	{
		String requete = "DELETE FROM Produit WHERE reference ='"+reference+"';";
		
		try
		{
			Bdd uneBdd = new Bdd("localhost", "stock", "root", "");
			uneBdd.seConnecter();
			
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeConnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur d'execution requete : "+requete);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}













