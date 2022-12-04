package es;

import java.util.Scanner;

/*
 definición de Palíndromo: Palabra o frase que se lee igual de izquierda a derecha, que de
 derecha a izquierda; ejemplos: oso; ana; dabale arroz a la zorra el abad
 */
/**
 * Esta app indica si una cadena es palindroma
 *
 * @Autor Kevin Castillo
 */
public class Palindroma {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        boolean validar;
        //Validamos que el usuario introduzca algun valor
        do {
            System.out.print("Introduce la cadena:  ");
            texto = leer.nextLine();
        } while (texto.isEmpty());
        
        validar = Palindroma.esPalindra(texto);
        if (validar) {
            System.out.println("La cadena es palindra");

        } else {
            System.out.println("La cadena no es palindra");
        }
    }
/**
 * Esta clase verifica si el texto cumple con la condicion mediante un reverse
 * @param cadena
 * @return Es palindra o no
 */
    public static boolean esPalindra(String cadena) {
        boolean esPalindra = false;
        //Iniciamos eliminando los espacios que pueda tener para que no afecte el reverse
        cadena = cadena.trim();
        //Le asignamos el valor de la cadena al StringBuffer para poder hacer el reverse
        StringBuffer str = new StringBuffer(cadena);
        
        //con el atributo Equals verificamos que la cadena se lea igual que invirtiendolo
        if (cadena.contentEquals(str.reverse())) {
            esPalindra = true;
        }
        return esPalindra;
    }
}
