package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextInt();
        System.out.println("Digite o Segundo valor: ");
        b = scanner.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        double dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);


        System.out.println("somar " + somar);
        System.out.println("subtrair " + subtrair);
        System.out.println("divirdir " + dividir);
        System.out.println("multiplicar " + multiplicar);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static double dividir(double a, double b) {
        return a / b;

    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
