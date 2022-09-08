interface Sujeto {
    void registrar(Espectador viewer);
    void remover(Espectador viewer);
    void notificar();
}
