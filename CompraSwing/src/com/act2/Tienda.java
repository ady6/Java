package com.act2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TextField;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.imageio.ImageIO;
import javax.swing.AbstractListModel;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Tienda {

	private JFrame frame;
	private JTextField txtCorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda window = new Tienda();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tienda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 181));
		frame.setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 606, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_correo = new JPanel();
		panel_correo.setBackground(new Color(153, 255, 255));
		panel_correo.setBounds(23, 37, 211, 57);
		frame.getContentPane().add(panel_correo);
		panel_correo.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label_correo = new JLabel("Escriba su correo electr\u00F3nico");
		label_correo.setFont(new Font("Rockwell", Font.PLAIN, 11));
		panel_correo.add(label_correo);
		
		txtCorreo = new JTextField();
		panel_correo.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		ButtonGroup grupo = new ButtonGroup();
	

		
		ImageIcon imagen = new ImageIcon("C:\\Users\\Campus FP\\Downloads\\mar.jpg");
		
		JPanel panel_stock = new JPanel();
		panel_stock.setBackground(new Color(153, 255, 255));
		panel_stock.setBounds(23, 105, 211, 49);
		frame.getContentPane().add(panel_stock);
		panel_stock.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblUnidadesEnStock = new JLabel("Unidades en stock");
		lblUnidadesEnStock.setFont(new Font("Rockwell", Font.PLAIN, 11));
		panel_stock.add(lblUnidadesEnStock);
		
		JSpinner ud_stock_num = new JSpinner();
		panel_stock.add(ud_stock_num);
		
		JPanel panel_producto = new JPanel();
		panel_producto.setBackground(new Color(153, 255, 255));
		panel_producto.setBounds(297, 37, 211, 117);
		frame.getContentPane().add(panel_producto);
		panel_producto.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lbl_producto = new JLabel("Eliga un producto");
		lbl_producto.setFont(new Font("Rockwell", Font.PLAIN, 11));
		panel_producto.add(lbl_producto);
		
		JScrollPane scroll_productos = new JScrollPane();
		panel_producto.add(scroll_productos);
		
		JList lista_productos = new JList();
		scroll_productos.setViewportView(lista_productos);
		lista_productos.setModel(new AbstractListModel() {
			String[] values = new String[] {"Mesa", "Silla", "Lámpara", "Sofá"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JPanel panel_pago = new JPanel();
		panel_pago.setBackground(new Color(153, 255, 255));
		panel_pago.setBounds(297, 173, 211, 99);
		frame.getContentPane().add(panel_pago);
		panel_pago.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label_pago = new JLabel("Eliga el m\u00E9todo de pago");
		label_pago.setFont(new Font("Rockwell", Font.PLAIN, 11));
		panel_pago.add(label_pago);
		
		JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
		panel_pago.add(rdbtnTarjeta);
		grupo.add(rdbtnTarjeta);
		
		JRadioButton rdbtnPayPal = new JRadioButton("PayPal");
		panel_pago.add(rdbtnPayPal);
		grupo.add(rdbtnPayPal);
		
		JRadioButton rdbtnEfectivo = new JRadioButton("Efectivo");
		panel_pago.add(rdbtnEfectivo);
		grupo.add(rdbtnEfectivo);
		
		
		JCheckBox chckbxPolitica = new JCheckBox("Acepto la pol\u00EDtica de privacidad");
		chckbxPolitica.setBounds(297, 303, 211, 23);
		frame.getContentPane().add(chckbxPolitica);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.setBounds(358, 344, 89, 23);
		frame.getContentPane().add(btnComprar);
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnComprar, "La compra del producto \""+lista_productos.getSelectedValue()+"\" se ha efectuado correctamente");
			}
		});
		btnComprar.setEnabled(false);
		
		JButton btnModoOscuro = new JButton("Modo Oscuro");
		btnModoOscuro.setBackground(new Color(127, 255, 212));
		btnModoOscuro.setBounds(486, 0, 113, 23);
		frame.getContentPane().add(btnModoOscuro);
		btnModoOscuro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.black);
			}
		});
		
		JButton btnCalcular = new JButton("Calcular precio");
		btnCalcular.setBounds(56, 186, 138, 32);
		frame.getContentPane().add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float precio= 0;
				float preciototal= 0;
				int unidades=(int) ud_stock_num.getValue();

			
				if (lista_productos.getSelectedValue().equals("Mesa")) {
					precio=(float) 7.95;
					preciototal=(precio*unidades);
				}
				else if (lista_productos.getSelectedValue().equals("Silla")) {
					precio=(float) 15.95;
					preciototal=(precio*unidades);
				}
				else if (lista_productos.getSelectedValue().equals("Lámpara")) {
					precio=(float) 25.50;
					preciototal=(precio*unidades);
				}
				else if (lista_productos.getSelectedValue().equals("Sofá")) {
					precio=(float) 9.99;
					preciototal=(precio*unidades);
				}
				else {
					JOptionPane.showMessageDialog(btnCalcular, "No ha elegido un producto o no ha introducido el número de stock que se llevará");
				}
				
				JOptionPane.showMessageDialog(btnCalcular, "El importe total es de "+preciototal+" euros");
				
			}
		
		});
		
		JButton btnFinalizar = new JButton("Finalizar compra");
		btnFinalizar.setBounds(56, 258, 138, 32);
		frame.getContentPane().add(btnFinalizar);
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float precio= 0;
				float preciototal= 0;
				int unidades=(int) ud_stock_num.getValue();

				if (lista_productos.getSelectedValue().equals("Mesa")) {
					precio=(float) 7.95;
					float precioiva=(precio*21)/100;
					if (rdbtnTarjeta.isSelected()) {
						preciototal=(precio*unidades)+precioiva+(float)9.99;
					}else {
						preciototal=(precio*unidades)+precioiva;
					}
				}
				else if (lista_productos.getSelectedValue().equals("Silla")) {
					precio=(float) 15.95;
					float precioiva=(precio*21)/100;
					if (rdbtnTarjeta.isSelected()) {
						preciototal=(precio*unidades)+precioiva+(float)9.99;
					}else {
						preciototal=(precio*unidades)+precioiva;
					}
				}
				else if (lista_productos.getSelectedValue().equals("Lámpara")) {
					precio=(float) 25.50;
					float precioiva=(precio*21)/100;
					if (rdbtnTarjeta.isSelected()) {
						preciototal=(precio*unidades)+precioiva+(float)9.99;
					}else {
						preciototal=(precio*unidades)+precioiva;
					}
				}
				else if (lista_productos.getSelectedValue().equals("Sofá")) {
					precio=(float) 9.99;
					float precioiva=(precio*21)/100;
					if (rdbtnTarjeta.isSelected()) {
						preciototal=(precio*unidades)+precioiva+(float)9.99;
					}else {
						preciototal=(precio*unidades)+precioiva;
					}
				}
				else {
					JOptionPane.showMessageDialog(btnFinalizar, "No ha elegido un producto o no ha introducido el número de stock que se llevará");
				}
				
				DecimalFormat formato = new DecimalFormat("#.00");
				String precioFormat=formato.format(preciototal);
				
				JOptionPane.showMessageDialog(btnFinalizar, "El importe total es de "+precioFormat+" euros");
				
			}
		
		});
	
		
		
	
		chckbxPolitica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPolitica.isSelected())
					btnComprar.setEnabled(true);
				else
					btnComprar.setEnabled(false);
			}
		});
	}
}