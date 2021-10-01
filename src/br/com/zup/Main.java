package br.com.zup;

public class Main {

    public static void main(String[] args) {

        Treinador treinador1 = Sistema.criaTreinador();
        Treinador treinador2 = Sistema.criaTreinador();

        treinador1.setTime(Sistema.criarTimeAlola());
        treinador2.setTime(Sistema.criarTimeXy());

        System.out.println(treinador2.getTime().getPokemons().get(0).getVida());
        Sistema.iniciarLuta(treinador1, treinador2);
        System.out.println(treinador2.getTime().getPokemons().get(0).getVida());


 
        Sistema.executar();
 

    }
}
