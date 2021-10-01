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

    //Método executar:

    public static void executar() {

        Arena arena1 = new Arena();
        boolean menu = true;
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
            }else{
                //menu 2

                System.out.println("Para iniciar uma luta, digite 1");
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


}
