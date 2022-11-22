package com.puppypets.controlador;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import com.puppypets.controlador.ValidacionRegistro.Validacion;
import com.puppypets.modelo.BaseDeDatos;
import com.puppypets.modelo.Mascota;
import com.puppypets.modelo.proxy.Cliente;

/**
 * Clase que implementa el controlador de los clientes para ejecutar sus
 * operaciones.
 * 
 * @author 106956120
 * @version Oracle JDK 17.0 LTS
 */
public class CtrlClientes {
	private static CtrlClientes cc;
	private Set<Cliente> clientes;

	/**
	 * Método constructor de la clase.
	 */
	private CtrlClientes() {
		clientes = BaseDeDatos.getInstancia().getClientes();
	}

	/**
	 * Método para obtener un instancia del controlador.
	 * 
	 * @return Controlador de los clientes.
	 */
	public static CtrlClientes getInstancia() {
		if (cc == null) {
			cc = new CtrlClientes();
		}
		return cc;
	}

	/**
	 * Método para verificar si existe el cliente a través de su nombre de usuario.
	 * 
	 * @param usuario Nombre de usuario del cliente.
	 * @return True si existe el cliente, false en otro caso.
	 */
	public boolean contieneCliente(String usuario) {
		return clientes.stream().anyMatch(c -> c.getUsuario().equals(usuario))
				|| BaseDeDatos.getInstancia().getVeterinarios().stream().anyMatch(v -> v.getUsuario().equals(usuario));
	}

	/**
	 * Método para obtener un cliente a través del nombre de usuario.
	 * 
	 * @param usuario Nombre de usuario del cliente.
	 * @return Optional del cliente para que se utilice el cliente en caso de que
	 *         exista.
	 */
	public Optional<Cliente> obtenerCliente(String usuario) {
		return clientes.stream().filter(c -> c.getUsuario().equals(usuario)).findAny();
	}

	/**
	 * Método para agregar un cliente nuevo.
	 * 
	 * @param c Cliente que se agregará.
	 */
	public void agregaCliente(Cliente c) {
		clientes.add(c);
	}

	/**
	 * Método para validar la información que ingresa un usuario al querer
	 * registrarse.
	 * 
	 * @param c Datos que el cliente ingreso.
	 * @return String que devuelve si la información es correcta o que error surgió.
	 */
	public String validaDatosCliente(Cliente c) {
		Validacion resultado = ValidacionRegistro.esCuentaValida().and(ValidacionRegistro.esTelefonoValido())
				.and(ValidacionRegistro.esUsuarioValido()).apply(c);
		return resultado.toString();
	}
	
	public Optional<Mascota> encuentraMascota(Cliente c, Mascota m) {
		return c.getMascotas().stream().filter(mismaMascota(m)).findAny();
	}
	
	public Predicate<Mascota> mismaMascota(Mascota mascota) {
		Predicate<Mascota> mismoNombre = m -> m.getNombre().equals(mascota.getNombre());
		Predicate<Mascota> mismaEdad = m -> m.getEdad() == mascota.getEdad();
		Predicate<Mascota> mismaEspecie = m -> m.getEspecie().equals(mascota.getEspecie());
		Predicate<Mascota> mismoSexo = m -> m.getSexo().equals(mascota.getSexo());
		return mismoNombre.and(mismaEdad).and(mismaEspecie).and(mismoSexo);
	}
	
}
