/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.ams.app.seguridad.vista;

import com.mavha.ams.app.seguridad.logica.AgendaLogica;
import com.mavha.ams.app.seguridad.logica.TareaLogica;
import com.mavha.ams.app.seguridad.modelo.Agenda;
import com.mavha.ams.app.seguridad.modelo.Tarea;
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
public class TareaController {

    public Integer getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(Integer idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Agenda getAgendaActual() {
        return agendaActual;
    }

    public void setAgendaActual(Agenda agendaActual) {
        this.agendaActual = agendaActual;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public String getDetalleTarea() {
        return detalleTarea;
    }

    public void setDetalleTarea(String detalleTarea) {
        this.detalleTarea = detalleTarea;
    }
    
    @Inject
    private AgendaLogica logicaAgenda;
    
    
    @Inject
    private TareaLogica logicatTarea;

    private Integer idAgenda;
    private Agenda agendaActual;
    private List<Tarea> listaTareas;
    
    
    private String detalleTarea;
   
    public void cargarAgenda(){
        System.out.println(" ============================= ===== "+idAgenda);
        agendaActual = logicaAgenda.buscar(idAgenda);
        listaTareas =logicatTarea.listaDeTareas(idAgenda);
    }

    public String crearTarea(){
        this.logicatTarea.crearTarea(detalleTarea, idAgenda);
        return null;
    }

    

}
