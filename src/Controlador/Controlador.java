package Controlador;

import Modelo.Modelo;
import Vista.Login;
import Vista.Tabla;

public class Controlador {
	private Modelo miModelo;
	private Tabla miVista;
	private Login log;

	public void setModelo(Modelo miModelo) {
		this.miModelo=miModelo;
	}

	public void setVista(Tabla miVista) {
		this.miVista=miVista;
	}
	
	public void setVistaLogin(Login vistaLogin) {
		this.log = vistaLogin;
	}

	public void logeoCorrecto() {
		String user = log.getTxtUser();
		String pass = log.getTxtPass();
		miModelo.setDatosLogin(user, pass);
		
	}
	public void CambioDeInterfaz1(){
		miModelo.Login();
		
	}
	
	

}
