package AlejandroZea;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class Productos extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable tableproductos;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Productos frame = new Productos();
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
	public Productos() {
		setBounds(100, 100, 414, 426);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(30, 31, 76, 19);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setBounds(30, 61, 76, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Descripción");
		lblNewLabel_2.setBounds(30, 86, 87, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		lblNewLabel_3.setBounds(30, 111, 76, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(116, 30, 117, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 58, 117, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 83, 249, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 108, 164, 20);
		getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnNewButton.setBounds(17, 160, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular y Agregar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Producto producto = new Producto();
				producto.setCodigo(textField.getText());
				producto.setCantidad (Float.parseFloat(textField_1.getText()));
				producto.setDescripcion(textField_2.getText());
				producto.setPrecio (Float.parseFloat(textField_3.getText()));
				producto.setTotal(producto.getCantidad()*producto.getPrecio());
				
				Object[]fila = new Object[5];
				fila[0] = producto.getCodigo();
				fila[1] = producto.getCantidad();
				fila[2] = producto.getDescripcion();
				fila[3] = producto.getPrecio();
				fila[4] = producto.getTotal();
				model.addRow(fila);
			}
			

		});
		btnNewButton_1.setBounds(133, 160, 147, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(299, 160, 89, 23);
		getContentPane().add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 208, 356, 161);
		getContentPane().add(scrollPane);
		
		tableproductos = new JTable();
		tableproductos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Cantidad", "Descripci\u00F3n", "Precio", "Total"
			}
		));
		scrollPane.setViewportView(tableproductos);
		model = (DefaultTableModel) tableproductos.getModel();
	}
}
