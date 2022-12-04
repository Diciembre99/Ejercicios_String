package es;

import java.util.Scanner;

/**
 * Esta app que invierte las cadenas
 * @Autor Kevin Castillo
 */
public class InvierteCadenaApp {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String texto;
        System.out.print("Introduce una cadena de caracteres:   ");
        texto = leer.nextLine();
        //Utilizo \\s porque al utilizar replaceAll podemos hacer que elimine todos los espacios en blancos que pueda contener el string
        texto = texto.replaceAll("\\s", "");
        //El atributo append sirve para concaner en el StringBuilder y el .reverse invierte el contenido del objeto
        str.append(texto).reverse();
        System.out.println("La cadena introducida sin espacios es: " + str);
        // toLowerCase sirve para que el texto sea representado en minusculas
        texto = texto.toLowerCase();
        //replace se usapara sutituir los valores que tenia antes con uno nuevo, en este caso uso en length para saber cual es el tamano del string
        //el primero inicia en cero, luego le digo que lo sustituya por una cadena vacia para que no se concatenen mas datos
        str.replace(0, str.length(), "");
        //Volvemos a invertir el texto 
        str.append(texto).reverse();
        System.out.println("La cadena introducida invertida en minúsculas es: " + str);
        //En este caso hacemos lo mismo pero convirtiendo el texto en mayusculas antes con el UpperCase
        texto = texto.toUpperCase();
        str.replace(0, str.length(), "");
        str.append(texto).reverse();
        System.out.println("La cadena introducida invertida en MAYÚSCULAS es: " + str);
    }
}
