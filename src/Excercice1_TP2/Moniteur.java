package Excercice1_TP2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
	private final ReentrantLock l=new ReentrantLock();
//VP
	private int nb_cell_dispo=100;
	
	private final Condition c1=l.newCondition(); 
	private int in=0 ;
	private int out=0 ;
//methode
	public void Request(int amount)  {
		l.lock();
		try {
			//COND=>Attente
			while(amount>nb_cell_dispo) {
				System.out.println("nbre de case n'est pas diponiblie");
				c1.signal();
				c1.await();
				System.out.println("processus quit fil d'attente");
			}
			System.out.println("processus reserver"+amount);
			nb_cell_dispo=nb_cell_dispo-amount;
		}catch(Exception e) {}
		finally {l.unlock();}
	}
	public void acces_memoire(int amount) {

		System.out.println("je suis dans la mémoire");

	}
	public void Release(int amount) {
		l.lock();
		try {
			nb_cell_dispo=nb_cell_dispo+amount;
			System.out.println("processus libere"+amount);
			c1.signal();
		}catch(Exception e) {}
		finally {l.unlock();}
	}
}
