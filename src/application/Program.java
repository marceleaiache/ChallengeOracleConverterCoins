package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Seja bem vindo ao ConverterCoins");
        System.out.println("1) Dólar Americano -> Peso Argentino");
        System.out.println("2) Peso Argentino -> Dólar Americano");
        System.out.println("3) Dólar Canadense -> Peso Argentino");
        System.out.println("4) Peso Argentino -> Dólar Canadense");
        System.out.println("5) Dólar Americano -> Real Brasileiro");
        System.out.println("6) Real Brasileiro -> Dólar Americano");
        System.out.println("7) Dólar Canadense -> Real Brasileiro");
        System.out.println("8) Real Brasileiro -> Dólar Canadense");
        System.out.println("9) Sair");
        System.out.println("Escolha uma opção válida: ");
        System.out.println("**************************");

        sc.close();
    }
}
