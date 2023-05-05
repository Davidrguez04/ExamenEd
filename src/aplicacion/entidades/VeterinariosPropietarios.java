package aplicacion.entidades;

public class VeterinariosPropietarios extends Usuarios{

	//Atributos
	private int numeroMascotas;
	
	private String numeroColegiado = "aaaaaaaaaa";
	
	//Getters y Setters
	
	public String getnumeroColegiado() {
		return numeroColegiado;
	}

	public void setnumeroColegiado(String numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}
	
	
	public int getnumeroMascotas() {
		return numeroMascotas;
	}

	public void setnumeroMascotas(int numeroMascotas) {
		this.numeroMascotas = numeroMascotas;
	}
	
	@Override
	public String toString() {
		return " [" + getNombre() + " " + getapellidos() + " es " + getesVeterinario() + "y su numero de coelgiado es " + numeroColegiado
				+   "]";
	}
	
}
