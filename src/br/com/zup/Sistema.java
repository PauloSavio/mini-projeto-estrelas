package br.com.zup;

import java.util.Scanner;

public class Sistema {

    public static void IniciaPrograma() {

    }

    // Método para Receber Dados
    public static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //criando times
    public static Time criarTimeCanto() {
        Time canto = new Time();
        Pokemon pokemon1 = new Pokemon("Charmander", 45, 100, Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("Squirtle", 45, 100, Tipo.AGUA);
        Pokemon pokemon3 = new Pokemon("Sandshrew", 45, 100, Tipo.TERRA);
        canto.adicionarPokemon(pokemon1);
        canto.adicionarPokemon(pokemon2);
        canto.adicionarPokemon(pokemon3);
        return canto;

    }

    public static Time criarTimeAlola() {
        Time alola = new Time();
        Pokemon pokemon1 = new Pokemon("Litten", 45, 54, Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("Popplio", 45, 54, Tipo.AGUA);
        Pokemon pokemon3 = new Pokemon("Diglet", 45, 54, Tipo.TERRA);
        alola.adicionarPokemon(pokemon1);
        alola.adicionarPokemon(pokemon2);
        alola.adicionarPokemon(pokemon3);
//        System.out.println(alola);
        return alola;
    }

    public static Time criarTimeXy() {
        Time xy = new Time();
        Pokemon pokemon1 = new Pokemon("Fennekin", 45, 54, Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("Froakie", 45, 54, Tipo.AGUA);
        Pokemon pokemon3 = new Pokemon("Bunnelby", 45, 54, Tipo.TERRA);
        xy.adicionarPokemon(pokemon1);
        xy.adicionarPokemon(pokemon2);
        xy.adicionarPokemon(pokemon3);
//        System.out.println(xy);
        return xy;
    }

    //método para exibir times


    //método provisório para testes
    public static void testar() {

        System.out.println(criarTimeAlola().toString());;
        System.out.println(criarTimeCanto().toString());
        System.out.println(criarTimeXy().toString());

    }

}
