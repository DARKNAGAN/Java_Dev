package generique;

class CoupleDiff<T, U> {
    private T x; // le premier element du couple
    private U y; // le second element du couple

    public CoupleDiff(T premier, U second) {
   	 x = premier;
   	 y = second;
    }

    public T getPremier() {
   	 return x;
    }

    public void affiche() {
   	 System.out.println ("Couple diff 1ere val : " + x + " - 2e val : " + y ) ;
    }
    
    public static void main(String args[]) {
      	 Integer oi1 = 3;
      	 Double od1 = 2.5;
      	 CoupleDiff<Integer, Double> ch1 = new CoupleDiff<Integer, Double>(oi1,
      			 od1);
      	 ch1.affiche();

      	 Integer oi2 = 4;
      	 CoupleDiff<Integer, Integer> ch2 = new CoupleDiff<Integer, Integer>(oi1, oi2);
      	 ch2.affiche();

      	 Integer n = ch1.getPremier();
      	 System.out.println("premier element du couple ch1 = " + n);
       }

}

