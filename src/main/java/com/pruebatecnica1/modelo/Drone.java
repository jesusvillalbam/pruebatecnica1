/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebatecnica1.modelo;

/**
 *
 * @author jdvillalba
 */
public class Drone {
    
    private int x = 0;
    private int y = 0;
    private String puntoCardinal="N";
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getPuntoCardinal() {
        return puntoCardinal;
    }
    
    public String obtenerPosicion(){
        return  "La posición del Dron es ("+getX()+","+getY()+","+getPuntoCardinal()+")";        
    }
            
    public void moverHaciaAdelante(String puntoCardinalActual){
        
        switch(puntoCardinalActual){
            case "N" : this.y += 1;
            break;
            case "OC" : this.x -= 1; 
            break;
            case "S" : this.y -= 1; 
            break;
            case "OR" : if(x<0){this.x += (-1); }else{this.x += 1;}
            break;
        }
    }
    
    public void moverHaciaLaIzquierda(String puntoCardinalActual){
        
        switch(puntoCardinalActual){
            case "N" : this.puntoCardinal = "OC";
            break;
            case "OC" : this.puntoCardinal = "S"; 
            break;
            case "S" : this.puntoCardinal = "OR"; 
            break;
            case "OR" : this.puntoCardinal = "N"; 
            break;
        }
    }
    
    public void moverHaciaLaDerecha(String puntoCardinalActual){
        
        switch(puntoCardinalActual){
            case "N" : this.puntoCardinal = "OR";
            break;
            case "OR" : this.puntoCardinal = "S"; 
            break;
            case "S" : this.puntoCardinal = "OC"; 
            break;
            case "OC" : this.puntoCardinal = "N"; 
            break;
        }
    }
    
    public void restablecerPosicion(){
        this.x = 0;
        this.y = 0;
        this.puntoCardinal = "N";
    }
    
    @Override
    public String toString() {
        return "Drone{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
