
/*
 * Reto #6
 * INVIRTIENDO CADENAS
 * Fecha publicación enunciado: 07/02/22
 * Fecha publicación resolución: 14/02/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del 
 * lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

import javax.swing.*;

public class retoProgramacion6 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Escribe la palabra a dar revés!!");
        System.out.println(reverso(texto));

    }

    public static String reverso(String text) {
        String cadenaInvertida = "";
        for (int x = text.length() - 1; x >= 0; x--)
            cadenaInvertida = cadenaInvertida + text.charAt(x);
        return cadenaInvertida;
    }
}
