/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber.pr;

/**
 *
 * @author Aleja
 */
public class moto extends Vehiculos {
    public moto (String placa,String color, Integer Nocupantes){
        super(placa, color, Nocupantes);
        
    }
    
    @Override
    public void manejar (){
        System.out.println("Acomodate en la moto");
        encender();
        frenar();
        apagar();
        
    }
    
}
