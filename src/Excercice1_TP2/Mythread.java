package Excercice1_TP2;

public class Mythread extends Thread {
	String nom ;

	Moniteur m ; 

    int amount;

	Mythread(String nom ,Moniteur m,int amount) {

		super(nom) ; 

		this.m=m;

		this.amount=amount;

	}

	public void run() {

		m.Request(amount);

		m.acces_memoire(amount);

		m.Release(amount);

		

	}



}