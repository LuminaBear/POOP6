/*
 * Clase Persona: Representa a una persona con atributos de nombre, dirección y edad, así como métodos relacionados.
 */
package fi.poo;

/**
 * La clase Persona representa a una persona con atributos como nombre, dirección y edad, además de métodos relacionados.
 */
public class Persona {
    private String nombre, direccion;
    private int edad;

    // Constructor vacío de una persona
    public Persona() {
    }

    /**
     * Constructor con argumentos.
     *
     * @param nombre     El nombre de la persona.
     * @param direccion  La dirección de la persona.
     * @param edad       La edad de la persona.
     */
    public Persona(String nombre, String direccion, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }
    
    // Getters y Setters para los atributos de la persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos relacionados con las acciones de una persona
    public void hablar(String var) {
        System.out.println(var);
    }
    
    public void caminar(String var) {
        System.out.println(var);
    }
    
    public void comer(String var) {
        System.out.println(var);
    }

    /**
     * Devuelve una representación de cadena de la persona en un formato específico.
     *
     * @return Representación de cadena de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + '}';
    }
}
