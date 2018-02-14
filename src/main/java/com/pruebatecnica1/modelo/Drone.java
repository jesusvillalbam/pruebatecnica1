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
    
    private String nombre;
    private int x = 0;
    private int y = 0;
    private String puntoCardinal="N";

    public Drone(String nombre) {
        this.nombre = nombre;
    }
    
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
        return  "("+getX()+","+getY()+","+getPuntoCardinal()+")";        
    }

    public String getNombre() {
        return nombre;
    }
            
    public void moverHaciaAdelante(String puntoCardinalActual){
        
        switch(puntoCardinalActual){
            case "N" : this.y += 1;
            break;
            case "E" : this.x -= 1; 
            break;
            case "S" : this.y -= 1; 
            break;
            case "O" : if(x<0){this.x += (-1); }else{this.x += 1;}
            break;
        }
    }
    
    public void moverHaciaLaIzquierda(String puntoCardinalActual){
        
        switch(puntoCardinalActual){
            case "N" : this.puntoCardinal = "E";
            break;
            case "E" : this.puntoCardinal = "S"; 
            break;
            case "S" : this.puntoCardinal = "O"; 
            break;
            case "O" : this.puntoCardinal = "N"; 
            break;
        }
    }
    
    public void moverHaciaLaDerecha(String puntoCardinalActual){
        
        switch(puntoCardinalActual){
            case "N" : this.puntoCardinal = "O";
            break;
            case "O" : this.puntoCardinal = "S"; 
            break;
            case "S" : this.puntoCardinal = "E"; 
            break;
            case "E" : this.puntoCardinal = "N"; 
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
        return "Drone{" + "nombre=" + nombre + ", "
                + "x=" + x + ", "
                + "y=" + y + ", "
                + "puntoCardinal=" + puntoCardinal + '}';
    }
    

    
    
}
