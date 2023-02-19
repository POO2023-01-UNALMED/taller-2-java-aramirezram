package test;
public class Motor {
	public int numeroCilindros,registro;
	public String tipo;
	
	public Motor(int numeroCilindros,int registro,String tipo) {
		this.numeroCilindros=numeroCilindros;
		this.registro=registro;
		this.tipo=tipo;
	}
	
	public void cambiarRegistro(int registro) {
		this.registro=registro;
	}
	
	public void asignarTipo(String tipo) {
		if(tipo.equals("electrico")||tipo.equals("gasolina")) this.tipo=tipo;
	}
}
