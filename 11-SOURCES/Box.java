public class Box {
    private Object valeur;
    public void set(Object valeur) { 
        this.valeur = valeur; }
    public Object get() { return valeur; }
    
    public static void main (String args []) {
       Box box_integer = new Box ();
       box_integer.set(new Integer (12));
       // Integer i = box_integer.get(); // Erreur de compilation : Type mismatch: cannot convert from Object to Integer
    }
}
