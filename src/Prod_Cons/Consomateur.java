package Prod_Cons;

public class Consomateur extends Thread {

	Moniteur m;
	public Consomateur(Moniteur m) {
		this.m=m;
	}
	public void run() {
		m.prelever();
	}
}
