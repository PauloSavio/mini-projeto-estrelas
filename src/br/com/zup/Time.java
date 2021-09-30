package br.com.zup;

import java.util.List;

public class Time {
    private List<Pokemon> pokemons;

    public Time(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        StringBuilder retornoDados = new StringBuilder();
        retornoDados.append("Time: " + getPokemons());
        return retornoDados.toString();
    }
}
