package aplicacion.servicios;

public class ImplMenu implements InterfaceMenu{

	@Override
	public void mostrarMenu() {		
		System.out.println("0. Salir");
		System.out.println("1. Registrar Usuarios");
		System.out.println("2. Listar Usuario");
	}
}

