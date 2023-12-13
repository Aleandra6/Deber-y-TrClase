/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.clase;

/**
 *
 * @author Aleja
 */
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    private int CI;

    
    public Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    
    public Persona(Persona otraPersona) {
        this.nombre = otraPersona.nombre;
        this.edad = otraPersona.edad;
    }

    
    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }
   
}
