package generique;

class Couple<T> {
    private T x, y ;  // les 2 elements du couple seront du même type

    public Couple (T premier, T second){
   	 x = premier ; y = second ;
    }
    public T getPremier () {
   	 return x ;
    }
    public void affiche () {
   	 System.out.println ("Couple : 1ere val : " + x + " - 2e val : " + y ) ;
    }
}
