package configuracion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configuracion_Descuentos extends JDialog implements ActionListener {
	
	double desc, descUno, descDos, descTres, descCuatro;
	
	public void mostrarCajaDialog() {
	
	txtUno.setText(String.valueOf(descUno));
    txtDos.setText(String.valueOf(descDos));
    txtTres.setText(String.valueOf(descTres));
    txtCuatro.setText(String.valueOf(descCuatro));
    
	}

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtUno;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblA_1;
	private JLabel lblMsDe;
	private JTextField txtDos;
	private JTextField txtTres;
	private JTextField txtCuatro;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Configuracion_Descuentos dialog = new Configuracion_Descuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Configuracion_Descuentos() {
		setTitle("Configurar porcentajes de descuento");
		setBounds(100, 100, 551, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		txtUno = new JTextField();
		txtUno.setBounds(158, 7, 96, 19);
		contentPanel.add(txtUno);
		txtUno.setColumns(10);
		
		lblNewLabel = new JLabel("1 a 5 unidades");
		lblNewLabel.setBounds(25, 13, 96, 13);
		contentPanel.add(lblNewLabel);
		
		lblA = new JLabel("6 a 10 unidades");
		lblA.setBounds(25, 56, 96, 13);
		contentPanel.add(lblA);
		
		lblA_1 = new JLabel("11 a 15 unidades");
		lblA_1.setBounds(25, 106, 96, 13);
		contentPanel.add(lblA_1);
		
		lblMsDe = new JLabel("Más de 15 unidades");
		lblMsDe.setBounds(25, 159, 123, 13);
		contentPanel.add(lblMsDe);
		
		txtDos = new JTextField();
		txtDos.setColumns(10);
		txtDos.setBounds(158, 50, 96, 19);
		contentPanel.add(txtDos);
		
		txtTres = new JTextField();
		txtTres.setColumns(10);
		txtTres.setBounds(158, 100, 96, 19);
		contentPanel.add(txtTres);
		
		txtCuatro = new JTextField();
		txtCuatro.setColumns(10);
		txtCuatro.setBounds(158, 153, 96, 19);
		contentPanel.add(txtCuatro);
		
		lblNewLabel_4 = new JLabel("%");
		lblNewLabel_4.setBounds(264, 13, 45, 13);
		contentPanel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(264, 56, 45, 13);
		contentPanel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(264, 106, 45, 13);
		contentPanel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(264, 159, 45, 13);
		contentPanel.add(lblNewLabel_7);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(415, 9, 85, 21);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(415, 52, 85, 21);
		contentPanel.add(btnCancelar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		descUno=Double.parseDouble(txtUno.getText());
		descDos=Double.parseDouble(txtDos.getText());
		descTres=Double.parseDouble(txtTres.getText());
		descCuatro=Double.parseDouble(txtCuatro.getText());
		
		
	}
}
