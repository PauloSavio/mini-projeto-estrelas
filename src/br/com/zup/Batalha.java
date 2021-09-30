package br.com.zup;

public class Batalha {
    private Long id;
    private Pokemon pokemonTreinador1;
    private Pokemon pokemonTreinador2;
    private Pokemon vencedor;

    public Batalha(Long id, Pokemon pokemonTreinador1, Pokemon pokemonTreinador2, Pokemon vencedor) {
        this.id = id;
        this.pokemonTreinador1 = pokemonTreinador1;
        this.pokemonTreinador2 = pokemonTreinador2;
        this.vencedor = vencedor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pokemon getPokemonTreinador1() {
        return pokemonTreinador1;
    }

    public void setPokemonTreinador1(Pokemon pokemonTreinador1) {
        this.pokemonTreinador1 = pokemonTreinador1;
    }

    public Pokemon getPokemonTreinador2() {
        return pokemonTreinador2;
    }

    public void setPokemonTreinador2(Pokemon pokemonTreinador2) {
        this.pokemonTreinador2 = pokemonTreinador2;
    }

    public Pokemon getVencedor() {
        return vencedor;
    }

    public void setVencedor(Pokemon vencedor) {
        this.vencedor = vencedor;
    }

    @Override
    public String toString() {
        StringBuilder retornoDados = new StringBuilder();
        retornoDados.append("Identificação da Batalha: " + id);
        retornoDados.append("Pokemon 1: " + getPokemonTreinador1());
        retornoDados.append("Pokemon 2: " + getPokemonTreinador2());
        retornoDados.append("Pokemon vencedor: " + getVencedor());
        return retornoDados.toString();
    }
}

