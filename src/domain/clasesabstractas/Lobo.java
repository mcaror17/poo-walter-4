package domain.clasesabstractas;

/**
 * Esta clase concreta denominada Lobo es una subclase de Cánido.
 * @version 1.2/2020
 */
public class Lobo extends Cánido {
    /**
     * Método que devuelve un String con el sonido de un lobo
     * @return Un valor String con el sonido de un lobo: “Aullido”
     */
    public String getSonido() {
        return "Aullido";
    }
    /**
     * Método que devuelve un String con los alimentos de un lobo
     * @return Un valor String con el tipo de alimentación de un lobo:
     * “Carnívoro”
     */
    public String getAlimentos() {
        return "Carnívoro";
    }
    /**
     * Método que devuelve un String con el hábitat de un lobo
     * @return Un valor String con el hábitat de un lobo: “Bosque”
     */
    public String getHábitat() {
        return "Bosque";
    }
    /**
     * Método que devuelve un String con el nombre científico de un lobo
     * @return Un valor String con el nombre científico de un lobo:
     * “Canis lupus”
     */
    public String getNombreCientífico() {
        return "Canis lupus";
    }
}