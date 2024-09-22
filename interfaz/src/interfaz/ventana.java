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
	JPanel arriba, medio, abajo;
	JPanel fuente, estilo , tamano ;
	JLabel fuentes , estilos , tamanos;
	JTextField cuadro,cuadro2,cuadro3;
    JList lista1 ,  lista2 , lista3;


	

	cuadro = new  JTextField("Tahoma");
	cuadro.setForeground(Color.gray);
	cuadro2 = new  JTextField("Sin formato");
	cuadro2.setForeground(Color.gray);
	cuadro3 = new  JTextField("18");
	
	
	String  fonts[]= {"sylfaen","symbol","tahoma","Times new roman","trebuchet MS                                             ","Verdana","Webdings","wingdings","yugothic","sylfaen","symbol","tahoma","Times new roman","trebuchet MS","Verdana","Webdings","wingdings","yugothic"};
	String  fonts2[]= {"sin Formato","Negrita","Cursiva","Negrita Cursiva                        "};
	String  fonts3[] = new String[151];
	

	for(int i = 0;i<=150;i++) {
		
		fonts3[i] = Integer.toString(i)+"                   ";

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
	

	
	
//panel tama;o------------------------------------------------


	fuente = new JPanel();
	fuente.setLayout(new BoxLayout(fuente,BoxLayout.Y_AXIS));
	// agregando texto
	fuentes = new JLabel("Fuentes:");
	arriba = new JPanel();
	arriba.add(fuentes);
	arriba.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
	fuente.add(arriba);
	// agregando cuadro
	medio = new JPanel();
	medio.setLayout(new BoxLayout(medio, BoxLayout.Y_AXIS));
	medio.setBorder(new EmptyBorder(0,5,0,5));
	medio.add(cuadro);

	fuente.add(medio);
//abajo
abajo = new JPanel();
abajo.setLayout(new BoxLayout(abajo, BoxLayout.X_AXIS));
abajo.add(llista1);
fuente.add(abajo);





	// panel estilo------------------------------------------------------
	estilo = new JPanel();
	estilo.setLayout(new BoxLayout(estilo,BoxLayout.Y_AXIS));
	// agregando texto
	estilos = new JLabel("estilos de Fuentes:");
	arriba = new JPanel();
	arriba.add(estilos);
	arriba.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
	estilo.add(arriba);
	
	// agregando cuadro
	medio = new JPanel();
	medio.setLayout(new BoxLayout(medio, BoxLayout.Y_AXIS));
	medio.add(cuadro2);
	medio.setBorder(new EmptyBorder(0, 5, 0, 5));

	estilo.add(medio);
	// --------
;
	estilo.add(llista2);
	


	tamano = new JPanel();
	tamano.setBorder(new EmptyBorder(0, 0, 0, 5));
	tamano.setLayout(new BoxLayout(tamano,BoxLayout.Y_AXIS));
	// agregando texto
	tamanos = new JLabel("tamaño");
	arriba = new JPanel();
	arriba.add(tamanos);
	arriba.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
	
	tamano.add(arriba);
	// agregando texto

	
	// agregando cuadro
	medio = new JPanel();
	medio.setLayout(new BoxLayout(medio, BoxLayout.Y_AXIS));
	medio.setBorder(new EmptyBorder(0, 5, 0, 5));
	medio.add(cuadro3);

	tamano.add(medio);
	// --------
	tamano.add(llista3);
	
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
	prueva.setBorder(new EmptyBorder(10, 10, 10, 10));

	prueva.setFont(new Font("Tahoma",Font.BOLD, 18));
	
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
	panelDown.setBorder(new EmptyBorder(1, 1, 1, 1));
	panelDown.add(aceptar);
	panelDown.add(canselar);
	panelDown.add(ayudar);
	
}
	void crearventana(){
		ventana = new JFrame();
		ventana.setTitle("tarea 1");
		ventana.setVisible(true);
		ventana.setSize(600,490);
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
