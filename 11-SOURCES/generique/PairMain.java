package generique;

public class PairMain {
	// Comparer deux paires clés - valeur (ayant chacune un type générique)
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
               p1.getValue().equals(p2.getValue());
    }
    
    public static void main(String args[]) {
    	Pair<Integer, String> p1 = new Pair<>(1, "apple");
    	Pair<Integer, String> p2 = new Pair<>(2, "pear");
    	boolean same = PairMain.<Integer, String>compare(p1, p2);
    	System.out.println("same = " + same);
    	
    	// On peut aussi ne pas mettre le type qui sera inféré par le compilateur : 
    	Pair<Integer, String> p3 = new Pair<>(1, "apple");
    	Pair<Integer, String> p4 = new Pair<>(1, "apple");
    	boolean same2 = PairMain.compare(p3, p4);
    	System.out.println("same2 = " + same2);
    }
}
