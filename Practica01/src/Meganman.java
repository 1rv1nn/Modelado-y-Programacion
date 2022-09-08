interface Meganman {
    void realizaAtaque();
    void realizaDefensa();

    class MeganmanBasico {
	int vida;
	IAtaqueMeganman ataque;
	IDefensaMeganman defensa;

	public MeganmanBasico(){
	    vida = 100;
	    ataque = new AtaqueSimpleMeganman;
	    defensa = new DefensaSimple;
	}
    }
    
    class  MeganmanBoomerang {
	int vida;
	IAtaqueMeganman ataque;
	IDefensaMeganman defensa;

	public MeganmanBoomerang(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueBoomerang;
	    defensa = new DefensaSaltando;
	}
    }
    
    class MeganmanBombastico {
	int vida;
	IAtaqueMeganman ataque;
	IDefensaMeganman defensa;

	public MeganmanBombastico(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueConGranadas;
	    defensa = new DefensaRepeliendo;
	}
    }

    class  MeganmanDeFuego {
	int vida;
	IAtaqueMeganman ataque;
	IDefensaMeganman defensa;

	public MeganmanBoomerang(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueBolasDeFuego;
	    defensa = new DefensaDeFuego;	    
	}
    }    
} 
