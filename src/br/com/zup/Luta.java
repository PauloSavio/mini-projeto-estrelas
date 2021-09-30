package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Luta {
    private Long id;
    private Treinador treinador1;
    private Treinador treinador2;
    private List<Batalha> batalhas = new ArrayList<>();
    private int vitoriasTreinador1;
    private int vitoriasTreinador2;

    public Luta(Long id, Treinador treinador1, Treinador treinador2, List<Batalha> batalhas, int vitoriasTreinador1, int vitoriasTreinador2) {
        this.id = id;
        this.treinador1 = treinador1;
        this.treinador2 = treinador2;
        this.batalhas = batalhas;
        this.vitoriasTreinador1 = vitoriasTreinador1;
        this.vitoriasTreinador2 = vitoriasTreinador2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Treinador getTreinador1() {
        return treinador1;
    }

    public void setTreinador1(Treinador treinador1) {
        this.treinador1 = treinador1;
    }

    public Treinador getTreinador2() {
        return treinador2;
    }

    public void setTreinador2(Treinador treinador2) {
        this.treinador2 = treinador2;
    }

    public List<Batalha> getBatalhas() {
        return batalhas;
    }

    public void setBatalhas(List<Batalha> batalhas) {
        this.batalhas = batalhas;
    }

    public int getVitoriasTreinador1() {
        return vitoriasTreinador1;
    }

    public void setVitoriasTreinador1(int vitoriasTreinador1) {
        this.vitoriasTreinador1 = vitoriasTreinador1;
    }

    public int getVitoriasTreinador2() {
        return vitoriasTreinador2;
    }

    public void setVitoriasTreinador2(int vitoriasTreinador2) {
        this.vitoriasTreinador2 = vitoriasTreinador2;
    }

    @Override
    public String toString() {
        StringBuilder retornarDados = new StringBuilder();
        retornarDados.append("Identificação da Luta: " + getId());
        retornarDados.append("Treinador 1: " + getTreinador1());
        retornarDados.append("Treinador 2: " + getTreinador2());
        retornarDados.append("Batalhas: " + getBatalhas());
        retornarDados.append("Vitórias do Treinador 1: " + getVitoriasTreinador1());
        retornarDados.append("Vitórias do Treinador 2: " + getVitoriasTreinador2());
        return retornarDados.toString();
    }
}