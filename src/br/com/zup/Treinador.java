package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Treinador {
    private String nome;
    private String cidade;
    private Time timeEscolhido;
    private int vitorias;

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

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
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




