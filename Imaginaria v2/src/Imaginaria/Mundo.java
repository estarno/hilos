package Imaginaria;

public class Mundo {
public static void main(String[] args) {
	
	Lago lago=Lago.getInstance();
	Fuente fuente=Fuente.getInstance();
	fuente.start();
	Seres humano=new Seres("Felix",lago,2);
	humano.start();
	Seres humanoe=new Seres("Manolito",lago,4);
	humanoe.start();
}
}
