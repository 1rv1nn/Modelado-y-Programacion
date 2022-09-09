public abstract class Meganman {
	int vida;
	IAtaqueMeganman ataque;
	IDefensaMeganman defensa;
	
	
    public void realizaAtaque(Korby kirby, Ditto dittu) {
    	ataque.ataca(kirby, dittu);
    }
    
    public void realizaDefensa(Meganman megaman) {
    	defensa.defiende(megaman);
    }
    
    public void setVida(int vida) {
    	this.vida = vida;
    }
    
    public int getVida() {
    	return vida;
    }
    
    
	public String getNombre() {
		return "Meganman";
	}
} 
