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
            
    public void moverHaciaAdelante(){
        y += 1;
    }
    
    public void moverHaciaLaIzquierda(){
        x -= 1;
    }
    
    public void moverHaciaLaDerecha(){
        x += 1;
    }
    
    @Override
    public String toString() {
        return "Drone{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
