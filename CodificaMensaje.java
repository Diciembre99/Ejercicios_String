package es;

import java.util.Scanner;

/**
 * Esta app codifica un mensaje introducido por teclado
 *
 * @Autor Kevin Castillo
 */
public class CodificaMensaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        StringBuilder clave = new StringBuilder();
        String texto;
        char codigo;
        boolean valido;
        //Un bucle para no avanzar hasta que el usuario introduzca bien los valores requeridos
        do {
            System.out.print("Introduce el mensaje: ");
            texto = leer.nextLine();
            texto = texto.toUpperCase();
            valido = CodificaMensaje.Validar(texto);
        } while (texto.isEmpty() || valido);

        str.append(texto);
        for (int i = 0; i < texto.length(); i++) {
            codigo = str.charAt(i);
            //Con una codicion reviso si el caracter es una letra o numero, luego aumento uno para que se represente con una letra mayor
            //Recuerda que los caracteres pueden representarse como valores enteros y son representados respectivamente en la tabla ASCII
            if (codigo > 47 && codigo < 57) {
                codigo++;
            } else {
                if (codigo > 64 && codigo < 90) {
                    codigo++;
                }
                clave.append(codigo);
            }
        }
        texto = clave.toString();
        //Con el fin de reducir instrucciones en el bucle utilizo un replaceAll para sustituir los valores que quedan fuera de la instruccion anterior
        //al ser casos especificos puedo indicar cual es el caracter a sustituir y agregarlos a la cadena
        texto = texto.replaceAll("\\s", "&");
        texto = texto.replaceAll("Z", "A");
        texto = texto.replaceAll("9", "0");
        System.out.println("La clave es : " + texto);
    }

    /**
     * Esta clase valida si el texto introducido es valido
     *
     * @param texto
     * @return valido o no
     */
    public static boolean Validar(String texto) {
        char letra;
        boolean valido = false;
        //Con el for reviso cada caracter para ver si cumple con la condicion 
        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);
            if (letra > 90 || letra > 57 && letra < 65 || letra > 32 && letra < 48) {
                valido = true;
            }
        }
        return valido;
    }
}
