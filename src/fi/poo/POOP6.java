/*
 * Clase POOP6: Contiene el método principal (main) que imprime un mensaje y crea una instancia de la clase Persona.
 */
package fi.poo;

/**
 * La clase POOP6 contiene el método principal (main) que imprime un mensaje y crea una instancia de la clase Persona.
 */
public class POOP6 {

    /**
     * Método principal (main) que se ejecuta al iniciar la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");  // Imprime un mensaje en la consola

        // Crear una instancia de la clase Persona
        Persona persona = new Persona("Juan", "Coyocacan", 17);
        
        // Invocar el método "hablar" de la instancia "persona" para mostrar un mensaje
        persona.hablar("Hola, soy Juan");
    }
}
