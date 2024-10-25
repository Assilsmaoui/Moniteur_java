package Avion;

public class Test {

	public static void main(String[] args) {
		Moniteur m =new Moniteur();
		ClientR r1 =new ClientR(m);
		ClientA a1 =new ClientA(m);
		r1.start();
		a1.start();

	}

}
