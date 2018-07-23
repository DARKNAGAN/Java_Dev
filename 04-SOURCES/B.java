
public class B extends A {
	public int b ; 
	
	public static void main(String[] args) {
		A objetA = new A();
		B objetB = new B();
		
		System.out.println(objetA.a);

		// ERREUR DE COMPILATION : 
		// "b cannot be resolved or is not a field
		//System.out.println(objetA.b);

		System.out.println(objetB.b);
		System.out.println(objetB.a);
	}

}
