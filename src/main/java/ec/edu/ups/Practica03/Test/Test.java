/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.ups.Practica03.Test;

import ec.edu.ups.Practica03.Controlador.ControladorPersona;
import java.util.Scanner;

/**
 *
 * @author Juan Fernandez
 */
public class Test {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        ControladorPersona controlador = new ControladorPersona();
        int opcion;
        //controlador.agregarParaPruebas();
        do {
            System.out.println("\n\nMENU");
            System.out.println("1. Ingreso de cantante");
            System.out.println("2. Ingreso de compositor");
            System.out.println("3. Agregar clientes");
            System.out.println("4. Imprimir persona");
            System.out.println("5. Búsqueda de cantante por nombre de disco");
            System.out.println("6. Búsqueda de compositor por nombre de canción");
            System.out.println("7. Salir");
            opcion = scaner.nextInt();
            scaner.nextLine();
            switch (opcion) {
                case 1:
                    controlador.registrar(true);
                   
                    break;
                case 2:
                    controlador.registrar(false);
                    break;
                case 3:
                    controlador.agregarCliente();
                    break;
                case 4:
                    controlador.imprimirPersona();
                    break;
                case 5:
                    controlador.buscarPorNombreDeDisco();
                    break;
                case 6:
                    controlador.buscarPorNombreCancion();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (opcion != 7);
    }

}
