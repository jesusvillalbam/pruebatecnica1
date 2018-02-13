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
public class Almuerzo {
    
    private String tipoAlmuerzo;

    public String getTipoAlmuerzo() {
        return tipoAlmuerzo;
    }

    public void setTipoAlmuerzo(String tipoAlmuerzo) {
        this.tipoAlmuerzo = tipoAlmuerzo;
    }

    @Override
    public String toString() {
        return "Almuerzo{" + "tipoAlmuerzo=" + tipoAlmuerzo + '}';
    }
    
    
}
