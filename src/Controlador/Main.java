package Controlador;

import Modelo.Modelo;
import Vista.Login;
import Vista.Tabla;

public class Main {
	public static void main(String[] args) {
		//Creación de los objetos
		Controlador miControlador = new Controlador ();
		Modelo miModelo = new Modelo ();
		Tabla miVista = new Tabla ();
		Login miLogin = new Login ();
		
		//Relaciones entre objetos
		miModelo.setVista(miVista);
		miModelo.setVistaLogin(miLogin);
		miControlador.setModelo(miModelo);
		miControlador.setVista(miVista);
		miControlador.setVistaLogin(miLogin);
		miVista.setModelo(miModelo);
		miVista.setControlador(miControlador);
		miLogin.setModelo(miModelo);
		miLogin.setControlador(miControlador);
		
		//Primera vista visible
		miLogin.setVisible(true);
	}
}
