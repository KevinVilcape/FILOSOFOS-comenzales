package filosofos;

import java.util.Random;

public class Filosofo extends Thread {
	int nombre;
	Thread t;
	tenedor der;
	tenedor izqui;
	int espera;
	Random r;
	tenedor mesa[];
	
	public Filosofo(int nombre, tenedor der, tenedor izqui,tenedor mesa[]) {
		this.nombre= nombre;
		this.der= der;
		this.izqui=izqui;
		System.out.println("El filosofo "+(nombre+1)+" y el tenedor"+(izqui.nombre+1));
		this.mesa=mesa;
		r=new Random();
		t=new Thread(this);
		t.start();
	}
	public void run() {
		for(int i=0;i<3;i++) {
			synchronized(this.der){
				synchronized(this.izqui) {
					comer();
				}
			}
			pensar();
		}
		System.out.println("Filosofo "+(nombre+1)+" termino de comer");
	}
	public void comer() {
		
		System.out.println(mirarlamesa()+"FILOSOFO "+(nombre+1)+" comiendo ^_^");
		der.tomar(nombre);
		izqui.tomar(nombre);
		espera = r.nextInt(100);
		System.out.println(mirarlamesa()+"filosofo "+(nombre+1)+" comiendo ^_^");
		try {
			Thread.sleep(500);
		
		}catch (InterruptedException e) {
	}
	der.dejado();
	izqui.dejado();
	System.out.println(mirarlamesa()+"filosofo "+(nombre+1)+" comiendo ^_^");
}

	public void pensar() {
		espera = (r.nextInt(500));
		try {
			System.out.println(mirarlamesa()+"Filosofo "+(nombre+1)+" Comienza a pensar ");
			Thread.sleep(espera);
		}catch(InterruptedException e) {
			
		}
	}
	public String mirarlamesa() {
		String a=" ";
		for(int i=0; i<mesa.length;i++) {
			
		}
		return a;
	}
}

