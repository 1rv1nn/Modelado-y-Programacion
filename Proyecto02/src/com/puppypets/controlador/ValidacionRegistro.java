package com.puppypets.controlador;

import java.util.function.Function;

import com.puppypets.controlador.ValidacionRegistro.*;
import com.puppypets.controlador.singleton.CtrlClientes;
import com.puppypets.modelo.proxy.Cliente;

public interface ValidacionRegistro extends Function<Cliente, Validacion> {
	CtrlClientes cc = CtrlClientes.getInstancia();

	enum Validacion {
		EXITO,
		TEL_INVALIDO,
		NUM_CUENTA_INVALIDO,
		USUARIO_INVALIDO;
	}
	
	public static ValidacionRegistro esTelefonoValido() {
		return c -> c.getTelefono().chars().allMatch(Character::isDigit) && c.getTelefono().length() == 10 ?
				Validacion.EXITO : Validacion.TEL_INVALIDO;
	}
	
	static ValidacionRegistro esCuentaValida() {
		return c -> c.getCuentaBancaria().chars().allMatch(Character::isDigit) ?
				Validacion.EXITO : Validacion.NUM_CUENTA_INVALIDO;
	}

	static ValidacionRegistro esUsuarioValido() {
		return c -> !cc.contieneCliente(c.getUsuario()) ?
				Validacion.EXITO : Validacion.USUARIO_INVALIDO;
	}
	
	default ValidacionRegistro and (ValidacionRegistro other) {
		return c ->{
			Validacion resultado = this.apply(c);
			return resultado.equals(Validacion.EXITO) ? other.apply(c) : resultado;
		};
	}
}
