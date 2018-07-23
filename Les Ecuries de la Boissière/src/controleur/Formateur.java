package controleur;

public class Formateur
{
	private int idformateur, age, galop, privilege; 
	private String nom, prenom, adressemail, sexe, login, mdp;
	
	public Formateur()
	{
		this.idformateur=this.age=this.galop=this.privilege=0;
		this.nom=this.prenom=this.adressemail=this.sexe=this.mdp=this.login="";
	}
	/*ALL*/
	public Formateur (int idformateur, int age, int galop, int privilege, String nom, String prenom, String adressemail, String sexe, String login, String mdp )
	{
		this.idformateur= idformateur; 
		this.nom = nom; 
		this.prenom = prenom; 
		this.adressemail = adressemail; 
		this.sexe = sexe;  
		this.age = age; 
		this.galop = galop; 
		this.privilege = privilege; 
		this.login = login; 
		this.mdp = mdp; 
	}
	/* S IDF & Privikege*/
	public Formateur ( int age, int galop, String nom, String prenom, String adressemail, String sexe, String login, String mdp )
	{
		this.nom = nom; 
		this.prenom = prenom; 
		this.adressemail = adressemail; 
		this.sexe = sexe;  
		this.age = age; 
		this.galop = galop; 
		this.privilege = 3; 
		this.login = login; 
		this.mdp = mdp; 
	}
	
	public Formateur (String login)
	{
		this.login = login; 
	}
	
	
	
	

	public int getIdformateur() {
		return idformateur;
	}
	public void setIdformateur(int idformateur) {
		this.idformateur = idformateur;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
}
