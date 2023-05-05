package aplicacion.servicios;

import java.util.List;


import aplicacion.entidades.Usuarios;

public interface InterfazUsuarios {
public List<Usuarios> clinicaUsuarios(List<Usuarios> listaUsuarios);
	
	/**
	 * Actualiza la lista de repostajes con el nuevo repostaje normal
	 * @param listaAntiguaRepostaje lista actual
	 * @return lista actualizada
	 */
	
public void listarUsuarios(List<Usuarios> listaUsuarios);

}
