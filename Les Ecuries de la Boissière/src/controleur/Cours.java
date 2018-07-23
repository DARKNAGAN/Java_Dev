package controleur;

public class Cours
{		
	private int idcours, ideleve, idformateur, idcheval; 
	private String datecours, heuredebut, heurefin; 
	
	public Cours()
	{
		this.idcours=ideleve=idformateur=idcheval=0;
		this.datecours = this.heuredebut=this.heurefin="";
	}
	public Cours (int idcours, String datecours, String heuredebut, String heurefin, int ideleve, int idformateur, int idcheval)
	{
		this.idcours= idcours; 
		this.datecours = datecours; 
		this.heuredebut = heuredebut; 
		this.heurefin = heurefin; 
		this.ideleve= ideleve; 
		this.idformateur= idformateur; 
		this.idcheval= idcheval; 
		
	}
	public Cours ( String datecours, String heuredebut, String heurefin)
	{
		this.idcours= 0; 
		this.ideleve= 1; 
		this.idformateur= 1; 
		this.idcheval= 1; 
		this.datecours = datecours; 
		this.heuredebut = heuredebut; 
		this.heurefin = heurefin; 
	}
	public Cours ( String datecours, String heuredebut, String heurefin, int ideleve, int idformateur, int idcheval)
	{
		this.idcours= 0; 
		this.ideleve= ideleve; 
		this.idformateur= idformateur; 
		this.idcheval= idcheval; 
		this.datecours = datecours; 
		this.heuredebut = heuredebut; 
		this.heurefin = heurefin; 
	}
	public Cours ( String datecours, String heuredebut)
	{
		this.datecours = datecours; 
		this.heuredebut = heuredebut; 
	}
	public int getIdCours() {
		return idcours;
	}
	public void setIdCours(int idcours) {
		this.idcours = idcours;
	}
	public String getDateCours() {
		return datecours;
	}
	public void setDateCours(String datecours) {
		this.datecours = datecours;
	}
	public String getHeureDebut() {
		return heuredebut;
	}
	public void setHeureDebut(String heuredebut) {
		this.heuredebut = heuredebut;
	}
	public String getHeureFin() {
		return heurefin;
	}
	public void setHeureFin(String heurefin) {
		this.heurefin = heurefin;
	}
	public int getIdEleve() {
		return ideleve;
	}
	public void setIdEleve(int ideleve) {
		this.ideleve = ideleve;
	}
	public int getIdFormateur() {
		return idformateur;
	}
	public void setIdFormateur(int idformateur) {
		this.idformateur = idformateur;
	}
	public int getIdCheval() {
		return idcheval;
	}
	public void setIdCheval(int idcheval) {
		this.idcheval = idcheval;
	}

	
}
