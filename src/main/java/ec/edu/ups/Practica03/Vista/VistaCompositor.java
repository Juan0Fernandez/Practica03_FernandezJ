/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Practica03.Vista;

import ec.edu.ups.practica03.Modelo.Compositor;
import ec.edu.ups.practica03.Modelo.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Juan Fernandez
 */
public class VistaCompositor {
 private List<Compositor> compositores;//lista de la clase persona

    public VistaCompositor() {
        compositores = new ArrayList<>();//Constructor que inicializa la lista de la clase
    }
    public Compositor ingresarCompositor() {
        Scanner scaner = new Scanner(System.in);//Instancia de la clase Scanner para leer la entrada de teclado

        System.out.println("Ingrese el codigo del compositor: ");//Imprime lo que pide ingresar 
        int codigo = scaner.nextInt();//Leemos y guardamos en una variable
        scaner.nextLine();// Limpiar el buffer de entrada

        System.out.println("Ingrese el nombre del compositor: ");//Imprime lo que pide ingresar 
        String nombre = scaner.nextLine();//Leemos y guardamos en una variable

        System.out.println("Ingrese el apellido del compositor: ");//Imprime lo que pide ingresar 
        String apellido = scaner.nextLine();//Leemos y guardamos en una variable

        System.out.println("Ingrese la edad del compositor: ");//Imprime lo que pide ingresar 
        int edad = scaner.nextInt();//Leemos y guardamos en una variable
        scaner.nextLine();// Limpiar el buffer de entrada

        System.out.println("Ingrese la nacionalidad del compositor: ");//Imprime lo que pide ingresar 
        String nacionalidad = scaner.nextLine();//Leemos y guardamos en una variable

        System.out.println("Ingrese el salario del compositor: ");
        double salario = scaner.nextDouble();//Leemos y guardamos en una variable
        scaner.nextLine();// Limpiar el buffer de entrada

        System.out.print("Ingrese el número de composiciones: ");//Imprime lo que pide ingresar 
        int numeroDeComposiciones = scaner.nextInt();//Leemos y guardamos en una variable
        scaner.nextLine(); // Limpiar el buffer de entrada

        Compositor compositores = new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);//Isntanciamos la clase compositor con el constructor y mandamos las variables 

        boolean continuar = true;

        do { //Bucle infinito hasta que el usuario decida ya no ingresar mas canciones
            System.out.println("¿Desea ingresar una canción en el top 100 de Billboard? (si/no)");//Mostramos en consola si el usuario decide ingresar más canciones
            String respuesta = scaner.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {//Si la respuesta es sí, se ejecuta el codigo

                System.out.print("Ingrese el Código: ");//Imprime lo que pide ingresar 
                int codigoCancion = scaner.nextInt();//Leemos y guardamos en una variable
                scaner.nextLine(); // Limpiar el buffer de entrada

                System.out.print("Ingrese el título: ");//Imprime lo que pide ingresar 
                String tituloCancion = scaner.nextLine();//Leemos y guardamos en una variable

                System.out.print("Ingrese letra: ");//Imprime lo que pide ingresar 
                String letra = scaner.nextLine();//Leemos y guardamos en una variable

                System.out.print("Ingrese el tiempo en minutos: ");//Imprime lo que pide ingresar 
                double tiempoEnMinutos = scaner.nextDouble();
                scaner.nextLine(); // Limpiar el buffer de entrada
                compositores.agregarCancion(codigoCancion, tituloCancion, letra, tiempoEnMinutos);//Utilizamos el método agregarCancion de la clase compositor para guardar los datos de entrada
            } else {
                continuar = false; //Continuar false para salir del bucle
            }
        } while (continuar);

        return compositores;//Retornamos el objeto compositor ya creado e inicializado

    }

    public void verCompositor(List<Compositor> compositores) {
        System.out.println("Lista de compositores : " + compositores);
    }

    public Compositor actualizarCompositor(Object retorno) {
         if (retorno instanceof Compositor) {

            int codigo = ((Compositor) retorno).getCodigo();
            for (int i = 0; i < compositores.size(); i++) {
                Compositor pers = compositores.get(i);
                if (pers.getCodigo() == codigo) {
                    compositores.set(i, (Compositor) retorno);
                    break;
                }
            }

        }
    }

    public Compositor buscarCompositor(String nombre) {
        for (Compositor compositor : compositores) {
            if (compositor.getNombre().equalsIgnoreCase(nombre)) {
                return compositor;
            }
        }
    }

    public Compositor eliminarCompositor(Object obj) {
        if (obj instanceof Persona) {

            for (int i = 0; i < compositores.size(); i++) {
                Persona pers = compositores.get(i);
                if (pers.equals((Persona) obj)) {
                    compositores.remove(i);
                    break;
                }
            }

        }
    }

}
