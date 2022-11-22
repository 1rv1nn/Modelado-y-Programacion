package com.puppypets.controlador;

import java.awt.event.ActionListener;

public interface CtrlFrames extends ActionListener{
	void iniciaFrame();
	void ocultaFrame();
	void limpiaCampos();
	void eliminaFrame();
	void mandaError(String error);
	void mandaMensaje(String mensaje, String titulo);
}
