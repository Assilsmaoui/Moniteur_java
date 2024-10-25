package Avion;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
private final ReentrantLock l=new ReentrantLock();
//VP 
private int nbplace=0;
private final Condition c1=l.newCondition(); 
//méthodes moniteur
void reserver() {
	l.lock();
	try {
		//condition==>Attente
		while(nbplace==0) {
			System.out.println("Client attend");
			c1.await();
			System.out.println("Client quite latente");
		}
		nbplace=nbplace-1;
		System.out.println("Client reserver");
		
	}catch(Exception e) {}
	finally {l.unlock();}
}
void annuler() {
	l.lock();
	try {
		nbplace=nbplace+1;
		System.out.println("Client annule");
		c1.signal();
	}catch(Exception e) {}
	finally {l.unlock();}
}
}
