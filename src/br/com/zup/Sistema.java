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
        Pokemon pokemon1 = new Pokemon("Charmander", 75, 53, Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("Squirtle", 62, 71, Tipo.AGUA);
        Pokemon pokemon3 = new Pokemon("Sandshrew", 51, 84, Tipo.TERRA);

        canto.adicionarPokemon(pokemon1);
        canto.adicionarPokemon(pokemon2);
        canto.adicionarPokemon(pokemon3);
        return canto;

    }

    public static Time criarTimeAlola() {
        Time alola = new Time();

        alola.setNome("\t Alola");
        Pokemon pokemon1 = new Pokemon("Litten", 70, 58, Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("Popplio", 68, 43, Tipo.AGUA);
        Pokemon pokemon3 = new Pokemon("Diglet", 57, 78, Tipo.TERRA);

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
        Pokemon pokemon1 = new Pokemon("Fennekin", 76, 64, Tipo.FOGO);
        Pokemon pokemon2 = new Pokemon("Froakie", 61, 51, Tipo.AGUA);
        Pokemon pokemon3 = new Pokemon("Bunnelby", 56, 81, Tipo.TERRA);

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

    //Metodo exibir menu inicial
    public static void menuInicial() {
        System.out.println("Boas vindas à Arena pokemon Treinador!!!");
        System.out.println("Digite 1 para fazer sua inscrição");
        System.out.println("Digite 2 para sair");

    }

    //Método exibir menu com opção de batalha
    public static void menuComBatalha() {
        System.out.println("Já existem pelo menos 2 Treinadores na arena!");
        System.out.println("Digite 1 para iniciar uma luta!!! ");
        System.out.println("Digite 2 para sair");

    }

    //Método para exibir submenu de escolha de times
    public static void submenuTime() {
        System.out.println("Para escolher o time Canto, digite 1");
        System.out.println("Para escolher o time Alola, digite 2");
        System.out.println("Para escolher o time XY, digite 3");
    }

    //método para sortear pokemon
    public static Pokemon sorteiaPokemon(Treinador treinador1) {
        Time time1 = treinador1.getTime();

        List<Pokemon> pokemons1 = time1.getPokemons();

        int sorteiaPokemon1 = (int)(Math.random() * 3);

        Pokemon pokemon1 = pokemons1.get(sorteiaPokemon1);
        //para evitar que um pokemon que já tenha batalhado, batalhe de novo
        while (pokemon1.isExaustao()) {
            int reSorteiaPokemon1 = (int) (Math.random() * 3);
            pokemon1 = pokemons1.get(reSorteiaPokemon1);
        }

        return pokemon1;
    }



    //Método para calcular dano a ser aplicado de acordo com o elemento
    public static double calcularDano(Pokemon atacante, Pokemon defensor) {
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

    //método para aplicar o dano calculado no método calcularDano na vida do pokemon atacado
    public static double receberDano(double dano, Pokemon pokemonAtacado) {
        double novaVida = pokemonAtacado.getVida() - dano;
        if (pokemonAtacado.getVida() < 1) {
            System.out.println(pokemonAtacado.getNome() + " foi derrotado!");
        }
        return novaVida;

    }

    //Método de batalhas entre os pokemons
    public static void iniciarBatalha(Pokemon pokemon1, Pokemon pokemon2) {
        double iniciativa1 = Math.random();
        double iniciativa2 = Math.random();


        while (pokemon1.getVida() > 0 & pokemon2.getVida() > 0) {

            if (iniciativa1 > iniciativa2) {
                double dano = calcularDano(pokemon1, pokemon2);
                double vida = receberDano(dano, pokemon2);
                pokemon2.setVida(vida);
                System.out.println("\n " + pokemon1.getNome() + " causou  " + dano + " de dano em " + pokemon2.getNome());
                System.out.println(" A vida de " + pokemon2.getNome() + " é igual a: " + pokemon2.getVida());

                double dano2 = calcularDano(pokemon2, pokemon1);
                double vida2 = receberDano(dano2, pokemon1);
                pokemon1.setVida(vida2);
                System.out.println("\n " + pokemon2.getNome() + " causou  " + dano2 + " de dano em " + pokemon1.getNome());
                System.out.println(" A vida de " + pokemon1.getNome() + " é igual a: " + pokemon1.getVida());
            } else {
                double dano = calcularDano(pokemon2, pokemon1);
                double vida = receberDano(dano, pokemon1);
                pokemon1.setVida(vida);
                System.out.println("\n " + pokemon2.getNome() + " causou  " + dano + " de dano em " + pokemon1.getNome());
                System.out.println(" A vida de " + pokemon1.getNome() + " é igual a: " + pokemon1.getVida());

                double dano2 = calcularDano(pokemon1, pokemon2);
                double vida2 = receberDano(dano2, pokemon2);
                pokemon2.setVida(vida2);
                System.out.println("\n " + pokemon1.getNome() + " causou  " + dano2 + " de dano em " + pokemon2.getNome());
                System.out.println(" A vida de " + pokemon2.getNome() + " é igual a: " + pokemon2.getVida());

            }


        }
        pokemon1.setExaustao(true);
        pokemon2.setExaustao(true);

    }



    //Método de luta entre treinadores
    public static void iniciarLuta(Treinador treinador1, Treinador treinador2) {
        System.out.println("\n Está começando a luta entre o Treinador " + treinador1.getNome() + " e o Treinador " + treinador2.getNome() +"!!!");
        Time time1 = treinador1.getTime();
        Time time2 = treinador2.getTime();

        List<Pokemon> pokemons1 = time1.getPokemons();
        List<Pokemon> pokemons2 = time2.getPokemons();


        Pokemon pokemon1Time1 = sorteiaPokemon(treinador1);
        Pokemon pokemon1Time2 = sorteiaPokemon(treinador2);

        System.out.println("------------------------");
        System.out.println("\n Primeira batalha: " + pokemon1Time1.getNome() + " X " + pokemon1Time2.getNome());


        iniciarBatalha(pokemon1Time1, pokemon1Time2);

        double vidaPokemon1 = pokemon1Time1.getVida();
        double vidaPokemon2 = pokemon1Time2.getVida();

        if (vidaPokemon1 > vidaPokemon2) {
            int vitorias = treinador1.getVitorias();
            int atualizaVitoria = vitorias + 1;
            treinador1.setVitorias(atualizaVitoria);
            System.out.println("\n Parabéns! O " + pokemon1Time1.getNome() + " é o vencedor da batalha!");
        } else {
            int vitorias = treinador2.getVitorias();
            int atualizaVitoria = vitorias + 1;
            treinador2.setVitorias(atualizaVitoria);
            System.out.println("\n Parabéns! O " + pokemon1Time2.getNome() + " é o vencedor da batalha!");
        }


        Pokemon pokemon2Time1 = sorteiaPokemon(treinador1);
        Pokemon pokemon2Time2 = sorteiaPokemon(treinador2);


        System.out.println("------------------------");
        System.out.println("Segunda batalha: " + pokemon2Time1.getNome() + " X " + pokemon2Time2.getNome());


        iniciarBatalha(pokemon2Time1, pokemon2Time2);

        double vidaPokemon2Time1 = pokemon2Time1.getVida();
        double vidaPokemon2Time2 = pokemon2Time2.getVida();

        if (vidaPokemon2Time1 > vidaPokemon2Time2) {
            int vitorias = treinador1.getVitorias();
            int atualizaVitoria = vitorias + 1;
            treinador1.setVitorias(atualizaVitoria);
            System.out.println("\n Parabéns! O " + pokemon2Time1.getNome() + " é o vencedor da batalha!");
        } else {
            int vitorias = treinador2.getVitorias();
            int atualizaVitoria = vitorias + 1;
            treinador2.setVitorias(atualizaVitoria);
            System.out.println("\n Parabéns! O " + pokemon2Time2.getNome() + " é o vencedor da batalha!");
        }

        Pokemon pokemon3Time1 = sorteiaPokemon(treinador1);
        Pokemon pokemon3Time2 = sorteiaPokemon(treinador2);


        System.out.println("------------------------");
        System.out.println("Terceira batalha: " + pokemon3Time1.getNome() + " X " + pokemon3Time2.getNome());


        iniciarBatalha(pokemon3Time1, pokemon3Time2);

        double vidaPokemon3Time1 = pokemon3Time1.getVida();
        double vidaPokemon3Time2 = pokemon3Time2.getVida();

        if (vidaPokemon3Time1 > vidaPokemon3Time2) {
            int vitorias = treinador1.getVitorias();
            int atualizaVitoria = vitorias + 1;
            treinador1.setVitorias(atualizaVitoria);
            System.out.println("\n Parabéns! O " + pokemon3Time1.getNome() + " é o vencedor da batalha!");
        } else {
            int vitorias = treinador2.getVitorias();
            int atualizaVitoria = vitorias + 1;
            treinador2.setVitorias(atualizaVitoria);
            System.out.println("\n Parabéns! O " + pokemon3Time2.getNome() + " é o vencedor da batalha!");
        }


        //mostrando o treinador vencedor da batalha
        int vitoriasTreinador1 = treinador1.getVitorias();
        int vitoriasTreinador2 = treinador2.getVitorias();

        System.out.println("\n Vitórias de " + treinador1.getNome() + ": " + vitoriasTreinador1);
        System.out.println(" Vitórias de " + treinador2.getNome() + ": " + vitoriasTreinador2);
        if (vitoriasTreinador1 > vitoriasTreinador2) {
            System.out.println("\n Fantástico!!! O Treinador " + treinador1.getNome() + " da cidade de " + treinador1.getCidade() + " é o vencedor!!!");
        } else {
            System.out.println("\n Fantástico!!! O Treinador " + treinador2.getNome() + " da cidade de " + treinador2.getCidade() + " é o vencedor!!!");
        }

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
                //Menu 2 quando existem pelo menos 2 treinadores na arena
                menuComBatalha();
                int escolhaUsuarioC = receberDados("Digite a opção desejada: ").nextInt();

                if (escolhaUsuarioC == 1) {
                    treinadores = arena1.getTreinadores();
                    iniciarLuta(treinadores.get(0), treinadores.get(1));
                    menu = false;

                } else if (escolhaUsuarioC == 2) {
                    System.out.println("Até a próxima Treinador!!!");
                    menu = false;
                }


            }


        }


    }


}
