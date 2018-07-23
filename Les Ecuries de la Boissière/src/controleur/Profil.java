package controleur;

public class Profil
{
	private int  idformateur, age, galop, privilege;
	private String nom, prenom, adressemail, sexe, login, mdp;
	public Profil (int idformateur, int age, int galop, int privilege, String nom, String prenom, String adressemail, String sexe, String login, String mdp )
	{
		this.idformateur= idformateur; 
		this.age = age; 
		this.galop = galop; 
		this.privilege = privilege; 
		this.nom = nom; 
		this.prenom = prenom; 
		this.adressemail = adressemail; 
		this.sexe = sexe;  
		this.login = login; 
		this.mdp = mdp; 
	}
	public Profil (int age, int galop, int privilege, String nom, String prenom, String adressemail, String sexe, String login, String mdp )
	{
		this.age = age; 
		this.galop = galop; 
		this.privilege = privilege; 
		this.nom = nom; 
		this.prenom = prenom; 
		this.adressemail = adressemail; 
		this.sexe = sexe;  
		this.login = login; 
		this.mdp = mdp; 
	}
	public Profil (String adressemail, String mdp)
	{
		this.adressemail = adressemail; 
		this.mdp = mdp; 
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
	public String getEmail() {
		return adressemail;
	}

	public void setEmail(String adressemail) {
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
