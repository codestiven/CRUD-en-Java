package interfaz;

import javax.swing.*;
import java.awt.*;

public class prueva {
	JFrame ventana;
	 JPanel panel, panel2;
	 JLabel nombre, apellido, correo, celular, direccion, genero, foto;
	 JTextField linea1, linea2, linea3, linea4, linea5;
	 JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, 
	boton8, boton9;
	 JComboBox<String> menudespeglabe;
	 JTable tabla;
	 JScrollPane pane;
	 void titulos(){
	 nombre = new JLabel("Nombre del contactos");
	 nombre.setBounds(20, 25, 160, 40);
	 nombre.setFont(new Font("arial", Font.BOLD, 11));
	 apellido = new JLabel("Apellido del contactos");
	 apellido.setBounds(20, 70, 160, 40);
	 apellido.setFont(new Font("arial", Font.BOLD, 11));
	 correo = new JLabel("Emails");
	 correo.setBounds(20, 115, 180, 40);
	 correo.setFont(new Font("arial", Font.BOLD, 11));
	 celular = new JLabel("Celular");
	 celular.setBounds(180, 115, 220, 40);
	 celular.setFont(new Font("arial", Font.BOLD, 11));
	 direccion = new JLabel("Direccion");
	 direccion.setBounds(20, 160, 220, 40);
	 direccion.setFont(new Font("arial", Font.BOLD, 11));
	 genero = new JLabel("Sexo");
	 genero.setBounds(250, 160, 220, 40);
	 genero.setFont(new Font("arial", Font.BOLD, 12));
	 foto = new JLabel("Foto");
	 foto.setBounds(280, 40, 180,105);
	 foto.setHorizontalAlignment(SwingConstants.CENTER);
	 foto.setBorder(BorderFactory.createLineBorder(Color.gray));
	 }
	 void espacio(){
	 //JTextfield y sus configuraciones
	 linea1 = new JTextField();
	 linea1.setBounds(20, 60, 170, 20);
	 linea2 = new JTextField();
	 linea2.setBounds(20, 100, 170, 20);
	 linea3 = new JTextField();
	 linea3.setBounds(20, 145, 150, 20);
	 linea4 = new JTextField();
	 linea4.setBounds(180, 145, 90, 20);
	 linea5 = new JTextField();
	 linea5.setBounds(20, 190, 185, 20);
	 }
	 void botones() {
		 //JButton y sus configuraciones
		 boton1 = new JButton("Cargar foto");
		 boton1.setBounds(280, 145, 180, 23);
		 boton2 = new JButton("Probar conexion");
		 boton2.setBounds(20, 230, 180, 20);
		 boton3 = new JButton("Cancelar conexion");
		 boton3.setBounds(250, 230, 180, 20);
		 boton4 = new JButton("Ir");
		 boton4.setBounds(20, 440, 45, 40);
		 boton5 = new JButton("Guardar");
		 boton5.setBounds(60, 440, 85, 40);
		 boton6 = new JButton("Eliminar");
		 boton6.setBounds(140, 440, 85, 40);
		 boton7 = new JButton("Modificar");
		 boton7.setBounds(220, 440, 100, 40);
		 boton8 = new JButton("Limpiar");
		 boton8.setBounds(320, 440, 95, 40);
		 boton9 = new JButton("Salir");
		 boton9.setBounds(410, 440, 95, 40);
		 //JCombobox y sus configuraciones
		 menudespeglabe = new JComboBox<>();
		 menudespeglabe.addItem("Seleccionar");
		 menudespeglabe.addItem("Hombre");
		 menudespeglabe.addItem("Mujer");
		 menudespeglabe.setBackground(Color.white);
		 menudespeglabe.setBounds(249, 190, 180, 20);
		 }
		 void tabla(){
		 String[] columna = new String[]{"Nombre", "Apellido", 
		"Emails", "Telefono", "Direccion", "Sexo"};
		 String[][] registros = new String[][]{};
		 tabla = new JTable(registros, columna);
		 tabla.setBounds(30, 40, 200, 300);
		 pane = new JScrollPane(tabla);
		 pane.setBounds(0, 0, 485,170);
		 }
		 void paneles(){
		 panel = new JPanel();
		 panel2 = new JPanel();
		 panel.setLayout(null);
		 panel2.setLayout(null);
		 
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(1, Color.gray, Color.gray),
		 "Datos Personales", 1, 2));
		 panel2.setBorder(BorderFactory.createBevelBorder(1, 
		Color.gray, Color.gray));
		 panel.setBounds(5, 5, 523, 500);

		 panel2.setBounds(20, 260, 484, 170);
		 panel.add(panel2);
		 panel.add(nombre);
		 panel.add(apellido);
		 panel.add(correo);
		 panel.add(celular);
		 panel.add(direccion);
		 panel.add(genero);
		 panel.add(foto);
		 panel.add(linea1);
		 panel.add(linea2);
		 panel.add(linea3);
		 panel.add(linea4);
		 panel.add(linea5);
		 panel.add(boton1);
		 panel.add(boton2);
		 panel.add(boton3);
		 panel.add(boton4);
		 panel.add(boton5);
		 panel.add(boton6);
		 panel.add(boton7);
		 panel.add(boton8);
		 panel.add(boton9);
		 panel.add(genero);
		 panel.add(menudespeglabe);
		 panel2.add(pane);
		 }
		 private void metodoventana(){
		 ventana = new JFrame();
		 ventana.setLayout(null);
		 ventana.setTitle("Formulario de contactos");
		 ventana.setSize(550,550);
		 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 ventana.setLocationRelativeTo(null);
		 ventana.setVisible(true);
		 ventana.add(panel);
		 }
		 public prueva() {
		 titulos();
		 espacio();
		 botones();
		 tabla();
		 paneles();
		 metodoventana();
		 }
		}

	 

