package aplicacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Usuarios;
import aplicacion.entidades.VeterinariosPropietarios;

import java.util.List;

	/**
	 * Implementación de la InterfazUsuarios
	 * @author garfe
	 *
	 */
	public class ImplUsuarios implements InterfazUsuarios{


		@Override
		public List<Usuarios> clinicaUsuarios(List<Usuarios>listaUsuarios) {
			Usuarios clinica = new Usuarios();
			VeterinariosPropietarios clinicaVet = new VeterinariosPropietarios();
			Scanner valores = new Scanner(System.in);
			System.out.println("Introduzca su nombre: ");
			clinica.setNombre(valores.next());
			System.out.println("Introduzca sus apellidos: ");
			clinica.setapellidos(valores.nextLine());
			
			System.out.println("Introduzca el numero de Colegiado: ");
			clinicaVet.setnumeroColegiado(valores.next());
			listaUsuarios.add(clinica);
			return listaUsuarios;
		}
		
		public void listarUsuarios(List<Usuarios> listaUsuarios) {
			VeterinariosPropietarios veterinariosPropietarios = new VeterinariosPropietarios();
			veterinariosPropietarios.toString();
			System.out.println(listaUsuarios);
		}
	}


