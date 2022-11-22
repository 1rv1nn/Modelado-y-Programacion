package com.puppypets.vista.menu_vet;

import com.puppypets.vista.MiniPanel;

public class ConstructorOpcionesDelVeterinario {
	protected MiniPanel citasAgendadas;
	protected MiniPanel mascotasAgendadas;
	protected MiniPanel clientesPago;
	protected MiniPanel panelLogOut;
	
	public ConstructorOpcionesDelVeterinario setCitasAgendadas(MiniPanel citasAgendadas) {
		this.citasAgendadas = citasAgendadas;
		return this;
	}
	public ConstructorOpcionesDelVeterinario setMascotasAgendadas(MiniPanel mascotasAgendadas) {
		this.mascotasAgendadas = mascotasAgendadas;
		return this;
	}
	public ConstructorOpcionesDelVeterinario setClientesPago(MiniPanel clientesPago) {
		this.clientesPago = clientesPago;
		return this;
	}
	public ConstructorOpcionesDelVeterinario setPanelLogOut(MiniPanel panelLogOut) {
		this.panelLogOut = panelLogOut;
		return this;
	}
	
	
}
