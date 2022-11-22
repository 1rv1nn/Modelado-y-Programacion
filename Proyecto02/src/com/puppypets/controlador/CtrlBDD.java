//package com.puppypets.controlador;
//
//import java.util.ArrayList;
//
//import com.puppypets.modelo.BaseDeDatos;
//import com.puppypets.modelo.Cliente;
//import com.puppypets.modelo.Mascota;
//import com.puppypets.modelo.Veterinario;
//
//public class CtrlBDD {
//	private static CtrlBDD controlador;
////	private ArrayList<Cliente> clientes;
////	private ArrayList<Mascota> mascotas;
////	private ArrayList<Veterinario> veterinarios;
////	
////	private CtrlBDD() {
////		clientes = BaseDeDatos.getInstancia().getClientes();
////		mascotas = BaseDeDatos.getInstancia().getMascotas();
////		veterinarios = BaseDeDatos.getInstancia().getVeterinarios();
////	}
////	
////	public static CtrlBDD getInstancia() {
////		if(controlador == null) {
////			controlador = new CtrlBDD();
////		}
////		return controlador;
////	}
////	
//////	public Optional<Usuario> obtenerUsuario(String usuario) {
//////		if(veterinarios.stream().anyMatch(v -> v.getUsuario().equals(usuario))) {
//////			return Optional.of(veterinarios.stream().filter(v -> v.getUsuario().equals(usuario)).findAny().get());
//////		} else if(clientes.stream().anyMatch(c -> c.getUsuario().equals(usuario)))
//////		
//////		return Optional.empty();
//////	}
//	
//}
