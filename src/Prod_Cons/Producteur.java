package Prod_Cons;



public class Producteur extends Thread {
	Moniteur m;
	public Producteur(Moniteur m) {
		this.m=m;
	}
	public void run() {
		m.ajouter();
	}
}
