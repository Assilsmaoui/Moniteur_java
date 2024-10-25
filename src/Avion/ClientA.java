package Avion;

public class ClientA extends Thread {
	Moniteur m;
	public ClientA(Moniteur m) {
		this.m=m;
	}
	public void run() {
		m.annuler();
	}
}
