package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String temporal = args[0];

        int n1 = Integer.parseInt(temporal);
        int palabramaslarga=0;
//nada
        int temporal2 = Integer.parseInt(temporal), temporal3;
        String[] palabra = new String[temporal2];
        Scanner input = new Scanner(System.in);
        char[] letras = new char[temporal2];
        //pedimos las palabras que queremos poner en la sopa de letras
        for (int i = 0; i < temporal2; i++) {
            System.out.println("Dime una palabra," + " quedan " + n1 + " palabras por poner");
            palabra[i] = input.nextLine();
            palabramaslarga= palabra[0].length();
            if(palabramaslarga<palabra[i].length()){
                palabramaslarga= palabra[i].length();
            }
            n1--;


        }
        String [][] sopa = new String[3*palabramaslarga][3*palabramaslarga];

        int palabrarandom1 = 3;
        System.out.println(palabrarandom1);
        int palabrarandom2 = 4;



        //sopa creada con Letra metida
        for (int i=0; i< sopa.length; i++){
            System.out.print("\n");
            for (int j=0; j< sopa[i].length; j++){
                if (i==palabrarandom1 && j==palabrarandom2){
                    System.out.print(palabra[0]);
                } else{
                    System.out.print(".");
                }
            }

        }

    }
}