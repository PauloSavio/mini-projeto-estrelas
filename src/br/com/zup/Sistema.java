package br.com.zup;

import java.util.Scanner;

public class Sistema {
    // Método para Receber Dados
    public static Scanner receberDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    // testando
}
