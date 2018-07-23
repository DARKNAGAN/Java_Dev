import java.io.*;

class ExPaquetageExistant {
	public static void main (String arg[]) {
		System.out.println ("Affichage du dossier ");
		File f = new File (".");
		String dossier [] = f.list ();
		
		// enhanced for loop
		for (String s : dossier) {
				System.out.println ("-- " + s);
		}
		System.out.println ("2 puissance 3 = " + Math.pow (2,3));
	}	
}
