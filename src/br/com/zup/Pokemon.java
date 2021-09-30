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

    @Override
    public String toString() {
        StringBuilder retornarDados = new StringBuilder();
        retornarDados.append("Nome: " + getNome());
        retornarDados.append("Ataque: " + getAtaque());
        retornarDados.append("Vida: " + getVida());
        retornarDados.append("Elemento: " + getElemento());
        return retornarDados.toString();
    }
}