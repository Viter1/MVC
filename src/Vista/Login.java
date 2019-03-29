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
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {
	private Controlador miControlador;
	private Modelo miModelo;
	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtUser;
	private JTextField txtPass;
	private JLabel lblAcceso;
	private JButton btnBotonLogin;
	private JFileChooser teElijo;

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
		txtUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				enableBotones();
			}
		});
	
		txtUser.setBounds(68, 54, 86, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		txtPass = new JTextField();
		txtPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				enableBotones();
			}
		});
	
		txtPass.setBounds(68, 110, 86, 20);
		contentPane.add(txtPass);
		txtPass.setColumns(10);

		btnBotonLogin = new JButton("Login");
		btnBotonLogin.setEnabled(false);
		btnBotonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miControlador.logeoCorrecto();
				miControlador.CambioDeInterfaz1();

			}
		});

		btnBotonLogin.setBounds(68, 152, 89, 23);
		contentPane.add(btnBotonLogin);
		lblAcceso = new JLabel(".....");
		lblAcceso.setForeground(Color.RED);
		lblAcceso.setBounds(68, 186, 344, 45);
		contentPane.add(lblAcceso);
	}

	public void loginActualizado() {
		String acces = "";
		int intentos = miModelo.getReultadoLogin();
		if (intentos == 0) {
			acces = "Accept";
			miModelo.getacceso();
		} else if (intentos < 3) {
			acces = "Datos incorrectos te quedan " + (3 - miModelo.getReultadoLogin()) + " intentos";

		} else {
			System.exit(0);
		}
		lblAcceso.setText(acces);
	}

	private void enableBotones() {
		if (!txtUser.getText().equals("") && !txtPass.getText().equals("")) {
			btnBotonLogin.setEnabled(true);
		} else {
			btnBotonLogin.setEnabled(false);
		}

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
