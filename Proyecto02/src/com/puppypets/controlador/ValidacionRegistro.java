package com.puppypets.controlador;

import java.util.function.Function;

import com.puppypets.controlador.ValidacionRegistro.*;
import com.puppypets.controlador.singleton.CtrlClientes;
import com.puppypets.modelo.proxy.Cliente;

/**
 * Interface que comprueba la validez al registrar un nuevo usuario.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
public interface ValidacionRegistro extends Function<Cliente, Validacion> {

	/**
	 * Enumeración de resultados al validar
	 * 
	 * @author Cruz González Irvin Javier
	 * @author Ugalde Flores Jimena
	 * @author Ugalde Ubaldo Fernando
	 * @version Oracle JDK 17.0 LTS
	 *
	 */
	enum Validacion {
		EXITO, TEL_INVALIDO, NUM_CUENTA_INVALIDO, USUARIO_INVALIDO;
	}

	/**
	 * Método que regresa si el número de teléfono es válido.
	 * 
	 * @return Exito si es un teléfono válido o inválido en otro caso.
	 */
	static ValidacionRegistro esTelefonoValido() {
		return c -> c.getTelefono().chars().allMatch(Character::isDigit) && c.getTelefono().length() == 10
				? Validacion.EXITO
				: Validacion.TEL_INVALIDO;
	}

	/**
	 * Método que regresa si el número de cuenta bancaria es válido.
	 * 
	 * @return Exito si es un número de cuenta válido o inválido en otro caso.
	 */
	static ValidacionRegistro esCuentaValida() {
		return c -> c.getCuentaBancaria().chars().allMatch(Character::isDigit) ? Validacion.EXITO
				: Validacion.NUM_CUENTA_INVALIDO;
	}

	/**
	 * Método que regresa si el usuario es válido.
	 * 
	 * @return Exito si el usuario es válido o inválido en otro caso.
	 */
	static ValidacionRegistro esUsuarioValido() {
		return c -> !CtrlClientes.getInstancia().contieneCliente(c.getUsuario()) ? Validacion.EXITO : Validacion.USUARIO_INVALIDO;
	}

	/**
	 * Método que regresa si el registro es válido.
	 * 
	 * @return Exito si es un resitro válido o el error que se encontro.
	 */
	default ValidacionRegistro and(ValidacionRegistro other) {
		return c -> {
			Validacion resultado = this.apply(c);
			return resultado.equals(Validacion.EXITO) ? other.apply(c) : resultado;
		};
	}
}
