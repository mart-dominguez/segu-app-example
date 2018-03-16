/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.ams.app.seguridad.logica;

import com.mavha.ams.app.seguridad.modelo.Tarea;
import java.util.List;

/**
 *
 * @author marti
 */
public interface TareaLogica {

    void borrarTarea(Integer id);

    void crearTarea(String desc,Integer idAgenda);

    List<Tarea> listaDeTareas(Integer idAgenda);
    
}
