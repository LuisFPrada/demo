package com.example.proyecto;

import com.example.proyecto.controller.ControladorTaller;
import com.example.proyecto.controller.InterfazConsola;
import com.example.proyecto.controller.TipoTraccion;
import com.example.proyecto.modelo.Carro;
import com.example.proyecto.modelo.Moto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proyecto {

	public static void main(String[] args) {SpringApplication.run(Proyecto.class, args);
		InterfazConsola interfazConsola = new InterfazConsola();
		ControladorTaller controladorTaller = new ControladorTaller();

		// Registrar una moto
		Moto moto = new Moto("Honda", "CB125R", "ABC123", 120, 125);
		controladorTaller.registrarCompra(moto);

		// Registrar un carro
		Carro carro = new Carro("Toyota", "Corolla", "XYZ456", 180, TipoTraccion.AUTOMATICA);
		controladorTaller.registrarCompra(carro);

		// Realizar prueba de ruta de la moto
		controladorTaller.realizarPruebaRuta(moto);

		// Realizar prueba de ruta del carro
		controladorTaller.realizarPruebaRuta(carro);

		// Registrar la venta de la moto
		controladorTaller.registrarVenta(moto);

		// Registrar la venta del carro
		controladorTaller.registrarVenta(carro);
	}

}


