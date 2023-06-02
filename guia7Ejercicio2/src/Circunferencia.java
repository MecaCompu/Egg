
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Circunferencia{
/**
 *
 * @author Soporte
 */
    private double Radio=20.00;
    private double Area;
    private double Perimetro;
    
    public Circunferencia(){
    
        
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
