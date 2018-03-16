/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.ams.app.seguridad.logica;

import com.mavha.ams.app.seguridad.modelo.Agenda;
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
public class AgendaLogicaDefault implements AgendaLogica {
    
    @PersistenceContext(unitName = "segu_pu")
    private EntityManager em;
    
    @Override
    public void crearAgenda(String nombre){
        Agenda nuevaAgenda = new Agenda();
        nuevaAgenda.setNombre(nombre);
        em.persist(nuevaAgenda);
    }

    @Override
    public void borrarAgenda(Integer id){
        em.remove(em.find(Agenda.class, id));
    }
    
    @Override
    public List<Agenda> listaDeAgendas(){
        return em.createQuery("SELECT a FROM Agenda a").getResultList();
    }

    @Override
    public Agenda buscar(Integer id) {
        return em.find(Agenda.class, id);
    }
}
