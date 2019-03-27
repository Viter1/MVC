package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Modelo.Modelo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtUser;
	private JTextField txtPass;
	private JLabel lblAcceso;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Login() {

		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(75, 31, 46, 14);
		contentPane.add(lblUser);

		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setBounds(75, 85, 79, 14);
		contentPane.add(lblPassword);

		txtUser = new JTextField();
		txtUser.setBounds(68, 54, 86, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JTextField();
		txtPass.setBounds(68, 110, 86, 20);
		contentPane.add(txtPass);
		txtPass.setColumns(10);

		JButton btnBotonLogin = new JButton("Login");
		btnBotonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.logeoCorrecto();
				miControlador.CambioDeInterfaz1();

			}
		});

		btnBotonLogin.setBounds(68, 152, 89, 23);
		contentPane.add(btnBotonLogin);
		lblAcceso = new JLabel(".....");
		lblAcceso.setBounds(88, 186, 46, 14);
		contentPane.add(lblAcceso);
	}

	public void loginActualizado() {
		String acces = "";
		if (miModelo.getacceso()) {
			acces = "Accept";
		} else {
			acces = "Denied";
			
		}
		lblAcceso.setText(acces);
	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}

	public String getTxtUser() {
		return txtUser.getText();
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

	public String getTxtPass() {

		return txtPass.getText();
	}

	public void setTxtPass(JTextField txtPass) {
		this.txtPass = txtPass;
	}
}
