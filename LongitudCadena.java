package es;

import java.util.Scanner;

/**
 *
 * @author Kevin Castillo
 */
public class LongitudCadena {
/**
 * Aplicacion de prueba de Strings 
 * @param args
 */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        //Se necesita almacenar la inicial, la ultima letra y el numero de caracteres
        char inicial, fin;
        int n_caracter;
        System.out.println("Escribe una cadena de caracteres");
        //La forma de leer Strings es com nextLine
        texto = leer.nextLine();
        // Con length podemos saber la cantidad de caracteres que hay en la cadena
        n_caracter = texto.length();
        //Usamos charAt para saber cual es la ultima letra, debemos poner el -1 porque los Strting inician en 0 y colocamos el valor de length para saber su ancho
        fin = texto.charAt(n_caracter - 1);
        System.out.printf("La cadena tiene %d contando los espacios \n", n_caracter);
        //trim Sirve para quitar los espacios que puedan existir entre el inicio y fin de una app
        texto = texto.trim();
        //Usamos replaceAll Para eliminar los espacios intermedios que puedan existir dentro de la cadena
        texto = texto.replaceAll(" ", "");
        //charAt para contar los caracteres y colocamos 0 por que es donde inicia la cadena
        inicial = texto.charAt(0);
        //Calculamos de nuevo el ancho de la cadena con length
        n_caracter = texto.length();
        System.out.printf("La cadena tiene %d caracteres sin contar los espacios\n", n_caracter);
        System.out.printf("La cadena introducida comienza por la letra %c y finaliza por la %c\n", inicial, fin);
    }
}
