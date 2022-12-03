package es;

import java.util.Scanner;

/**
 * Aplicacion que calcula la cantidad de vocales de una cadena de caracteres
 *
 * @autor Kevin Castillo
 */
public class CuentaVocales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vocales = 0;
        char letra;
        String texto;
        //Defino el valor de las vocales en su tabla ASCII 
        final int a = 97, e = 101, i = 105, o = 111, u = 117;
        System.out.print("Escribe una cadena de caracteres: ");
        texto = leer.nextLine();
        for (int j = 0; j < texto.length(); j++) {
            //Convierto el texto a minusculas para que cuando compare con la tabla ASCII no tenga que contemplar si son mayusculas
            texto = texto.toLowerCase();
            /**
             * Dentro del charAt coloco el contador del for para que cambie el
             * valor de la variable segun recorra el String se inicializa en
             * cero, y se lo asigno a letra para que se pueda comprar con datos
             * tipo int
             */
            letra = texto.charAt(j);
            if (letra == a || letra == e || letra == i || letra == o || letra == u) {
                //Coloco un contador que cuente cada vez que se cumpla el if y asi sepamos la cantidad de vocales
                vocales++;
            }
        }
        System.out.printf("La cadena tiene %d vocales \n", vocales);

    }
}
