package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Pokemon> pokemons = new ArrayList<>();

    public Time() {
    }
    public Time(String nome) {
        this.nome = nome;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    @Override
    public String toString() {
        StringBuilder retornoDados = new StringBuilder();
        retornoDados.append( nome + "\n");
        retornoDados.append(getPokemons());
        return retornoDados.toString();
    }
}
