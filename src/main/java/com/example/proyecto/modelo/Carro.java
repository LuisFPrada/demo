package com.example.proyecto.modelo;

import com.example.proyecto.controller.AccionesVehiculo;
import com.example.proyecto.controller.TipoTraccion;

public class Carro extends Vehiculo implements AccionesVehiculo {

    private TipoTraccion tipoTraccion;

    public Carro(String marca, String modelo, String placa, int velocidadMaxima, TipoTraccion tipoTraccion) {
        super(marca, modelo, placa, velocidadMaxima);
        this.tipoTraccion = tipoTraccion;
    }

    @Override
    public void acelerar() {
        System.out.println("El carro acelera!");
    }

    @Override
    public void frenar() {
        System.out.println("El carro frena!");
    }

    @Override
    public void estacionar() {
        System.out.println("El carro se estaciona!");
    }

    @Override
    public void girar() {
        System.out.println("El carro gira!");
    }

    public TipoTraccion getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(TipoTraccion tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipoTraccion=" + tipoTraccion +
                ", " + super.toString() +
                '}';
    }
}

