package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Arena {
    private List<Luta>lutas = new ArrayList<>();
    private List<Treinador>treinadores = new ArrayList<>();

    public Arena(List<Luta> lutas, List<Treinador> treinadores) {
        this.lutas = lutas;
        this.treinadores = treinadores;
    }

    public List<Luta> getLutas() {
        return lutas;
    }

    public void setLutas(List<Luta> lutas) {
        this.lutas = lutas;
    }

    public List<Treinador> getTreinadores() {
        return treinadores;
    }

    public void setTreinadores(List<Treinador> treinadores) {
        this.treinadores = treinadores;
    }
}
