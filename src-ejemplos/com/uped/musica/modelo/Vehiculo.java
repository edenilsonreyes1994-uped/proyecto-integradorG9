package com.uped.transporte.modelo;

public abstract class Vehiculo {
    protected String placa;
    protected double kilometrosRecorridos;

    public Vehiculo(String placa, double kilometrosRecorridos) {
        this.placa = placa;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    // Método abstracto: cada subclase define su propia fórmula de peaje
    public abstract double calcularCostoPeaje();

    // Método concreto y final: igual para todo vehículo, no debe sobrescribirse
    public final void mostrarFicha() {
        System.out.println("Placa: " + placa + " | Km recorridos: " + kilometrosRecorridos);
    }
}