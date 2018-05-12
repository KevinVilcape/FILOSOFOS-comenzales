package filosofos;

public class Comenzales {

	public static void main(String args[]) {
		Filosofo Comenzales[];
		Comenzales = new Filosofo[5];
		tenedor mesa[];
		mesa = new tenedor[5];
		int i,izda=0,der=0;
		for(i=0;i<5;i++) {
			mesa[i] = new tenedor(i);
			
		}
		for (i=0;i<5;i++) {
			if(i==0) {
				izda=4;
				der=0;
			}
			if(i==1) {
				izda = 0;
				der=1;
			}
			if(i==2) {
				izda =1;
				der=2;
			}
			if(i==3) {
				izda=2;
				der=3;
			}
			if(i==4) {
				izda=3;
				der=4;
			}
			Comenzales[i] = new Filosofo(i,mesa[izda],mesa[der],mesa);
		}
	}

}
