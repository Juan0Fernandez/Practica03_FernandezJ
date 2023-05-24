/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.Practica03.idao;

import ec.edu.ups.practica03.Modelo.Persona;
import java.util.List;

/**
 *
 * @author Juan Fernandez
 */
public interface IPersonaDAO {
     public void create(Persona p);
    public Persona read(int id);
    public void update(Persona p);
    public void delete(Persona p);
    public Persona buscarCantantePorDisco(String n);
    public Persona buscarCompositorPorCancion(String n);
    public List<Persona> findAll();
}
