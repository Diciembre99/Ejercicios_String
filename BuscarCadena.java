package es;

import java.util.Scanner;

/**
 * Esta app busca la mitade de una cadena y devuelve la parte final al inicio
 *
 * @Autor Kevin Castillo
 */
public class BuscarCadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaramos las 3 cadenas a usar
        StringBuilder subcadena = new StringBuilder();
        StringBuilder subcadena1 = new StringBuilder();
        StringBuilder subcadena2 = new StringBuilder();
        System.out.print("Escribe la cadena  de caracteres: ");
        subcadena.append(leer.nextLine());
        //Necesitamos un if que determine si una de estas cadenas termina en par
        if (BuscarCadena.Espar(subcadena1.length())) {
            //Para saber la segunda mitad de una cadena debemos saber cual es su total de caracteres y dividirlo entre 2
            subcadena1.append(subcadena.substring(subcadena.length()/2));
        }else{
            subcadena1.append(subcadena.substring((subcadena.length()/2)+1));
        }
        //Para escoger la primera parte de la cadena, indicamos que el indice inicial sera cero y el final la mitad del total
         subcadena2.append(subcadena.substring(0,subcadena.length()/2));
         System.out.println("La primera subcadena es "+ subcadena2);
         System.out.println("La segunda subcadena es "+subcadena1);
         System.out.println("La salida solicitada es "+subcadena1.append(subcadena2));
    }
    /**
     * Funcion que determina si un numero es par
     * @param num
     * @return Si es par o no
     */
    public static boolean Espar(int num) {
        boolean par = false;
        if (num % 2 == 0) {
            par = true;
        }
        return par;
    }
}
