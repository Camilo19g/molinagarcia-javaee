/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.persona.beans;

import co.edu.javeriana.as.persona.model.Persona;
import java.util.List;
import javax.ejb.Local;


@Local
public interface PersonaFacadeLocal {

    void create(Persona persona);

    void edit(Persona persona);

    void remove(Persona persona);

    Persona find(Object id);

    List<Persona> findAll();

    List<Persona> findRange(int[] range);
     
    List<Persona> findName(String name);
    List<Persona> findCC(Integer cc);

    int count();
    
}
