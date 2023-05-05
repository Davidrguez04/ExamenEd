package aplicacion.entidades;

public class Usuarios {
	//Atributos

			private int codigoIdentificador;
			private String nombre;
			
			private String apellidos="aaaaaaaaaaa";
				
			private boolean esVeterinario;
			

			
			//Getters y Setters
			public int getcodigoIdentificador() {
				return codigoIdentificador;
			}

			public void setcodigoIdentificador(int codigoIdentificador) {
				this.codigoIdentificador = codigoIdentificador;
			}
			

			public String getapellidos() {
				return apellidos;
			}

			public void setapellidos(String apellidos) {
				this.apellidos = apellidos;
			}

			

			public boolean getesVeterinario() {
				return esVeterinario;
			}

			public void setesVeterinario(boolean esVeterinario) {
				this.esVeterinario = esVeterinario;
			}

			public String getNombre() {
				return nombre;
			}

			public void setNombre(String nombre) {
				this.nombre = nombre;
			}



			

}
