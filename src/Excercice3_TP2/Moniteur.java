package Excercice3_TP2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
	private final ReentrantLock l=new ReentrantLock();
	//VP
		private int Pont_actif=0;
		private final Condition c1=l.newCondition(); 
		private int nb=0 ;
		private int sens=1;
		public void  Passer(int sensV) {
			l.lock();
			try {
				
				//1 voiture qui arrive
				if(nb==0) sens=sensV;
				while(sens!=sensV) {
					System.out.println("la voiture est en attente");
					c1.await();
					//le thread qui quitte l'attente=>pont vide=>change le sens 
					if(nb==0) sens=sensV;
					System.out.println("la voiture quitte fil d'attente");
				}
				nb=nb+1;
				System.out.println("le nombre des voiture de meme sens sont"+nb);
			}catch(Exception e) {}
			
			finally {l.unlock();}
		}
		public void acces_pont() {
			System.out.println("je suis dans la pont");
		}
		public void quitter(int sensV) {
			l.lock();
			try {
				nb=nb-1;
				System.out.println("voiture sort de la pont "+sensV);
				c1.signal();
			}catch(Exception e) {}
			
			finally {l.unlock();}
		}
}
