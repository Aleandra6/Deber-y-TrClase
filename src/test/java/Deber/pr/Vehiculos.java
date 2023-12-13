/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber.pr;

/**
 *
 * @author Aleja
 */
abstract public class Vehiculos{
    
    public String placa;
    public String color;
    public Integer Nocupantes;
    private String motor;
    
    public Vehiculos(String placa,String color, Integer Nocupantes){
        this.placa=placa;
        this.color=color;
        this.Nocupantes=Nocupantes;
       
    }
    
    

    public String getmotor() {
        return motor;
    }
    
    public void setmotor(String motor){
        this.motor=motor;
    }
    public void encender(){
        System.out.println("Encendido");
        
    }
    public void apagar(){
        System.out.println("Apagado");
        
    }public void frenar(){
        System.out.println("Frenado");
        
    }
    
    public abstract void manejar();


        
    
    
    
}
