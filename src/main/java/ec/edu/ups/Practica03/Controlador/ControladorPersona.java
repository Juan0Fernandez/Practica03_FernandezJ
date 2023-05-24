/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Practica03.Controlador;

import ec.edu.ups.Practica03.Vista.VistaPersona;
import ec.edu.ups.Practica03.dao.PersonaDAO;
import ec.edu.ups.practica03.Modelo.Cantante;
import ec.edu.ups.practica03.Modelo.Compositor;
import ec.edu.ups.practica03.Modelo.Persona;

/**
 *
 * @author Juan Fernandez
 */
public class ControladorPersona {
     private VistaPersona vistaPersona;
    
    private Persona p;
    
    private PersonaDAO personaDAO;

    public ControladorPersona() {
        this.vistaPersona = new VistaPersona();
        this.personaDAO = new PersonaDAO();
    }
    
    
    
    /*public void agregarParaPruebas(){
        personaDAO.create(new Cantante("Bauti", "Bachata", 2, 
                5, 0, 0, "Juan Esteban", "Zaruma", 
                25, "Ecuatoriano", 600));
        
        Cantante c1 = (Cantante) personaDAO.findAll().get(0);
        c1.agregarDisco(0, "En tus sueños", 1999);
        
        c1.agregarDisco(1, "Musica", 2001);
        
        c1.agregarDisco(2, "Atrapado", 2006);
        
        c1.agregarDisco(3, "En tus sueños", 2015);
        
        personaDAO.create(new Cantante("Juanch0", "Salsa", 31, 
                20, 6, 1, "Juan Pedro", "Perez", 
                32, "Ecuatoriano", 7000));
        
        c1 = (Cantante) personaDAO.findAll().get(1);
        c1.agregarDisco(8, "Amar", 1999);
        
        personaDAO.create(new Cantante("Davss", "Reggae", 5, 
                5, 8, 2, "David", "Sas", 
                57, "Ecuatoriano", 2000));
        
        c1 = (Cantante) personaDAO.findAll().get(2);
        c1.agregarDisco(10, "Triste", 2020);
        
        personaDAO.create(new Cantante("Asdf", "Rock", 7, 
                13, 4, 3, "Ar", "Piedra", 
                45, "Ecuatoriano", 200));
        
        c1 = (Cantante) personaDAO.findAll().get(3);
        c1.agregarDisco(11, "Pais", 1985);
        

        c1.agregarDisco(20, "Vida", 2005);
        
        
        personaDAO.create(new Compositor(50, 4, "Fernando", 
                "Ros", 21, "Argentina", 2500));
        
        Compositor c2 = (Compositor) personaDAO.findAll().get(4);
        c2.agregarCancion(30, "Grave", "....", 4);
        
        c2.agregarCancion(0, "Logica", "....", 4);

        c2.agregarCancion(1, "Sustancia", "....", 4);

        c2.agregarCancion(2, "Perturbador", "....", 4);
        
        c2.agregarCancion(3, "Optimista", "....", 4);
        
        c2.agregarCancion(4, "Comun", "....", 4);
        
        c2.agregarCancion(5, "Accidente", "....", 4);
        
        c2.agregarCancion(6, "Evitar", "....", 4);
        
        
        personaDAO.create(new Compositor(50, 5, "Julio", 
                "Tro", 45, "Brasil", 3562));
        
        c2 = (Compositor) personaDAO.findAll().get(5);
        
        c2.agregarCancion(0, "Talento", "....", 4);

        c2.agregarCancion(1, "Oculto", "....", 4);

        c2.agregarCancion(2, "Sesgo", "....", 4);
        
        
        
        personaDAO.create(new Compositor(50, 6, "Vicente", 
                "Mur", 33, "Suecia", 9601));

        
    }*/
    
    public void registrar(boolean cantante) {
        p = vistaPersona.ingresarPersona(cantante);
        personaDAO.create(p);
    }
    
    public void agregarCliente(){
        System.out.println("Primero seleccione un compositor: ");
        Persona comp = personaDAO.read(vistaPersona.buscarPersona());
        if(!(comp instanceof Compositor)){
            System.out.println("Debe seleccionar un compositor para agregar un cliente.");
            return;
        }
        
        System.out.println("Ahora busque un cantante para ser su cliente:");
        p = personaDAO.read(vistaPersona.buscarPersona());
        if(!(p instanceof Cantante)){
            System.out.println("Debe seleccionar un cantante para ser un cliente.");
            return;
        }
        
        Compositor comp2 = (Compositor) comp;
        comp2.agregarCliente((Cantante) p);
    }
    
    public void imprimirPersona() {
        int id = vistaPersona.buscarPersona();
        p = personaDAO.read(id);
        vistaPersona.verPersona(p);
    }
    
    public void buscarPorNombreDeDisco(){
        String n = vistaPersona.buscarCantantePorDisco();
        p = personaDAO.buscarCantantePorDisco(n);
        vistaPersona.verPersona(p);
    }
    
    public void buscarPorNombreCancion(){
        String n = vistaPersona.buscarCompositorPorCancion();
        p = personaDAO.buscarCompositorPorCancion(n);
        vistaPersona.verPersona(p);
    }
}
