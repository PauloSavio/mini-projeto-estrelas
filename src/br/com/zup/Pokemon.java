package br.com.zup;

public class Pokemon {
    private String nome;
    private double ataque;
    private double vida;
    private Tipo elemento;

    public Pokemon() {
    }

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