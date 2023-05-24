/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Practica03.Vista;

import ec.edu.ups.practica03.Modelo.Cantante;
import ec.edu.ups.practica03.Modelo.Compositor;
import ec.edu.ups.practica03.Modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author Juan Fernandez
 */
public class VistaPersona {
     private Scanner sc;
    
    public VistaPersona(){
        sc = new Scanner(System.in);
    }
    
    public Persona ingresarPersona(boolean cantante){
        
        sc = new Scanner(System.in);
        
        System.out.println("Ingrese el codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la nacionalidad: ");
        String nacionalidad = sc.nextLine();

        System.out.println("Ingrese el salario: ");
        double salario = sc.nextDouble();
        sc.nextLine();
        
        if(cantante){
            System.out.println("Ingrese el nombre artistico del cantante: ");
            String nombreArtistico = sc.nextLine();

            System.out.println("Ingrese el genero musical del cantante: ");
            String generoMusical = sc.nextLine();

            System.out.println("Ingrese el numero de sencillos del cantante: ");
            int numeroDeSencillos = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el numero de conciertos del cantante: ");
            int numeroDeConciertos = sc.nextInt();
            sc.nextLine();

            System.out.println("Ingrese el numero de giras del cantante: ");
            int numeroDeGiras = sc.nextInt();
            sc.nextLine();
            
            Cantante c = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
            boolean continuar;
 
            do{
                System.out.println("\nINGRESAR UN DISCO\n");
                System.out.println("Ingrese el codigo del disco: ");
                int codigoDisco = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el nombre del disco: ");
                String nombreDisco = sc.nextLine();
                System.out.println("Ingrese el año de lanzamiento del disco: ");
                int anioDeLanzamiento = sc.nextInt();
                sc.nextLine();
                c.agregarDisco(codigoDisco, nombreDisco, anioDeLanzamiento);
                
                System.out.println("¿Desea ingresar otro disco? (si/no)");
                String r = sc.nextLine();

                if(r.equalsIgnoreCase("si")){
                    continuar=true;
                }else{
                    continuar=false;
                }
            }while(continuar);
            
            return c; 
        }else{
            System.out.println("Ingrese el numero de composiciones: ");
            int numComposiciones = sc.nextInt();

            Compositor c = new Compositor(numComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);
            boolean continuar;

            do{
                System.out.println("\nINGRESAR UNA CANCION\n");
                System.out.println("Ingrese el codigo de la cancion: ");
                int codigoCancion = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese el titulo de la cancion: ");
                String titulo = sc.nextLine();
                System.out.println("Ingrese la letra de la cancion: ");
                String letra = sc.nextLine();
                System.out.println("Ingrese la duracion de la cancion en minutos: ");
                double duracion = sc.nextDouble();
                sc.nextLine();
                c.agregarCancion(codigoCancion, titulo, letra, duracion);
                
                System.out.println("¿Desea ingresar otra cancion? (si/no)");
                String r = sc.nextLine();

                if(r.equalsIgnoreCase("si")){
                    continuar=true;
                }else{
                    continuar=false;
                }
            }while(continuar);
            
            return c;
        }
        
    }
    
    public int buscarPersona() {
        sc = new Scanner(System.in);
        System.out.println("Ingresa el id de la persona a buscar: ");
        int id = sc.nextInt();
        return id;
    }
    

    public void verPersona(Persona p) {
        System.out.println(p);
    }
    
    public String buscarCantantePorDisco(){
        sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del disco: ");
        String n = sc.nextLine();
        return n;
        
    }
    
    public String buscarCompositorPorCancion(){
        sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la cancion: ");
        String n = sc.nextLine();
        return n;
        
    }
}
