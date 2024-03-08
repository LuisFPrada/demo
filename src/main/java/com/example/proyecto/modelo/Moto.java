package com.example.proyecto.modelo;

import com.example.proyecto.controller.AccionesVehiculo;

public class Moto extends Vehiculo implements AccionesVehiculo {

    private int cilindraje;

    public Moto(String marca, String modelo, String placa, int velocidadMaxima, int cilindraje) {
        super(marca, modelo, placa, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto acelera!");
    }

    @Override
    public void frenar() {
        System.out.println("La moto frena!");
    }

    @Override
    public void estacionar() {
        System.out.println("La moto se estaciona!");
    }

    @Override
    public void girar() {
        System.out.println("La moto gira!");
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindraje=" + cilindraje +
                ", " + super.toString() +
                '}';
    }
}
