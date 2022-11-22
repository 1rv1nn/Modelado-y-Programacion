package com.puppypets.controlador;

import java.awt.event.ActionListener;

/**
 * Interface de CtrlFrames pues son acciones que todos los controladores
 * usuarán.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
public interface CtrlFrames extends ActionListener {

	/**
	 * Método para iniciar el frame
	 */
	void iniciaFrame();

	/**
	 * Método para ocultar el frame
	 */
	void ocultaFrame();

	/**
	 * Método para limpiar los datos que se ingresan en el frame.
	 */
	void limpiaCampos();

	/**
	 * Método para eliminar completamente el frame (Ya no se podrá abrir)
	 */
	void eliminaFrame();

	/**
	 * Método para agregar un error al frame
	 * 
	 * @param error Mensaje de error que se desplegará.
	 */
	void mandaError(String error);

	/**
	 * Método para mandar un mensaje en el frame.
	 * 
	 * @param mensaje Mensaje que se desplegará.
	 * @param titulo  Título del mensaje.
	 */
	void mandaMensaje(String mensaje, String titulo);
}
