

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
        float VERToHOR, DiagonalArribaOAbajo;

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                //creamos letrasaleatorias para rellenar la sopa de letras
                char letraaleatoria = (char) (Math.random() * 25 + 65);
                sopa[i][j] = '*';

            }

        }
            //creamos una posición aleatoria para cada palabra
        for (int j = 0; j < palabras.length; j++) {
            //ponemos las variables donde va a empezar a escribir la sopa de letras
            iniciox = (int) (Math.random() * p);
            inicioy = (int) (Math.random() * p);

            //variable para ver si lo ponemos en vertical u horizontal
            VERToHOR = (float) (Math.random() * 1);
            DiagonalArribaOAbajo = (float) (Math.random() * 2);
            //System.out.println("Vertical u Horizontal" + VERToHOR + "DIAGONAL" + DiagonalArribaOAbajo);

            //calculamos el tamaño de la palabra para ver si cabe en la sopa
            finy = inicioy + palabras[j].length();
            finx = iniciox + palabras[j].length();
            letras = palabras[j].toCharArray();

            //ponemos los límites para que quepa en la sopa de letras de forma horizontal
            if (finy < sopa.length && VERToHOR < 0.33f) {
                for (int i = 0; i < letras.length; i++) {
                    sopa[iniciox][inicioy] = letras[i];
                    inicioy++;
                }

                //ponemos los límites para que quepa en la sopa de letras de forma vertical
            } else if (finx < sopa.length && VERToHOR > 0.33f && VERToHOR < 0.66f) {
                for (int i = 0; i < letras.length; i++) {
                    sopa[iniciox][inicioy] = letras[i];
                    iniciox++;
                }
                //ponemos los límites para que quepa en la sopa de letras de forma diagonal
                //No esta terminada, tiene fallos
            } else if (finy < sopa.length && finx < sopa.length && VERToHOR > 0.66f && VERToHOR < 1) {
                for (int i = 0; i < letras.length; i++) {
                    if (DiagonalArribaOAbajo < 0.5f) {
                        sopa[iniciox][inicioy] = letras[i];
                        iniciox++;
                        inicioy++;
                    } else if (DiagonalArribaOAbajo > 0.5f && DiagonalArribaOAbajo < 1) {
                        sopa[iniciox][inicioy] = letras[i];
                        iniciox++;
                        inicioy--;
                    } else if (DiagonalArribaOAbajo > 1 && DiagonalArribaOAbajo < 1.5f) {
                        sopa[iniciox][inicioy] = letras[i];
                        iniciox--;
                        inicioy--;

                    } else if (DiagonalArribaOAbajo > 1.5f && DiagonalArribaOAbajo < 2) {
                        sopa[iniciox][inicioy] = letras[i];
                        iniciox--;
                        inicioy--;


                    }
                }
            } else {
                j--;
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
