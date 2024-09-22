package interfaz;

import java.awt.*;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;


public class ventana {
JFrame ventana;
JPanel panel_principal;
JLabel texto , texto2 , text3 , texto3;
JComboBox<String> botonBox;

JPanel panelUP,panelMeddium,panelDown;
JButton boton = new JButton();

void panelUP() {
	
	botonBox = new JComboBox<String>();
    botonBox.addItem("editor predeterminado");
    botonBox.addItem("vede");
    botonBox.addItem("azul");
    botonBox.addItem("amarillo");
    botonBox.addItem("negro");

	boton.setBounds(30,30,100,30);
	texto = new JLabel("establece propiedad jlabel1's font utilizando ");
	texto.setFont(new Font("arial",0, 15));

	panelUP = new JPanel();

	panelUP.setLayout(new BoxLayout(panelUP,BoxLayout.X_AXIS));
	panelUP.setBorder(new EmptyBorder(10, 10, 10, 10));
	panelUP.add(texto);
	panelUP.add(botonBox);
	
	
}
void panelMeddium() {
	JPanel panelUP2,panelMeddium2,panelDown2;
	JPanel fuente, estilo , tamano ;
	JLabel fuentes , estilos , tamanos;
	JTextField cuadro,cuadro2,cuadro3;
    JList lista1 ,  lista2 , lista3;

	fuentes = new JLabel("Fuentes:");
	estilos = new JLabel("estilos de Fuentes:");
	tamanos = new JLabel("tamaño:");
	

	cuadro = new  JTextField("aa");


	cuadro2 = new  JTextField("aa");
	cuadro3 = new  JTextField("aa");
	
	
	String  fonts[]= {"sylfaen","symbol","tahoma","Times new roman","trebuchet MS","Verdana","Webdings","wingdings","yugothic","sylfaen","symbol","tahoma","Times new roman","trebuchet MS","Verdana","Webdings","wingdings","yugothic"};
	String  fonts2[]= {"sin Formato","Negrita","Cursiva","Negrita Cursiva"};
	String  fonts3[] = new String[151];

	for(int i = 0;i<=150;i++) {
		fonts3[i] = Integer.toString(i);

	};
	
	lista1 = new JList(fonts);
	JPanel llista1 = new JPanel();
	llista1.add(new JScrollPane(lista1));
	
	lista2 = new JList(fonts2);
	JPanel llista2 = new JPanel();
	llista2.add(new JScrollPane(lista2));
	
	lista3 = new JList(fonts3);
	JPanel llista3 = new JPanel();
	llista3.add(new JScrollPane(lista3));

	panelUP2 = new JPanel();
	panelUP2.setLayout(new BoxLayout(panelUP2,BoxLayout.Y_AXIS));
	panelUP2.add(new JRadioButton( "obtener el tipo de letra a partir del tipo de letra predeterminado"));
	panelUP2.setLayout(new FlowLayout(FlowLayout.LEFT));
	

	
	
	fuente = new JPanel();
	fuente.setLayout(new BoxLayout(fuente,BoxLayout.Y_AXIS));
	fuente.add(fuentes);
	fuente.add(cuadro);
	fuente.add(llista1);
	
	estilo = new JPanel();
	estilo.setLayout(new BoxLayout(estilo,BoxLayout.Y_AXIS));
	estilo.add(estilos);
	estilo.add(cuadro2);
	estilo.add(llista2);
	
	
	tamano = new JPanel();
	tamano.setLayout(new BoxLayout(tamano,BoxLayout.Y_AXIS));
	tamano.add(tamanos);
	tamano.add(cuadro3);
	tamano.add(new JScrollPane(llista3));
	
	panelMeddium2 = new JPanel();
	panelMeddium2.setLayout(new BoxLayout(panelMeddium2,BoxLayout.X_AXIS));
	panelMeddium2.add(fuente);
	panelMeddium2.add(estilo);
	panelMeddium2.add(tamano);
	

	


	
	
	
	panelMeddium = new JPanel();
	panelMeddium.setLayout(new BoxLayout(panelMeddium,BoxLayout.Y_AXIS));

    panelMeddium.setBorder(BorderFactory.createEtchedBorder (EtchedBorder.RAISED));
	panelMeddium.add(panelUP2);
	panelMeddium.add(panelMeddium2);
	
	
	//-----------------------
	JLabel prueva = new JLabel("Lorem Ipsum is simply dummy text of the printing ");
	prueva.setFont(new Font("arial",Font.BOLD, 20));
	
	panelDown2= new JPanel();
	panelDown2.setBorder(BorderFactory.createTitledBorder("Vista previa"));
	panelDown2.add(prueva);
	
	panelMeddium.add(panelDown2);
	
	
	
	



	
	
	


}

void panelDown() {
	JButton aceptar= new JButton("Aceptar");
	JButton canselar = new JButton("Canselar");
	JButton ayudar = new JButton("Ayudar");
	
	

	
	
	
	panelDown = new JPanel();
	panelDown.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
	panelDown.setBorder(new EmptyBorder(7, 7, 7, 7));
	panelDown.add(aceptar);
	panelDown.add(canselar);
	panelDown.add(ayudar);
	
}
	void crearventana(){
		ventana = new JFrame();
		ventana.setTitle("ejemplo form");
		ventana.setVisible(true);
		ventana.setSize(600,600);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		
		
		panel_principal = new JPanel();
	
		panel_principal.setBorder(new EmptyBorder(13, 13, 13, 13));
		
		panel_principal.setLayout(new BorderLayout());
		
		
		
		

		
		
		
		
		
		panel_principal.add(panelUP,BorderLayout.NORTH);
		panel_principal.add(panelMeddium,BorderLayout.CENTER);
		panel_principal.add(panelDown,BorderLayout.SOUTH);



		ventana.add(panel_principal);
		
		
	}
	
	
	ventana(){
		panelUP();
		panelMeddium();
		panelDown();
		crearventana();
	
	}
}
