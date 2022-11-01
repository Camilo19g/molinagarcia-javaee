/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.persona.beans;

import co.edu.javeriana.as.persona.model.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class PersonaFacade extends AbstractFacade<Persona> implements PersonaFacadeLocal {

    @PersistenceContext(unitName = "personaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }

    @Override
    public List<Persona> findName(String name) {
        Query q= getEntityManager().createNamedQuery("Persona.findByNombre");
        q.setParameter("nombre", name);
        return q.getResultList();
    }

    @Override
    public List<Persona> findCC(Integer cc) {
      Query q= getEntityManager().createNamedQuery("Persona.findByCc");
        q.setParameter("cc", cc);
        return q.getResultList();
    }
}
