/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.persona.beans;

import co.edu.javeriana.as.persona.model.Profesion;
import java.util.List;
import javax.ejb.Local;


@Local
public interface ProfesionFacadeLocal {

    void create(Profesion profesion);

    void edit(Profesion profesion);

    void remove(Profesion profesion);

    Profesion find(Object id);

    List<Profesion> findAll();

    List<Profesion> findRange(int[] range);

    int count();
    
}
