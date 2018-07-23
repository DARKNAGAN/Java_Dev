package controleur;

public class Produit
{
	private String reference, designation; 
	private int qte; 
	private float prix ; 
	
	public Produit ()
	{
		this.reference =""; 
		this.designation =""; 
		this.qte = 0; 
		this.prix = 0; 
		
	}
	public Produit(String reference, String designation, int qte, float prix)
	{
		this.reference = reference; 
		this.designation = designation; 
		this.qte = qte; 
		this.prix = prix ;
		
	}
	
	public String toString ()
	{
		return this.reference+"-"+this.designation+"-"+this.qte+"-"+this.prix;
	}
	
	
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	//getters et setters 
	
	
}
