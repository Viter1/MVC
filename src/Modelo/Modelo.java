package Modelo;

import javax.swing.table.DefaultTableModel;

import Vista.Login;
import Vista.Tabla;

public class Modelo {
	private Login vistaLogin;
	private Tabla miVista;	
	private DefaultTableModel miTabla;
	private String user;
	private String pass;
	private boolean acceso;
	
	public Modelo () {
		miTabla = new DefaultTableModel(
				new String[][] { { "Javier Fernández", "123456789" }, { "Santiago López", "987654321" }, },
				new String[] { "Nombre", "Teléfono" });
	}
	
	public void setVista(Tabla miVista) {
		this.miVista=miVista;
	}
	
	public void setVistaLogin(Login vistaLogin) {
		this.vistaLogin = vistaLogin;
	}
	
	public DefaultTableModel getTabla () {
		return miTabla;
	}

	public String getUser() {
		return user;
	}

	public String getContrase�a() {
		return pass;
	}

	
	public void setDatosLogin(String usuario , String pass ) {
		this.user = usuario;
		this.pass = pass;
		accesoLogin();
		vistaLogin.loginActualizado();
		
	}
	
	public void accesoLogin() {
		if (user.equalsIgnoreCase("Vitter") && pass.equalsIgnoreCase("12345")) {
			acceso = true;
		} else {
			acceso = false;
		}
	}
	
	public boolean getacceso() {
		return acceso;
		
	}
	
	
	
}
