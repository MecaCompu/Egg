/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class NewClass {
    private double Radio=20.00;
    private double Area;
    private double Perimetro;
    
    public NewClass(){
    
        
    }
    public void setRadio(double Radio){
        this.Radio=Radio;
        
    }
    public double getRadio(){
        return this.Radio;
        
    }
    public double CrearCircunferencia(){
        Scanner Leer = new Scanner(System.in);
        Radio = Leer.nextDouble();
        return this.Radio;
    }
    public double Area(){
        return Area = Math.pow((3.14*Radio),2);
        
    }
    public double Perimetro(){
        return Perimetro = (2*3.14*Radio);
        
    }
}