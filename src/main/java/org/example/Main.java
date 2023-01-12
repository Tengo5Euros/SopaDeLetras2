import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String temporal = args[0];

        int n1 = Integer.parseInt(temporal);
        int palabramaslarga = 0;
        int temporal2 = Integer.parseInt(temporal), temporal3;
        String[] palabra = new String[temporal2*2];
        Scanner input = new Scanner(System.in);
        char[] letras = new char[temporal2];





        //pedimos las palabras que queremos poner en la sopa de letras
        for (int i = 0; i < temporal2; i++) {
            System.out.println("Dime una palabra," + " quedan " + n1 + " palabras por poner");
            palabra[i] = input.nextLine();
            palabramaslarga = palabra[0].length();
            if (palabramaslarga < palabra[i].length()) {
                palabramaslarga = palabra[i].length();
            }
            n1--;

        }
        letras = palabra[0].toCharArray();
        System.out.println(letras);

        int p = 3 * palabramaslarga;
        String[][] sopa = new String[p][p];

        int palabrarandom1 = 0;
        int palabrarandom2 = (int) (Math.random() * p);

        //sopa creada con Letra metida
        for (int i = 0; i < sopa.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < sopa[i].length; j++) {
                //creamos letrasaleatorias para rellenar la sopa de letras
                char letraaleatoria = (char) (Math.random() * 25 + 65);
                if (i == palabrarandom1 && j == palabrarandom2) {
                    System.out.print(letra[i]);
                    {

                    }
                } else {
                    System.out.print(letraaleatoria);
                }

            }

        }

    }
}
