package AlejandroZea;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CrearCliente extends JInternalFrame {

	
	private JTextField textCedula;
	private JTextField textNombre;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JTextField textEmail;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCliente frame = new CrearCliente();
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
	public CrearCliente() {
		setTitle("Clientes");
		setBounds(100, 100, 533, 491);
		getContentPane().setLayout(null);
		
		JLabel lblCdula = new JLabel("Cédula");
		lblCdula.setBounds(41, 28, 70, 15);
		getContentPane().add(lblCdula);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(41, 68, 70, 15);
		getContentPane().add(lblNombres);
		
		textCedula = new JTextField();
		textCedula.setBounds(108, 26, 114, 19);
		getContentPane().add(textCedula);
		textCedula.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(108, 66, 231, 19);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Dirección");
		lblDireccin.setBounds(41, 108, 70, 15);
		getContentPane().add(lblDireccin);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(108, 106, 231, 19);
		getContentPane().add(textDireccion);
		textDireccion.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Teléfono");
		lblTelfono.setBounds(41, 153, 70, 15);
		getContentPane().add(lblTelfono);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(108, 151, 231, 19);
		getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(41, 188, 70, 15);
		getContentPane().add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(108, 186, 231, 19);
		getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textCedula.setText(" ");
				textNombre.setText(" ");
				textDireccion.setText(" ");
				textTelefono.setText(" ");
				textEmail.setText(" ");
			}
		});
		btnNuevo.setBounds(30, 231, 117, 25);
		getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Agregar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel datos = (DefaultTableModel) table_2.getModel();
				datos.addRow(new Object[] {textCedula.getText(), textNombre.getText(), textDireccion.getText(), textTelefono.getText(), textEmail.getText()});
				
				
			}
		});
		btnGuardar.addMouseListener(new MouseAdapter() {
			
		});
		btnGuardar.setBounds(157, 231, 117, 25);
		getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(286, 231, 117, 25);
		getContentPane().add(btnCancelar);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setViewportBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		scrollPane_1_1.setBounds(0, 266, 507, 184);
		getContentPane().add(scrollPane_1_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cedula", "Nombre", "Direccion", "Telefono", "Email"
			}
		));
		table_2.getColumnModel().getColumn(2).setPreferredWidth(150);
		table_2.getColumnModel().getColumn(4).setPreferredWidth(164);
		scrollPane_1_1.setViewportView(table_2);
		table_2.setForeground(new Color(0, 0, 0));
		table_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

	}
}
