/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebatecnica1.main;

import com.pruebatecnica1.modelo.Almuerzo;
import com.pruebatecnica1.modelo.Drone;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdvillalba
 */
public class Main {
    
    public static void main (String []args) throws FileNotFoundException, IOException{
        Drone drone = new Drone();
        Almuerzo almuerzo1 = new Almuerzo();
        almuerzo1.setTipoAlmuerzo("Bandeja Paisa");
        Almuerzo almuerzo2 = new Almuerzo();
        almuerzo2.setTipoAlmuerzo("Mote de queso");
        Almuerzo almuerzo3 = new Almuerzo();
        almuerzo3.setTipoAlmuerzo("Casuela de Mariscos");
        
        List<Almuerzo> almuerzos = new ArrayList();
        almuerzos.add(almuerzo1);
        almuerzos.add(almuerzo2);
        almuerzos.add(almuerzo3);
        

        BufferedReader reader = new BufferedReader(new FileReader("d:\\texto.txt"));
        String linea;
        while((linea = reader.readLine())!=null){
        System.out.println(drone.obtenerPosicion());
            for(int i = 0; i<linea.length(); i++){
                String result =linea.substring(i, (i+1));
                if(result.equalsIgnoreCase("A")){
                    drone.moverHaciaAdelante(drone.getPuntoCardinal());
                    System.out.println("A "+drone.obtenerPosicion());
                }
                if(result.equalsIgnoreCase("I")){
                    drone.moverHaciaLaIzquierda(drone.getPuntoCardinal());
                    System.out.println("I "+drone.obtenerPosicion());
                }
                if(result.equalsIgnoreCase("D")){
                    drone.moverHaciaLaDerecha(drone.getPuntoCardinal());
                    System.out.println("D "+drone.obtenerPosicion());
                }
//                if((i+1)>=linea.length()){
//                    drone.restablecerPosicion();
//                }
            }
        }
            
        System.out.println(linea);
        
        if(almuerzos.size()>3){
            System.out.println("El Dron solo puede llevar TRES almuerzo "
                    +"el Dron actualmente lleva la cantidad de "+almuerzos.size()+ " almuerzos");
        }
    }
    
}
