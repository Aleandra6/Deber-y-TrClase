/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber.pr;

/**
 *
 * @author Aleja
 */
public class Principal {
    
    public static void main(String[]args){
        moto Moto = new moto("CDC","Verde",2);
        carro Carro=new carro("JHG", "Rojo",5);
        
        
        Moto.manejar();
        Carro.manejar();
        
        
    }
}
