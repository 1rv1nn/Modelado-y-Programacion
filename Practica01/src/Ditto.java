public abstract class Ditto {
	int vida;
	IAtaqueDitto ataque;
	IDefensaDitto defensa;
	
	
    public void realizaAtaque(Korby kirby, Meganman megaman) {
    	ataque.ataca(kirby, megaman);
    }
    
    public void realizaDefensa(Ditto dittu) {
    	defensa.defiende(dittu);
    }
    
    public void setVida(int vida) {
    	this.vida = vida;
    }
    
    public int getVida() {
    	return vida;
    }
}
