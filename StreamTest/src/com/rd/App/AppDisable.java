package com.rd.App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.text.JTextComponent;

import com.rd.Data.Basic.DatosBasic;
import com.rd.Data.Element.DtoComponents;
import com.rd.Interfaces.Datos.UsuariosBasic;
import com.rd.Utilities.Element.Usuarios;

import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListDataListener;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSpinner;

public class AppDisable {

	private JFrame frame;
	private JTextField tNombre;
	private JTextField tEdad;
	private JTextField tCorreo;
	private JPasswordField tPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppDisable window = new AppDisable();
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
	public AppDisable() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 769, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 38, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblNewLabel_1.setLabelFor(tNombre);
		
		tNombre = new JTextField();
		GridBagConstraints gbc_tNombre = new GridBagConstraints();
		gbc_tNombre.insets = new Insets(0, 0, 5, 5);
		gbc_tNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tNombre.gridx = 5;
		gbc_tNombre.gridy = 2;
		panel.add(tNombre, gbc_tNombre);
		tNombre.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Edad");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 3;
		gbc_lblNewLabel_1_1.gridy = 4;
		panel.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		lblNewLabel_1_1.setLabelFor(tEdad);
		
		tEdad = new JTextField();
		tEdad.setColumns(10);
		GridBagConstraints gbc_tEdad = new GridBagConstraints();
		gbc_tEdad.insets = new Insets(0, 0, 5, 5);
		gbc_tEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_tEdad.gridx = 5;
		gbc_tEdad.gridy = 4;
		panel.add(tEdad, gbc_tEdad);
		
		JLabel lblNewLabel_1_2 = new JLabel("Correo");
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2.gridx = 3;
		gbc_lblNewLabel_1_2.gridy = 6;
		panel.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		lblNewLabel_1_2.setLabelFor(tCorreo);
		
		tCorreo = new JTextField();
		tCorreo.setColumns(10);
		GridBagConstraints gbc_tCorreo = new GridBagConstraints();
		gbc_tCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_tCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tCorreo.gridx = 5;
		gbc_tCorreo.gridy = 6;
		panel.add(tCorreo, gbc_tCorreo);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 8;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tPass = new JPasswordField();
		GridBagConstraints gbc_tPass = new GridBagConstraints();
		gbc_tPass.insets = new Insets(0, 0, 5, 5);
		gbc_tPass.fill = GridBagConstraints.HORIZONTAL;
		gbc_tPass.gridx = 5;
		gbc_tPass.gridy = 8;
		panel.add(tPass, gbc_tPass);
		
		JButton tSave = new JButton("Guardar");
		GridBagConstraints gbc_tSave = new GridBagConstraints();
		gbc_tSave.gridwidth = 2;
		gbc_tSave.insets = new Insets(0, 0, 5, 5);
		gbc_tSave.gridx = 6;
		gbc_tSave.gridy = 10;
		panel.add(tSave, gbc_tSave);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(new TitledBorder(null, "Listado", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridwidth = 7;
		gbc_scrollPane.gridheight = 6;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 12;
		panel.add(scrollPane, gbc_scrollPane);
		
		JList<String> list = new JList<>();
		scrollPane.setViewportView(list);
		
		//Clase listener boton 1
	class Hbotton implements ActionListener{

		private Usuarios users;
		private DefaultListModel<String> model;
		private int id;
		
		public Hbotton() {
			users = new Usuarios();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(id==0) {
				model = new DefaultListModel<String>();
				list.setModel(model);
			}
				
			UsuariosBasic p = new UsuariosBasic();
			
			if(Empty(tNombre,tEdad,tCorreo,tPass)) {
				p.update(new DtoComponents(++id, new DatosBasic(tNombre.getText(), Integer.parseInt(tEdad.getText()), tPass.getPassword()), tCorreo.getText()));
				users.Add(p);
				refresh();
				clean(tNombre,tEdad,tCorreo,tPass);
			}
			
		}
		
		private void refresh() {
			model.addElement(users.get(id).get());
		}
		
		private boolean Empty(JTextComponent... comp) {
			
			for (JTextComponent jt : comp) {
				if(jt.getText().isEmpty() && jt.getText().isBlank()) {
					return false;
				}
			}
			//Falla si esta vacio el campo y no sigue la condicion.
			
			return true;
		}
		
		private void clean(JTextComponent... comp) {
			
			for (JTextComponent jt : comp) {
				jt.setText("");
			}
		}
		
	}
	
	tSave.addActionListener(new Hbotton());
}
}