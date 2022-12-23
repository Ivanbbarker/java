
/**
 * 
 * ÁREA DE UN POLÍGONO
 * 
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 * 
 * @author Ivan Cañas
 */

import javax.swing.*;

public class poligonosApp {
    public static void main(String[] args) {
        String tipo = JOptionPane.showInputDialog("Escribe el tipo de poligono a calcular el Área");
        areasPoligonos(tipo);
    }

    /**
     * Metodo que resuelve el problema propuesto.
     * 
     * @param tipo tipo de poligono a calcular el Área.
     * @return Area del poligono introducido por Ventana Emergente.
     */
    public static void areasPoligonos(String tipo) {
        /**
         * 
         * @param base,  altura ; Base y Altura que serán recibidas por Ventana
         *               Emergente(JOptionPane).
         * @param baseN, alturaN ; Base y Altura transformados en tipo Int para ser
         *               trabajados.
         */

        String base, altura;
        int baseN, alturaN;

        System.out.println(obtenerTipo(tipo));
        switch (obtenerTipo(tipo)) {
            case "cuadrado":
                base = JOptionPane.showInputDialog("Escribe el lado del Cuadrado");
                baseN = Integer.parseInt(base);
                JOptionPane.showMessageDialog(null, "El Área del cuadrado es " + baseN * baseN);
                break;
            case "triangulo":
                base = JOptionPane.showInputDialog("Escribe la base del Triángulo");
                altura = JOptionPane.showInputDialog("Escribe la altura del Triángulo");
                baseN = Integer.parseInt(base);
                alturaN = Integer.parseInt(altura);
                JOptionPane.showMessageDialog(null, "El Área del Triangulo es " + (baseN * alturaN) / 2);
                break;
            case "rectangulo":
                base = JOptionPane.showInputDialog("Escribe el lado del Rectangulo");
                altura = JOptionPane.showInputDialog("Escribe la altura del Rectangulo");
                baseN = Integer.parseInt(base);
                alturaN = Integer.parseInt(altura);
                JOptionPane.showMessageDialog(null, "El Área del Rectangulo es " + baseN * alturaN);
                break;
        }
    }

    /**
     * 
     * Método que realiza las operaciones oportunas para el tratamiento en el metodo
     * areasPoligonos().
     * Estas son, la transformacion en letras minusculas y la llamada al metodo
     * obtenerTipoSinTildes().
     * 
     * @param tipo Palabra introducida.
     * @return type Palabra con el tratamiento adecuado.
     */
    public static String obtenerTipo(String tipo) {
        String type = new String(tipo);
        type = type.toLowerCase();
        type = obtenerTipoSinTildes(type);
        return type;
    }

    /**
     * 
     * Método que transforma nuestra palabra introducida en el metodo
     * areasPoligonos() (TRANSFORMADA EN MINÚSCULAS)
     * en la misma palabra pero en este caso sin acentos.
     * 
     * @param tipo Palabra introducida en el metodo areasPoligonos() (Ya en
     *             minusculas).
     * @return type Palabra introducida en el metodo areasPoligonos() sin acentos.
     */
    public static String obtenerTipoSinTildes(String tipo) {
        String type = new String(tipo);
        type = type.replaceAll("á", "a");
        type = type.replaceAll("é", "e");
        type = type.replaceAll("í", "i");
        type = type.replaceAll("ó", "o");
        type = type.replaceAll("ú", "u");
        return type;
    }
}
