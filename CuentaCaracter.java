package es;

import java.util.Scanner;

/**
 * Esta app cuenta los caracteres introducidos por teclado que hay en un texto
 *
 * @Autor Kevin Castillo
 */
public class CuentaCaracter {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String texto;
        char carac;
        System.out.print("Escribe una cadena de caracteres: ");
        texto = leer.nextLine();
        System.out.print("Escribe el caracter que quieres contar las repeticiones: ");
        carac = leer.next().charAt(0);
        str.append(leer.nextLine());
        System.out.printf("El caracter %c se repite %d veces \n", carac, CuentaCaracter.contarRepeticion(texto, carac));
    }
    /**
     * Cuenta la cantidad de caracteres en el texto
     * @param cadena
     * @param caracter
     * @return numero de veces que se repite (int)
     */
    public static int contarRepeticion(String cadena, char caracter) {
        int total = 0;
        char carac;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length() - 1; i++) {
            //Convertirmos la cadena a un caracter con inidice i
            carac = cadena.charAt(i);
            //Comparamos si el caracter ya existe aumentamos uno al contador
            if (caracter == carac) {
                total++;
            }
        }
        return total;
    }
}
