package Excercice3_TP2;



public class Principale {
	public static void main(String args[]) {

		Moniteur m  = new Moniteur ();

		Voiture V1= new Voiture(m,1);

		Voiture V2= new Voiture(m,1);

        Voiture V3= new Voiture(m,-1);
        Voiture V4= new Voiture(m,-1);

		V1.start();

		V2.start();

		V3.start();
		V4.start();

	}
}
