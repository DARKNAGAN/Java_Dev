package controleur;

public class Eleve
{
	private int ideleve, age, galop, privilege; 
	private String nom, prenom, adresse, adressemail, sexe, pseudo, mdp, imageeleve, dateenregistre;
	
	public Eleve()
	{
		this.ideleve=this.age=this.galop=0;
		this.privilege=2;
		this.nom=this.prenom=this.adresse=this.adressemail=this.sexe=this.pseudo=this.mdp="";
		this.imageeleve=this.dateenregistre="2017-04-25 01:00:00";
	}
	/*ALL*/
	public Eleve (int idEleve, int age, int galop, int privilege, String nom, String prenom, String adresse, String adressemail, String sexe, String pseudo, String mdp, String imageeleve, String dateenregistre)
	{
		this.ideleve= idEleve; 
		this.age = age; 
		this.galop = galop; 
		this.privilege = privilege; 
		this.nom = nom; 
		this.prenom = prenom; 
		this.adresse = adresse; 
		this.adressemail = adressemail; 
		this.sexe = sexe;  
		this.pseudo = pseudo; 
		this.mdp = mdp; 
		this.imageeleve = imageeleve; 
		this.dateenregistre = dateenregistre; 
	}
	public Eleve ( int age, int galop, String nom, String prenom, String adresse, String adressemail, String sexe, String pseudo, String mdp, String imageeleve)
	{
		this.ideleve= 0; 
		this.age = age; 
		this.galop = galop; 
		this.privilege = 2; 
		this.nom = nom; 
		this.prenom = prenom; 
		this.adresse = adresse; 
		this.adressemail = adressemail; 
		this.sexe = sexe;  
		this.pseudo = pseudo; 
		this.mdp = mdp; 
		this.imageeleve = imageeleve; 
		this.dateenregistre = ""; 
	}
	
	public Eleve (String pseudo)
	{

		this.pseudo = pseudo; 

	}
	
	
	
	
	
	
	public int getIdeleve() {
		return ideleve;
	}
	public void setIdeleve(int ideleve) {
		this.ideleve = ideleve;
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
	public String getAdressEmail() {
		return adressemail;
	}
	public void setAdressEmail(String adressemail) {
		this.adressemail = adressemail;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}	
	public String getImageeleve() {
		return imageeleve;
	}
	public void setImageeleve(String imageeleve) {
		this.imageeleve = imageeleve;
	}	
	public int getGalop() {
		return galop;
	}
	public void setGalop(int galop) {
		this.galop = galop;
	}	
	public int getPrivilege() {
		return privilege;
	}
	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}
	public String getDateEnregistre() {
		return dateenregistre;
	}
	public void setDateEnregistre(String dateenregistre) {
		this.dateenregistre = dateenregistre;
	}
}
