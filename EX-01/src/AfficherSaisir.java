import java.lang.Math;
import java.util.Scanner;
import java.text.*;
public class AfficherSaisir {
	
public static void main(String[] args){
  System.out.println("Bonjour") ;
  
  //Afficher ensuite le nombre pi (Math.PI) de mani�re format�e avec 3 chiffres apr�s la virgule.
  DecimalFormat df = new DecimalFormat ( ) ; 
  df.setMaximumFractionDigits ( 3 ) ; //arrondi � 3 chiffres apres la virgules 
  System.out.println(df.format(Math.PI));
  
  //Saisir un nombre n ; afficher un nombre al�atoire entre 0 et n
  @SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
  System.out.println("Veuillez saisir un chiffre :");
  String str = sc.nextLine();
  System.out.println("Vous avez saisi : " + str);
 
  System.out.println  (Math.random());
	}
}