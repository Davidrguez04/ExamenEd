package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Usuarios;
import aplicacion.servicios.ImplUsuarios;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.InterfazUsuarios;
import aplicacion.servicios.InterfaceMenu;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazUsuarios intR = new ImplUsuarios();
		InterfaceMenu intM = new ImplMenu();
		//Listado de repostajes (BD)
		List<Usuarios> listaUsuarios = new ArrayList<>();
				
				// Imprimir el menú por consola
				// Scanner con la opción del usuario
				Scanner entradaOpcion = new Scanner(System.in);		
				Boolean cerrarMenu = false;
				int opcion;
				while(!cerrarMenu) {	
					//Mostramos el menú
					intM.mostrarMenu();
					System.out.println("Introduza la opción deseada: ");
					opcion = entradaOpcion.nextInt();
					System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
					
					switch (opcion) {					
						case 0:
							cerrarMenu = true;
							break;							
						case 1:		
						intR.clinicaUsuarios(listaUsuarios);
							System.out.println();
							break;
						case 2:
							intR.listarUsuarios(listaUsuarios);
							break;
						default:

	}

}
				
	}
	}
