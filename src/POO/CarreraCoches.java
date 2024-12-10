package POO;
import java.util.Scanner;
import POO.Coche;

public class CarreraCoches {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		Coche coche=new Coche();
	
		int mas=0, menos=0, numero;
		do {
			System.out.println("Introduce la variación de velocidad deseada: ");
			numero=sc.nextInt();
			if(numero<0) {
				menos=-numero;
				coche.frena(menos);
				System.out.println("Velocidad actual: "+coche.getVelocidad()+"km/h");
			}else if(numero>0) {
				mas=numero;
				coche.acelera(mas);
				System.out.println("Velocidad actual: "+coche.getVelocidad()+"km/h");
			}
		}while(numero!=0);
		if(numero==0) {
			System.out.println("FIN");
		}
	sc.close();
	}
}
