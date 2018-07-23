package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class BDD
{
	private String serveur, nombdd, user, mdp;
	private Connection maConnexion;
	
	public BDD(String serveur, String nombdd, String user, String mdp)
	{
		this.serveur = serveur;
		this.nombdd = nombdd;
		this.user = user;
		this.mdp = mdp;
		this.maConnexion = null;
	}
	
	public void chargerPilote()
	{
		// vérifie la présence du pilote JDBC MySQL
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException exp) {
			System.out.println("Abscence du pilote JDBC !");
		}
	}
	
	public void seConnecter()
	{
		// connexion au serveur de la BDD
		this.chargerPilote();
		String url = "jdbc:mysql://" + this.serveur + "/" + this.nombdd;
		
		try {
			this.maConnexion = DriverManager.getConnection(url, this.user, this.mdp);
		}
		catch(SQLException exp) {
			System.out.println("Impossible de se connecter à  " + url);
		}
	}
	
	public void seDeconnecter()
	{
		// déconnexion au serveur de la BDD
		try {
			if(this.maConnexion != null) this.maConnexion.close();
		}
		catch(SQLException exp) {
			System.out.println("La déconnexion a échoué !");
		}
	}
	
	public Connection getMaConnexion()
	{
		return this.maConnexion;
	}
}
