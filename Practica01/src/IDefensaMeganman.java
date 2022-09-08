interface IDefensaMeganman {

    void defiende();

    class DefensaSimple {

	public void defiende(){
	    this.setVida(getVida() + 5);
	}
    }

    class DefensaSaltando {
	public void defiende() {
	    this.setVida(getVida() + 7)
	}
    }

    class DefensaRepeliendo {
	public void defiende() {
	    this.setVida(getVida() + 8)
	}
    }

    class DefensaDeFuego {
	public void defiende() {
	    this.setVida(getVida() + 10)
	}
    }

}
