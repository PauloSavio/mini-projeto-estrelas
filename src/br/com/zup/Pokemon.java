package br.com.zup;

public class Pokemon {
    private String nome;
    private int ataque;
    private int vida;
    private Tipo elemento;

    public Pokemon(String nome, int ataque, int vida, Tipo elemento) {
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

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Tipo getElemento() {
        return elemento;
    }

    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    public int calcularDano(Pokemon atacante, Pokemon defensor){
        int ataque = atacante.getAtaque();
        int dano = ataque;
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