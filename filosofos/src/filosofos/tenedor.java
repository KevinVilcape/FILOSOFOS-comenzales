package filosofos;

public class tenedor {
	int nombre;
	boolean deci;
	int comida;

public tenedor (int nombre) {
	this.nombre = nombre;
	deci = false;
	comida = 5;
}
public void tomar (int comida) {
	this.comida= comida;
	deci = true;
	notifyAll();
}
public void dejado() {
	comida = 5;
	deci = false;
	notifyAll();
}

}
