package Excercice1_TP2;

public class Principale {
	public static void main(String args[]) {

		Moniteur m  = new Moniteur ();

		Mythread T1= new Mythread("Mohamed",m,40);

		Mythread T2= new Mythread("Ahmed",m,80);

		Mythread T3= new Mythread("x",m,90);

		T1.start();

		T2.start();

		T3.start();

	}

	}