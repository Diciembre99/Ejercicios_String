package es;

import java.util.Scanner;

/**
 * Esta app hace
 *
 * @Autor Kevin Castillo
 */
public class InvierteCadenaApp {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String texto;
        int espacios;
        System.out.print("Introduce una cadena de caracteres:   ");
        texto = leer.nextLine();
        
        texto=texto.replaceAll("\\s", "");
        str.append(texto).reverse();
        System.out.println("La cadena introducida sin espacios es: "+str);

        texto = texto.toLowerCase();
        str.replace(0, str.length(), "");
        str.append(texto).reverse();
        System.out.println("La cadena introducida invertida en minúsculas es: "+str);
        
        texto=texto.toUpperCase();
        str.replace(0, str.length(), "");
        str.append(texto).reverse();
        System.out.println("La cadena introducida invertida en MAYÚSCULAS es: " +str);

    }
}
