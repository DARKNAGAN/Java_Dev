import java.util.Arrays;
public class Stock {
public static void main(String[] args) {
	
	
	//-----------------------------------------------------
	// Tableau de type de base
	//-----------------------------------------------------
// Déclarer les constantes

// Déclarer les tableaux
	char t [] ; 
	double t2 [] ;
	// DECLARATION d'une REFERENCE de type tableau
	// CETTE CASE POURRA ENSUITE CONTENIR L’ADRESSE D’UN TABLEAU

//Allouer les tableaux
	t = new char [3];
	t2 = new double [3];
	//ALLOCATION d'une zone memoire pour n entiers dans le TAS

//Mettre des valeurs dans les cases
	t[0] = 'A' ;	
	t[1] = 'B'; 
	t[2] = 'C' ; 

	t2[0] = 10.5 ;
	t2[1] = 2.5 ; 
	t2[2] = 21.5 ; 
	// AFFECTATION d'une valeur ˆ une case du tableau
	
//Parcours des deux tableaux avec deux boucles foreach
	// Avec une boucle foreach
	//Tableau 1
	System.out.println ("\n Parcours du tableau avec une boucle foreach : ");
	for(int i = 0; i < t.length; i++) 
	{ 
	System.out.println("À l'emplacement " + i +" du tableau nous avons = " + t[i]); 
	}
	//Tableau 2
	for(int i = 0; i < t2.length; i++) 
	{ 
	System.out.println("À l'emplacement " + i +" du tableau nous avons = " + t2[i]); }
//Parcours des deux tableaux en parallèle avec une boucle while et un booleen
	//Tableau 1
	boolean fini = false ;
	int i = 0 ;
	System.out.println ("\n Parcours du tableau1 avec un booleen et une boucle while :");
	System.out.println ("--------------------");
	while (! fini) {
	System.out.print ("|"+t[i]+"|");
	i++ ;
	fini = i == t.length ;
	}
	System.out.println ("\n--------------------");
	//Tableau 2
	boolean fini1 = false ;
	int i1 = 0 ;
	while (! fini1) {
	System.out.print ("|"+t2[i1]+"|");
	i1++ ;
	fini1 = i1 == t2.length ;
	}
	System.out.println ("\n--------------------");

}
}





