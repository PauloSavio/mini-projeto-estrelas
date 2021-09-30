package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Treinador {
    private String nome;
    private String cidade;
    private List<Time> times = new ArrayList<>();

    public Treinador(String nome, String cidade, List<Time> times) {
        this.nome = nome;
        this.cidade = cidade;
        this.times = times;
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

    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    @Override
    public String toString() {
        StringBuilder retornoDados = new StringBuilder();
        retornoDados.append("Nome do Treinador: " + getNome());
        retornoDados.append("Cidade do Treinador: " + getCidade());
        retornoDados.append("Time: " + getTimes());
        return retornoDados.toString();
    }
}




