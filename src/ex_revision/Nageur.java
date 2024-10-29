package ex_revision;

public class Nageur extends Thread {
public void run() {
	
	
	
}
//reserver panier()
//reserverCabine()
//liberer Cabine
//nager
//reserver Cabine
//librer Cabine
//librer panier
///////
//VP 
//P panier    / C cabine


void reserverCabine() {
	try {
		Test.nbCabinDispo.acquire();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void librerPanier() {
	try {
		Test.nbPaniDispo.acquire();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
void libererCabine() {
Test.nbCabinDispo.release();
}
void libererPanier() {
	Test.nbPaniDispo.release();
}
}