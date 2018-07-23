package controleur;

public class Cheval
{
	private int idcheval, age; 
	private String nom, sexe, proprietaire, robe, type, race, imagecheval; 
	public Cheval()
	{
		this.idcheval=this.age=0;
		this.nom = this.sexe=this.proprietaire=this.robe=this.type=this.race=this.imagecheval="";
	}
	/*ALL*/
	public Cheval (int idcheval, int age, String nom, String sexe, String proprietaire, String robe, String type, String race, String imagecheval)
	{
		this.idcheval= idcheval; 
		this.age = age; 
		this.nom = nom; 
		this.sexe = sexe; 
		this.proprietaire = proprietaire; 
		this.robe = robe; 
		this.type = type; 
		this.race = race; 
		this.imagecheval = imagecheval; 
	}
	public Cheval (int age, String nom, String sexe, String proprietaire, String robe, String type, String race, String imagecheval)
	{
		this.age = age; 
		this.nom = nom; 
		this.sexe = sexe; 
		this.proprietaire = proprietaire; 
		this.robe = robe; 
		this.type = type; 
		this.race = race; 
		this.imagecheval = imagecheval; 
	}
	public Cheval (String nom, String proprietaire)
	{
		this.nom = nom; 
		this.proprietaire = proprietaire;
		
	}
	
	
	public int getIdcheval() {
		return idcheval;
	}
	public void setIdcheval(int idcheval) {
		this.idcheval = idcheval;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public String getRobe() {
		return robe;
	}
	public void setRobe(String robe) {
		this.robe = robe;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getImagecheval() {
		return imagecheval;
	}
	public void setImagecheval(String imagecheval) {
		this.imagecheval = imagecheval;
	}
	
}
