package com.example.proyecto.modelo;

public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected String placa;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, String placa, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar();

    public abstract void frenar();

    public abstract void estacionar();

    public abstract void girar();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }
}
