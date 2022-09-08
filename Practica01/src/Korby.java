public abstract class Korby {
	
	int vida;
	IAtaqueKorby ataque;
	IDefensaKorby defensa;
	
	
    public void realizaAtaque(Ditto dittu, Meganman megaman) {
    	ataque.ataca(dittu, megaman);
    }
    
    public void realizaDefensa(Korby kirby) {
    	defensa.defiende(kirby);
    }
    
    public void setVida(int vida) {
    	this.vida = vida;
    }
    
    public int getVida() {
    	return vida;
    }
}
