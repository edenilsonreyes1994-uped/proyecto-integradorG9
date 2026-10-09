package com.uped.musica;

import com.uped.musica.modelo.Instrumento;
import com.uped.musica.modelo.Guitarra;
import com.uped.musica.modelo.Piano;
import com.uped.musica.modelo.Bateria;

public class MainBanda {
    public static void main(String[] args) {
        // Objeto con tipo declarado "Instrumento" y tipo real "Guitarra"
        Instrumento i = new Guitarra();

        // 1. Campo 'tipo': Ligadura estática -> Imprime "generico"
        System.out.println(i.tipo);

        // 2. Método static 'identificar()': Ligadura estática -> Imprime "Instrumento generico"
        System.out.println(i.identificar());

        // 3. Método final 'mostrarTipo()': Ligadura estática -> Imprime "Tipo declarado: generico"
        i.mostrarTipo();

        // 4. Método sobrescrito 'tocar()': Ligadura dinámica -> Imprime "Rasgueo de cuerdas"
        i.tocar();

        System.out.println("--- banda completa ---");

        // Polimorfismo mediante ligadura dinámica
        Instrumento[] banda = {
            new Guitarra(),
            new Piano(),
            new Bateria()
        };

        for (Instrumento instr : banda) {
            instr.tocar();
        }
    }
}