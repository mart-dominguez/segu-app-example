/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.ams.app.seguridad.vista;

import com.mavha.ams.app.seguridad.logica.AgendaLogica;
import com.mavha.ams.app.seguridad.modelo.Agenda;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author marti
 */
@Named
@RequestScoped
public class AgendaController {
    
    @Inject
    private AgendaLogica logica;
    
    private String nombre;
   
    public String crearAgenda(){
        logica.crearAgenda(nombre);
        nombre = null;
        return null;
    }
    
    public String borrarAgenda(Integer id){
        logica.borrarAgenda(id);
        return null;
    }
    
    public List<Agenda> getLista(){
        return logica.listaDeAgendas();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
