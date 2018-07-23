package controleur;

public class Profil
{
	private String nom, prenom, adresse, mail, mdp, droits;
	
	public Profil(String nom, String prenom, String adresse, String mail, String mdp, String droits)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.mdp = mdp;
		this.droits = droits;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getDroits() {
		return droits;
	}

	public void setDroits(String droits) {
		this.droits = droits;
	}
	
	
}
