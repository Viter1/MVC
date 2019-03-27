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

	public Modelo() {
		miTabla = new DefaultTableModel(
				new String[][] { { "Javier FernÃ¡ndez", "123456789" }, { "Santiago LÃ³pez", "987654321" }, },
				new String[] { "Nombre", "TelÃ©fono" });
	}

	public void setVista(Tabla miVista) {
		this.miVista = miVista;
	}

	public void setVistaLogin(Login vistaLogin) {
		this.vistaLogin = vistaLogin;
	}

	public DefaultTableModel getTabla() {
		return miTabla;
	}

	public String getUser() {
		return user;
	}

	public String getContraseña() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}



	public void setUser(String user) {
		this.user = user;
	}

	public void setDatosLogin(String usuario, String pass) {
		this.user = usuario;
		this.pass = pass;
		accesoLogin();
		vistaLogin.loginActualizado();

	}

	public void accesoLogin() {

		
		if (getUser().equalsIgnoreCase("Vitter") && getContraseña().equals("12345")) {
			acceso = true;
		} else {
			acceso = false;
			setPass(" ");
			setUser(" ");

		}

	}

	public boolean getacceso() {
		return acceso;

	}

	public void Login() {
		if (getacceso()) {
			vistaLogin.setVisible(false);
			miVista.setVisible(true);
		} else {
			vistaLogin.setVisible(false);
		}
	}

}
