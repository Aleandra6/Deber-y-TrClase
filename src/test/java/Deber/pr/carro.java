/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber.pr;

/**
 *
 * @author Aleja
 */
public class carro extends Vehiculos {
    
    public carro (String placa,String color, Integer Nocupantes){
        super(placa, color, Nocupantes);
        
    }
    @Override
    public void manejar(){
        System.out.println("Acomodate en el carro");
        encender();
        apagar();
        frenar();
    }
    
   
}
