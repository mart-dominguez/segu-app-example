/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.ams.app.seguridad.logica;

import com.mavha.ams.app.seguridad.modelo.Agenda;
import com.mavha.ams.app.seguridad.modelo.Tarea;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author marti
 */
@Named
@Stateless
public class TareaaLogicaDefault implements TareaLogica {

    @PersistenceContext(unitName = "segu_pu")
    private EntityManager em;

    @Override
    public void borrarTarea(Integer id) {
        em.refresh(em.find(Tarea.class, id));
    }

    @Override
    public void crearTarea(String desc, Integer idAgenda) {
        Agenda unaAgenda = em.find(Agenda.class, idAgenda);
        Tarea t = new Tarea();
        t.setDescripcion(desc);
        t.setAgenda(unaAgenda);
        em.persist(t);
    }

    @Override
    public List<Tarea> listaDeTareas(Integer idAgenda) {
        return em.createQuery("SELECT t FROM Tarea t WHERE t.agenda.id = :P_ID_AGENDA ")
                .setParameter("P_ID_AGENDA", idAgenda)
                .getResultList();
    }

}
