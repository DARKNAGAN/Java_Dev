package controleur;

public class Client
{
	private int idclient; 
	private String nom, prenom, email, adresse; 
	
	public Client()
	{
		this.idclient =0;
		this.nom = this.prenom=this.adresse=this.email="";
	}
	public Client (int idClient, String nom, String prenom, String email, String adresse)
	{
		this.idclient= idClient; 
		this.nom = nom; 
		this.prenom = prenom; 
		this.email = email; 
		this.adresse = adresse; 
	}
	public Client ( String nom, String prenom, String email, String adresse)
	{
		this.idclient= 0; 
		this.nom = nom; 
		this.prenom = prenom; 
		this.email = email; 
		this.adresse = adresse; 
	}
	public int getIdclient() {
		return idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
}
