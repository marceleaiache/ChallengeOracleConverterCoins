package application;

import entities.ConverterCoin;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("**************************");
                System.out.println("Seja bem vindo ao ConverterCoins");
                System.out.println();
                System.out.println("1) Dólar Americano -> Peso Argentino");
                System.out.println("2) Peso Argentino -> Dólar Americano");
                System.out.println("3) Dólar Canadense -> Peso Argentino");
                System.out.println("4) Peso Argentino -> Dólar Canadense");
                System.out.println("5) Dólar Americano -> Real Brasileiro");
                System.out.println("6) Real Brasileiro -> Dólar Americano");
                System.out.println("7) Dólar Canadense -> Real Brasileiro");
                System.out.println("8) Real Brasileiro -> Dólar Canadense");
                System.out.println("9) Sair");
                System.out.println();
                System.out.println("Escolha uma opção válida: ");
                System.out.println("**************************");

                int option = Integer.parseInt(sc.nextLine().trim());

                if (option >= 1 && option <= 8) {
                    System.out.println("Informe o valor a ser convertido:");
                    double amount = Double.parseDouble(sc.nextLine().trim());
                    ConverterCoin converter = getConverter(option, amount);
                    System.out.println("Deseja realizar outra conversão? (S/N):");
                    String resposta = sc.nextLine().trim();
                    if (!resposta.equalsIgnoreCase("S")) {
                        continuar = false;
                    }
                } else if (option == 9) {
                    continuar = false;
                } else {
                    System.out.println("Opção inválida! Por favor, escolha um número de 1 a 9.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor insira um número válido de 1-9");
            }
        }
        sc.close();
    }

    private static ConverterCoin getConverter(int option, double amount) {
        switch (option) {
            case 1:
                return new ConverterCoin("USD", "ARS", amount);
            case 2:
                return new ConverterCoin("ARS", "USD", amount);
            case 3:
                return new ConverterCoin("CAD", "ARS", amount);
            case 4:
                return new ConverterCoin("ARS", "CAD", amount);
            case 5:
                return new ConverterCoin("USD", "BRL", amount);
            case 6:
                return new ConverterCoin("BRL", "USD", amount);
            case 7:
                return new ConverterCoin("CAD", "BRL", amount);
            case 8:
                return new ConverterCoin("BRL", "CAD", amount);
            default:
                throw new IllegalArgumentException("Opção inválida: " + option);
        }
    }
}
