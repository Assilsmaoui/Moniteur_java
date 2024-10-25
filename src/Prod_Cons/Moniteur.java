package Prod_Cons;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Moniteur {
	private final ReentrantLock l=new ReentrantLock();
	//VP
	private int taille=2;
	private int[]tab=new int[taille];
	private int nb_place_plein=0;
	private final Condition c1=l.newCondition(); 
	private final Condition c2=l.newCondition(); 
	private int in ;
	private int out=0 ;
	//methode
	public void ajouter() {
		l.lock();
		try {
			//COND=>Attente
			//Tableau plein =attente
			while(nb_place_plein==taille) {
				System.out.println("Producteur en attente");
				c1.await();
				System.out.println("Producteur quite la fil interne");
				
			}
			int x=(int)(Math.random()*100);
			tab[in]=x;
			System.out.println("Producteur ajoute"+x);	
			in=(in+1)%taille;
			nb_place_plein=nb_place_plein+1;
			c2.signal();
		}catch(Exception e) {}
		finally{l.unlock();}
	}
	public void prelever() {
		l.lock();
		try {
			while(nb_place_plein==0) {
				System.out.println("Consomateur en attente");
				c2.await();
				System.out.println("Consomatteur quite la fil interne");	
			}
			int y=tab[out];
			out=(out+1)%taille;
			System.out.println("Consomateur preleve"+y);	
			nb_place_plein=nb_place_plein-1;
			c1.signal();
		
		}catch(Exception e) {}
		finally {l.unlock();}
	}

}
