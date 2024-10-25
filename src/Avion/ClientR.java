package Avion;

public class ClientR extends Thread {
	Moniteur m;
	public ClientR(Moniteur m) {
		this.m=m;
	}
	public void run() {
		m.reserver();
	}

}
