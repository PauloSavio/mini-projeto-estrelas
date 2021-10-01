package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Treinador {
    private String nome;
    private String cidade;
    private Time timeEscolhido;

    public Treinador() {
    }

    public Treinador(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Time getTime() {
        return timeEscolhido;
    }

    public void setTime(Time times) {
        this.timeEscolhido = times;
    }

    @Override
    public String toString() {
        StringBuilder retornoDados = new StringBuilder();
        retornoDados.append("Nome do Treinador: " + getNome());
        retornoDados.append("\n Cidade do Treinador: " + getCidade());
        retornoDados.append("\n Time: " + getTime());
        return retornoDados.toString();
    }
}




