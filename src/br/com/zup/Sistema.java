package br.com.zup;

import java.util.Scanner;

public class Sistema {
    // Método para Receber Dados
    public static Scanner receberDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void criarTimeCanto(){
        Time canto = new Time();
        Pokemon pokemon1 = new Pokemon("aaa",45,54,Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("bbb",45,54,Tipo.FOGO);
        Pokemon pokemon3 = new Pokemon("ccc",45,54,Tipo.FOGO);
        canto.adicionarPokemon(pokemon1);
        canto.adicionarPokemon(pokemon2);
        canto.adicionarPokemon(pokemon3);

    }

    public static void criarTimeAlola(){
        Time alola = new Time();
        Pokemon pokemon1 = new Pokemon("aaa",45,54,Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("bbb",45,54,Tipo.FOGO);
        Pokemon pokemon3 = new Pokemon("ccc",45,54,Tipo.FOGO);
        alola.adicionarPokemon(pokemon1);
        alola.adicionarPokemon(pokemon2);
        alola.adicionarPokemon(pokemon3);

    }

    public static void criarTimeXy(){
        Time xy = new Time();
        Pokemon pokemon1 = new Pokemon("aaa",45,54,Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("bbb",45,54,Tipo.FOGO);
        Pokemon pokemon3 = new Pokemon("ccc",45,54,Tipo.FOGO);
        xy.adicionarPokemon(pokemon1);
        xy.adicionarPokemon(pokemon2);
        xy.adicionarPokemon(pokemon3);

    }
}
