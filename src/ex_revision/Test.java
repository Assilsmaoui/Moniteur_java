package ex_revision;

import java.util.concurrent.Semaphore;

public class Test {
 static int c=10;
 static int p=30;
 static Semaphore nbCabinDispo =new Semaphore(c);
	static Semaphore nbPaniDispo =new Semaphore(p);
	public static void main(String[] args) {
		
for(int i=0;i<10;i++)
	new Nageur().start();
	}

}
