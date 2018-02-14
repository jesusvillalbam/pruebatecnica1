/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebatecnica1.main;

import com.pruebatecnica1.modelo.Drone;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author jdvillalba
 */
public class Main {
    
    public static void main (String []args) throws FileNotFoundException, IOException{
        Drone [] drones = new Drone[1];
        for(int i=0;i<1;i++){
            String nombre = "Drone #"+i;
            drones[i] = new Drone(nombre);
        }

        Path path = Paths.get("c:\\domicilios\\in.txt");
        long numeroLineas = Files.lines(path).count();
        System.out.println(numeroLineas);
        BufferedReader reader = new BufferedReader(new FileReader("c:\\domicilios\\in.txt"));
        File log = new File("c:\\domicilios\\out.txt");
        BufferedWriter escribir = null;
        escribir = new BufferedWriter(new FileWriter(log));
        String linea;
        escribir.write("== Reporte de entregas ==");
        escribir.newLine();
        for(int n=0;n<=0;n++){
                Drone drone = drones[n]; 		    
                    if(numeroLineas<=3){
                        while((linea = reader.readLine())!=null){
                            for(int i = 0; i<linea.length(); i++){
                                String result =linea.substring(i, (i+1));
                                if(result.equalsIgnoreCase("A")){
                                    drone.moverHaciaAdelante(drone.getPuntoCardinal());
                                    System.out.println("El "+drone.getNombre()
                                            +" se ha desplazando a la siguiente posición: "+drone.obtenerPosicion());
                                }
                                if(result.equalsIgnoreCase("I")){
                                    drone.moverHaciaLaIzquierda(drone.getPuntoCardinal());
                                    System.out.println("El "+drone.getNombre()
                                            +" se esta desplazando por la siguiente posición: "+drone.obtenerPosicion());
                                }
                                if(result.equalsIgnoreCase("D")){
                                    drone.moverHaciaLaDerecha(drone.getPuntoCardinal());
                                    System.out.println("El "+drone.getNombre()
                                            +" se esta desplazando por la siguiente posición: "+drone.obtenerPosicion());
                                }
                            }
                            escribir.write("Un almuerzo se ha entregado en la posición: "+drone.obtenerPosicion());
                            escribir.newLine();
                        }
                    }else{
                        System.out.println("Atención el "+drone.getNombre()+ " solo puede llevar tres almuerzos a la vez");
                    }
            escribir.close();
        }
    }
    
}
