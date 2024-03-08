package com.example.proyecto.controller;

import java.util.Scanner;

public class InterfazConsola {

    private Scanner scanner;

    public InterfazConsola() {
        this.scanner = new Scanner(System.in);
    }

    public String leerDato(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
