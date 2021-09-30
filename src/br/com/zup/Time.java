package br.com.zup;

import java.util.List;

public class Time {
    private List<Pokemon> pokemons;

    public Time() {
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void adicionarPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    @Override
    public String toString() {
        StringBuilder retornoDados = new StringBuilder();
        retornoDados.append("Time: " + getPokemons());
        return retornoDados.toString();
    }
}
