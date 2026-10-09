package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA INCREMENTAL PERSONA ===");

        // 1. Upcasting con Arreglo de Personas
        Persona[] listaPersonas = {
            new Cliente("Ana López", "04512378-9", "7777-1234", 4000.0),
            new Empleado("Luis Pérez", "06223456-1", 850.0),
            new Estudiante("Kevin Ramos", "03991234-5", "UPED-045", "Ing. Sistemas", 9.1),
            new Voluntario("Sara Gómez", "07456123-2", 120.0),
            new Proveedor("Comercial Ríos", "06554321-8", 8000.0),
            new Gerente("Marta Díaz", "05123456-7", 1200.0, 5),
            new DocenteInvestigador("Dr. Iván Reyes", "07321456-9", "Ing. Software", 8, 4)
        };

        for (Persona p : listaPersonas) {
            System.out.println(p.presentarse() + " -> Beneficio Anual: $" + p.calcularBeneficioAnual());
        }

        System.out.println("\n=== VERIFICACIÓN DOWNCASTING CON INSTANCEOF ===");
        for (Persona p : listaPersonas) {
            if (p instanceof Gerente) {
                Gerente g = (Gerente) p;
                System.out.println("Gerente encontrado: " + g.presentarse() + " | Equipo: " + g.getTamanoEquipo());
            }
        }
    }
}