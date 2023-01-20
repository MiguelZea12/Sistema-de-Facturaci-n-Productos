package AlejandroZea;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class MenuPrincipal extends JFrame {
	private JDesktopPane desktopPane;
	public static boolean mostrarClientesLista=false;
	public static boolean mostrarProductos=false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Sistema de Facturacion");
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 128, 255));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sistema");
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Salir");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Clientes");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Crear clientes");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CrearCliente crearclientes = new CrearCliente();
			desktopPane.add(crearclientes);
			if (mostrarClientesLista==false) {
				crearclientes.setVisible(true);
			mostrarClientesLista = true;
			}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Lista de clientes");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Productos");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Producto");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Productos producto = new Productos();
				if (mostrarProductos==false) {
				desktopPane.add(producto);
				producto.setVisible(true);
				mostrarProductos = true;
			}
			}	
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Redes Sociales");
		mnNewMenu_3.setIcon(null);
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Facebook");
		mnNewMenu_3.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Instagram");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		JPanel contenedor = new JPanel();
		contenedor.setBackground(new Color(184, 134, 11));
		contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contenedor);
		contenedor.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(192, 192, 192));
		contenedor.add(desktopPane, "name_745273466246100");
		desktopPane.setLayout(null);
	}
}
