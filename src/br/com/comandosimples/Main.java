package br.com.comandosimples;

import model.Conta;

public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta(555);
        Conta conta2 = new Conta(555);

        int x = 10;
        int y = 10;

        if ( conta1.equals(conta2)){
            System.out.println("É igual");
        }else System.out.println("Diferente");
    }
}
