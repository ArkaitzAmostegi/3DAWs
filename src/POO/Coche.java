package POO;

//La clase es Coche:
public class Coche {
	//Los atributos de la clase:
	private int velocidad;
	//Constructor
	public Coche() {
		velocidad=0;
	}
	//Funciones
	public int getVelocidad() {
		return this.velocidad;
	}
	public void acelera(int mas) {
		this.velocidad=this.velocidad+mas;
	}
	public void frena(int menos) {
		this.velocidad=this.velocidad-menos;
		if(velocidad<0){
			velocidad=0;
		}
	}
}
