package br.com.zup;

public class Pokemon {
    private String nome;
    private double ataque;
    private double vida;
    private Tipo elemento;

    public Pokemon(String nome, double ataque, double vida, Tipo elemento) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;
        this.elemento = elemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public Tipo getElemento() {
        return elemento;
    }

    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    public static double calcularDano(Pokemon atacante, Pokemon defensor){
        double ataque = atacante.getAtaque();
        double dano = ataque;
        if (atacante.getElemento() == Tipo.FOGO){
            if (defensor.getElemento() == Tipo.TERRA){
                dano = ataque * 2;
                System.out.println("Super efetivo!");
            }else if (defensor.getElemento() == Tipo.AGUA){
                dano = ataque/2;
                System.out.println("Pouco efetivo!");
            }else{
                System.out.println("Aguarde");
            }
        }
        if (atacante.getElemento() == Tipo.AGUA){
            if (defensor.getElemento() == Tipo.FOGO){
                dano = ataque * 2;
                System.out.println("Super efetivo!");
            }else if (defensor.getElemento() == Tipo.TERRA){
                dano = ataque/2;
                System.out.println("Pouco efetivo!");
            }else{
                System.out.println("Aguarde");
            }
        }
        if (atacante.getElemento() == Tipo.TERRA){
            if (defensor.getElemento() == Tipo.AGUA){
                dano = ataque * 2;
                System.out.println("Super efetivo!");
            }else if (defensor.getElemento() == Tipo.FOGO){
                dano = ataque/2;
                System.out.println("Pouco efetivo!");
            }else{
                System.out.println("Aguarde");
            }
        }
        return dano;
    }

    @Override
    public String toString() {
        StringBuilder retornarDados = new StringBuilder();
        retornarDados.append("\n Nome: " + getNome());
        retornarDados.append("\n Ataque: " + getAtaque());
        retornarDados.append("\n Vida: " + getVida());
        retornarDados.append("\n Elemento: " + getElemento());
        retornarDados.append("\n -----------------");
        return retornarDados.toString();
    }

}