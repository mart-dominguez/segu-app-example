/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.ams.app.seguridad.logica;

import com.mavha.ams.app.seguridad.modelo.Agenda;
import java.util.List;

/**
 *
 * @author marti
 */
public interface AgendaLogica {

    void borrarAgenda(Integer id);

    void crearAgenda(String nombre);

    List<Agenda> listaDeAgendas();
    
}
