package br.com.dio.exercicios.collection;

import sun.awt.image.IntegerComponentRaster;

import javax.swing.*;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crime {

    public static void main(String[] args) {

        /*           RESPONDA APENAS COM "SIM" OU "NAO"

         */

        List<String> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Questionario: ");

        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        questions.add(resposta.toLowerCase());


        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        questions.add(resposta.toLowerCase());

        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        questions.add(resposta.toLowerCase());

        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        questions.add(resposta.toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        questions.add(resposta.toLowerCase());

        System.out.println(questions);

        int count = 0;
        Iterator<String> contador = questions.iterator();
        while (contador.hasNext()) {
            String resp = contador.next();
            if (resp.contains("s")) {
                count++;
            }
        }

        switch (count) {
            case 2:
                System.out.println("HMMMM SUSPETO");
                break;

            case 3:
            case 4:
                System.out.println("COMPARSA! CADEIA NELE");
                break;

            case 5:
                System.out.println("É CULPADO!, CADEIA NELE");
                break;
            default:
                System.out.println("INOCENTE, MAS ESTAMOS DE OLHO!");
                break;
        }
    }
}