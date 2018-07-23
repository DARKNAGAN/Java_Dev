package generique;

public class Box<T> {
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
    
    public static void main (String args []) {
    	// Déclaration et new avec le type
    	Box<Integer> integerBox = new Box<Integer>();
     	integerBox.set(new Integer (12));
     	// integerBox.set("Bonjour"); // ERREUR DE COMPILATION : 
     	// The method set(Integer) in the type Box<Integer> is not applicable 
     	// for the arguments (String)
        Integer i = integerBox.get(); // PAS LA PEINE DE FAIRE UN CAST
 
       	// Ou alors avec le “diamant” et une inférence de type
        Box<Integer> integerBox2 = new Box<>();
        integerBox2.set(new Integer (33));
        Integer j = integerBox2.get();

        // Le type “brut” : Box
        Box rawBox = new Box();
        rawBox.set(new Integer (35));
        // Integer k = rawBox.get(); ERREUR DE COMPILATION : 
        // Type mismatch: cannot convert from Object to Integer
        int k = (Integer) rawBox.get(); 
    }
}
