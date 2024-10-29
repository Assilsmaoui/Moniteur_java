package Excercice3_TP2;



public class Voiture extends Thread {
	int sensV ;

	Moniteur m ; 

    

	Voiture(Moniteur m,int sensV ) {

		this.m=m;

		this.sensV=sensV;
		
	

	}

	public void run() {

		m.Passer(sensV);

		m.acces_pont();

		m.quitter(sensV);

		

	}



}