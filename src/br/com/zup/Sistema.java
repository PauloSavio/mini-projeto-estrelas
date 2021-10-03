package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    // Método para Receber Dados
    public static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //criando times
    public static Time criarTimeCanto() {
        Time canto = new Time();

        canto.setNome("\t Canto");
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

        alola.setNome("\t Alola");
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

        xy.setNome("\t XY");

        xy.setNome("\t XY");
        Pokemon pokemon1 = new Pokemon("Fennekin", 45, 54, Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("Froakie", 45, 54, Tipo.AGUA);
        Pokemon pokemon3 = new Pokemon("Bunnelby", 45, 54, Tipo.TERRA);

        xy.adicionarPokemon(pokemon1);
        xy.adicionarPokemon(pokemon2);
        xy.adicionarPokemon(pokemon3);
//        System.out.println(xy);
        return xy;
    }

    //método para criar treinador
    public static Treinador criaTreinador() {
        String nomeTreinador = receberDados("Digite o nome do treinador").nextLine();
        String nomeCidade = receberDados("Digite o nome da cidade").nextLine();
        Treinador treinador = new Treinador(nomeTreinador, nomeCidade);
        return treinador;
    }


    //submenu
    public static void submenuTime() {
        System.out.println("Para escolher o time Canto, digite 1");
        System.out.println("Para escolher o time Alola, digite 2");
        System.out.println("Para escolher o time XY, digite 3");
    }


    public static void executar() {

        Arena arena1 = new Arena();
        boolean menu = true;
        List<Treinador> treinadores = new ArrayList<>();
        while (menu) {

            int qtdeTreinador = arena1.getTreinadores().size();
            if (qtdeTreinador < 2) {
                menuInicial();
                int escolhaUsuario = receberDados("Digite a opção desejada: ").nextInt();

                if (escolhaUsuario == 1) {
                    Treinador treinador = criaTreinador();


                    //exibindo times
                    System.out.println("Os times disponíveis são: ");
                    System.out.println(criarTimeCanto().toString());
                    System.out.println(criarTimeAlola().toString());
                    System.out.println(criarTimeXy().toString());

                    boolean submenu = true;
                    while (submenu) {
                        submenuTime();
                        int escolhaUsuarioB = receberDados("Digite a opção desejada: ").nextInt();
                        if (escolhaUsuarioB == 1) {
                            Time timeEscolhido = criarTimeCanto();
                            treinador.setTime(timeEscolhido);
                        } else if (escolhaUsuarioB == 2) {
                            Time timeEscolhido = criarTimeAlola();
                            treinador.setTime(timeEscolhido);
                        } else {
                            Time timeEscolhido = criarTimeXy();
                            treinador.setTime(timeEscolhido);
                        }
                        System.out.println(treinador);
                        submenu = false;
                    }
                    arena1.adicionarTreinador(treinador);
                    qtdeTreinador = arena1.getTreinadores().size();
                    System.out.println("Quantidade de treinadores na Arena: " + qtdeTreinador);

                } else if (escolhaUsuario == 2) {
                    System.out.println("Até a próxima!");
                    menu = false;
                }
            } else {
                //menu 2

                System.out.println("Para iniciar uma luta, digite 1");
                treinadores = arena1.getTreinadores();
                iniciarLuta(treinadores.get(0), treinadores.get(1));
                menu = false;
            }


        }


    }

    //Metodo exibir menu inicial

    public static void menuInicial() {

        System.out.println("Boas vindas à Arena pokemon Treinador!!!");
        System.out.println("Digite 1 para fazer sua inscrição");
        System.out.println("Digite 2 para sair");

    }


    public static void iniciarLuta(Treinador treinador1, Treinador treinador2) {
        System.out.println("Está começando a luta!");
        Time time1 = treinador1.getTime();
        Time time2 = treinador2.getTime();

        List<Pokemon> pokemons1 = time1.getPokemons();
        List<Pokemon> pokemons2 = time2.getPokemons();

        Pokemon pokemon1Time1 = pokemons1.get(0);
        Pokemon pokemon1Time2 = pokemons2.get(0);

        iniciarBatalha(pokemon1Time1, pokemon1Time2);

    }

    public static void iniciarBatalha(Pokemon pokemon1, Pokemon pokemon2) {
        double iniciativa1 = Math.random();
        double iniciativa2 = Math.random();


        System.out.println("Primeira batalha");

        while (pokemon1.getVida() > 0 & pokemon2.getVida() > 0) {

            if (iniciativa1 > iniciativa2) {
                double dano = calcularDano(pokemon1, pokemon2);
                double vida = receberDano(dano, pokemon2);
                pokemon2.setVida(vida);
                dano = calcularDano(pokemon2, pokemon1);
                vida = receberDano(dano, pokemon1);
                pokemon1.setVida(vida);
            } else {
                double dano = calcularDano(pokemon2, pokemon1);
                double vida = receberDano(dano, pokemon1);
                pokemon1.setVida(vida);
                dano = calcularDano(pokemon1, pokemon2);
                vida = receberDano(dano, pokemon2);
                pokemon2.setVida(vida);
            }

            if (iniciativa1 > iniciativa2) {
                double dano = calcularDano(pokemon1, pokemon2);
                double vida = receberDano(dano, pokemon2);
                pokemon2.setVida(vida);
                System.out.println(pokemon1 + " causou " + dano + " de dano em " + pokemon2);
            } else {
                double dano = calcularDano(pokemon2, pokemon1);
                double vida = receberDano(dano, pokemon1);
                pokemon1.setVida(vida);
                System.out.println(pokemon2 + " causou " + dano + "de dano em " + pokemon1);

            }


        }

        public static double calcularDano (Pokemon atacante, Pokemon defensor){
            double ataque = atacante.getAtaque();
            double dano = ataque;
            if (atacante.getElemento().equals(Tipo.FOGO)) {
                if (defensor.getElemento().equals(Tipo.TERRA)) {
                    System.out.println("Super efetivo!");
                    return dano = ataque * 2;
                } else if (defensor.getElemento().equals(Tipo.AGUA)) {
                    System.out.println("Pouco efetivo!");
                    return dano = ataque / 2;
                }
            }
            if (atacante.getElemento().equals(Tipo.AGUA)) {
                if (defensor.getElemento().equals(Tipo.FOGO)) {
                    System.out.println("Super efetivo!");
                    return dano = ataque * 2;
                } else if (defensor.getElemento().equals(Tipo.TERRA)) {
                    System.out.println("Pouco efetivo!");
                    return dano = ataque / 2;
                }
            }
            if (atacante.getElemento().equals(Tipo.TERRA)) {
                if (defensor.getElemento().equals(Tipo.AGUA)) {
                    System.out.println("Super efetivo!");
                    return dano = ataque * 2;
                } else if (defensor.getElemento().equals(Tipo.FOGO)) {
                    System.out.println("Pouco efetivo!");
                    return dano = ataque / 2;
                }
            }
            System.out.println(atacante.getNome() + " está atacando " + defensor.getNome());
            System.out.println("A vida de " + defensor.getNome() + " é " + defensor.getVida());
            return dano;
        }

        public static double receberDano ( double dano, Pokemon pokemonAtacado){
            double novaVida = pokemonAtacado.getVida() - dano;
            if (pokemonAtacado.getVida() < 1) {
                System.out.println(pokemonAtacado.getNome() + " foi derrotado!");
            }
            return novaVida;

        }


    }
