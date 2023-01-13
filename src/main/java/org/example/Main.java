package org.example;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String temporal = args[0];

        int n1 = Integer.parseInt(temporal);
        int palabramaslarga = 0;
        int temporal2 = Integer.parseInt(temporal), temporal3;
        String[] palabras = new String[temporal2];
        Scanner input = new Scanner(System.in);
        char[] letras = new char[temporal2];


        //pedimos las palabras que queremos poner en la sopa de letras
        for (int i = 0; i < temporal2; i++) {
            System.out.println("Dime una palabra," + " quedan " + n1 + " palabras por poner");
            palabras[i] = input.nextLine();
            //calculamos la palabra más larga
            palabramaslarga = palabras[0].length();
            if (palabramaslarga < palabras[i].length()) {
                palabramaslarga = palabras[i].length();
            }
            n1--;

        }


        // System.out.println(letras);

        int p = 3 * palabramaslarga;
        char sopa[][] = new char[p][p];
        int iniciox;//= (int) (Math.random() * p);
        int inicioy;//= (int) (Math.random() * p);
        int finy, finx;

        for (int i = 0; i < sopa.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < sopa[i].length; j++) {
                //creamos letrasaleatorias para rellenar la sopa de letras
                //char letraaleatoria = (char) (Math.random() * 25 + 65);
                sopa[i][j] = '*';

            }

        }
//creamos una posición aleatoria para cada palabra
        for (int j = 0; j < palabras.length; j++) {
            iniciox = (int) (Math.random() * p);
            inicioy = (int) (Math.random() * p);
            finy= iniciox+ palabras[j].length();
            finx= iniciox+ palabras[j].length();
            letras = palabras[j].toCharArray();
            if (finx> sopa.length){

            }
            /*do {

            }while(iniciox< sopa.length ){

            }*/
            //ponemos en la sopa las palabras
            for (int i = 0; i < letras.length; i++) {
                sopa[iniciox][inicioy] = letras[i];
                inicioy++;
            }
        }

//printeo la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j]);

            }

        }


    }
}
