/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto;

/**
 *
 * @author sergi
 */
public class Proyecto {
    public static void main(String args[]) {
 
    }
    public double resultado; 
   
   
    
    public double aceleracion(double velocidadInicial, double velocidadFinal, double tiempo) {
    resultado = velocidadFinal - velocidadInicial / tiempo;
        return 0;
    }
    public double masa(double densidad, double volumen){
    resultado = densidad * volumen;
        return 0;
    }
    public double tiempo(double velocidad, double distancia){
    resultado = velocidad / distancia;
        return 0;
    }
    public double peso(double masa){
    resultado = masa * 9.8;
        return 0;
    }
    public double fuerza(double masa, double aceleracion){
    resultado = masa * aceleracion;
        return 0;
           
    }

    
    }
    

