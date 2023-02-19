package test;

public class Auto {

	public String modelo,marca;
	public int precio,registro;
	public Asiento[] asientos;
	public Motor motor;
	public static int cantidadCreados;
	
	public Auto(String modelo,int precio, Asiento[] asientos,String marca,Motor motor,int registro) {
		this.modelo=modelo;
		this.precio=precio;
		this.asientos=asientos;
		this.marca=marca;
		this.motor=motor;
		this.registro=registro;
		
	}
	
	public int cantidadAsientos() {
		for(Asiento n: asientos) if(n instanceof Asiento && n!=null) ++cantidadCreados;
		return cantidadCreados;
	}
	
	public String verificarIntegridad() {
		String islegit="Auto original",ischafa="Las piezas no son originales";
		for(Asiento a: asientos) {
			if(a!=null) {
				if(a.registro!=this.registro||this.registro!=this.motor.registro||a.registro!=this.motor.registro) {
					return ischafa;
				}
			}
		}
		return islegit;
	}
}
