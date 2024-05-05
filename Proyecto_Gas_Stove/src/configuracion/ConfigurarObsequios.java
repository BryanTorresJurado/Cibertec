package configuracion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConfigurarObsequios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblUnidades;
	private JTextField txtUnidad1;
	private JTextField txtDosHastaCinco;
	private JTextField txtMasDeSeis;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequios frame = new ConfigurarObsequios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConfigurarObsequios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 155);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("1 Unidad");
		lblNewLabel.setBounds(10, 23, 80, 13);
		contentPane.add(lblNewLabel);
		
		lblA = new JLabel("2 a 5 Unidades");
		lblA.setBounds(10, 53, 80, 13);
		contentPane.add(lblA);
		
		lblUnidades = new JLabel("6 a más Unidades");
		lblUnidades.setBounds(10, 86, 103, 13);
		contentPane.add(lblUnidades);
		
		txtUnidad1 = new JTextField();
		txtUnidad1.setBounds(119, 20, 96, 19);
		contentPane.add(txtUnidad1);
		txtUnidad1.setColumns(10);
		
		txtDosHastaCinco = new JTextField();
		txtDosHastaCinco.setColumns(10);
		txtDosHastaCinco.setBounds(119, 50, 96, 19);
		contentPane.add(txtDosHastaCinco);
		
		txtMasDeSeis = new JTextField();
		txtMasDeSeis.setColumns(10);
		txtMasDeSeis.setBounds(119, 83, 96, 19);
		contentPane.add(txtMasDeSeis);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(347, 19, 85, 21);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(347, 49, 85, 21);
		contentPane.add(btnCancelar);
	}

}
