package Prod_Cons;

import Prod_Cons.Producteur;
import Prod_Cons.Consomateur;
import Prod_Cons.Moniteur;

public class Test {
	public static void main(String[] args) {
		Moniteur m =new Moniteur();
		Producteur p1 =new Producteur(m);
		Consomateur c1 =new Consomateur(m);
		Producteur p2 =new Producteur(m);
		Consomateur c2 =new Consomateur(m);
		Producteur p3 =new Producteur(m);
		Consomateur c3 =new Consomateur(m);
		p1.start();
		c1.start();
		p2.start();
		c2.start();
		p3.start();
		c3.start();

	}
}
