package interfaz;

import java.util.Vector;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ventana2 {
	JFrame ventana = new JFrame();
	JPanel panelPrincipal,panelTitulo,panelDatos,panelBotones,tabla,otros;
	JButton botones;
	JLabel texto;
	
	
	
	
	void panelTitulo() {
		panelTitulo = new JPanel();

		 JLabel usuarios = new JLabel();
		 
	       ImageIcon imagen = new ImageIcon("img/empleados.png");
	       Icon icon = new ImageIcon(
	                imagen.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT)
	                );
	        
	      usuarios.setIcon(icon);

		 
		 JLabel titulo = new JLabel("formulario de clientes");
		 titulo.setFont(new Font("arial",Font.BOLD, 30));
		 
		panelTitulo.setLayout(new BoxLayout(panelTitulo,BoxLayout.X_AXIS));
		panelTitulo.add(usuarios);
		panelTitulo.add(titulo);
		 
	}
	
	
	void panelDatos() {
		panelDatos = new JPanel();
		
		panelDatos.setBorder(BorderFactory.createTitledBorder("Datos clientes"));
		panelDatos.setLayout(new BoxLayout(panelDatos,BoxLayout.Y_AXIS));
		
		JPanel up,up_left,down,otros;
		JPanel ID;
		JLabel text;
		JTextField input;
		
		
		up = new JPanel();
		up.setLayout(new BoxLayout(up,BoxLayout.X_AXIS));
		
	    ID = new JPanel();
	    ID.setLayout(new BoxLayout(ID,BoxLayout.Y_AXIS));
	    text = new JLabel("ID");
	    input = new JTextField();
	    ID.add(text);
	    ID.add(input);
	     up.add(ID);
	       
	       
	    up_left = new JPanel();
	    up_left.setLayout(new BoxLayout(up_left,BoxLayout.X_AXIS));
	
	    
	    otros = new JPanel();
	    otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));
	    
        text = new JLabel("Descripcion");
        input = new JTextField();
        
        otros.add(text);
        otros.add(input);

        up_left.add(otros);
        
        
        otros = new JPanel();
        otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));
        
        text = new JLabel("Descripcion");
        input = new JTextField();
        
        otros.add(text);
        otros.add(input);

        up_left.add(otros);
        
        
        up.add(up_left);
        
        
        
	    
	    
        down = new JPanel();
        down.setLayout(new BoxLayout(down,BoxLayout.X_AXIS));
    
        otros = new JPanel();
        otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));
        
        text = new JLabel("Telefono");
        input = new JTextField();
        
        otros.add(text);
        otros.add(input);

        down.add(otros);
        
        
        otros = new JPanel();
        otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));
        
        text = new JLabel("RUC");
        input = new JTextField();
        
        otros.add(text);
        otros.add(input);

        down.add(otros);
        
        
        otros = new JPanel();
        down.add(otros);
        


	    
	    panelDatos.add(up);
	    panelDatos.add(down);

	 
	}
	void panelBotones() {
	    
	    ImageIcon imagen;
	    Icon icon;
	    JPanel otros2;
        panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        
	    //boton nuevo

	    
	    otros = new JPanel();
	    otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));

	    botones = new JButton();


        
        imagen = new ImageIcon("img/nuevo.png");
        icon = new ImageIcon(
                 imagen.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)
                 );
         
        botones.setIcon(icon);
       texto = new JLabel("Nuevo");
       texto.setForeground(Color.red);
       otros.add(botones);
       otros.add(texto);
	    
	   panelBotones.add(otros);
       //boton nuevo

       
       otros = new JPanel();
       otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));

       botones = new JButton();


       
       imagen = new ImageIcon("img/guardar.png");
       icon = new ImageIcon(
                imagen.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)
                );
        
       botones.setIcon(icon);
      texto = new JLabel("guardar");
      texto.setForeground(Color.red);
      otros.add(botones);
      otros.add(texto);
       
      panelBotones.add(otros);

      //boton nuevo

      
      otros = new JPanel();
      otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));

      botones = new JButton();


      
      imagen = new ImageIcon("img/edita.png");
      icon = new ImageIcon(
               imagen.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)
               );
       
      botones.setIcon(icon);
     texto = new JLabel("Editar");
     texto.setForeground(Color.red);
     otros.add(botones);
     otros.add(texto);
      
     panelBotones.add(otros);
     
     //boton nuevo

     
     otros = new JPanel();
     otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));

     botones = new JButton();


     
     imagen = new ImageIcon("img/eliminar.png");
     icon = new ImageIcon(
              imagen.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)
              );
      
     botones.setIcon(icon);
    texto = new JLabel("eliminar");
    texto.setForeground(Color.red);
    otros.add(botones);
    otros.add(texto);
     
    panelBotones.add(otros);
    
    //boton nuevo

    
    otros = new JPanel();
    otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));

    botones = new JButton();


    
    imagen = new ImageIcon("img/informe.png");
    icon = new ImageIcon(
             imagen.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)
             );
     
    botones.setIcon(icon);
   texto = new JLabel("eliminar");
   texto.setForeground(Color.red);
   otros.add(botones);
   otros.add(texto);
    
   panelBotones.add(otros);
	   
   //boton nuevo

   
   otros = new JPanel();
   otros.setLayout(new BoxLayout(otros,BoxLayout.Y_AXIS));

   botones = new JButton();


   
   imagen = new ImageIcon("img/cancelar.png");
   icon = new ImageIcon(
            imagen.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)
            );
    
   botones.setIcon(icon);
  texto = new JLabel("cancelar");
  texto.setForeground(Color.red);
  otros.add(botones);
  otros.add(texto);
   
  panelBotones.add(otros);
      
	   


	    
	    
	    
	}
	void tabla() {
	    tabla = new JPanel();
	    tabla.setLayout(new BoxLayout(tabla,BoxLayout.Y_AXIS));
	    tabla.setBorder(new EmptyBorder(10, 10, 10, 10));
	    
	    Vector<String> fila = new Vector<String>();
	    fila.addElement("   ");
	    fila.addElement("  ");
	    fila.addElement("  ");
	    fila.addElement("  ");
       Vector<String> fila2 = new Vector<String>();
       fila2.addElement("  ");
       fila2.addElement("  ");
       fila2.addElement("  ");
       
       Vector<String> fila3 = new Vector<String>();
       fila3.addElement("   ");
       fila3.addElement("  ");
       fila3.addElement("  ");
       fila3.addElement("  ");
      Vector<String> fila4 = new Vector<String>();
      fila4.addElement("  ");
      fila4.addElement("  ");
      fila4.addElement("  ");
      Vector<String> fila5 = new Vector<String>();
      fila5.addElement("  ");
      fila5.addElement("  ");
      fila5.addElement("  ");
      
      
       
       Vector<Vector> filatotal = new Vector<Vector>();
       
       filatotal.addElement(fila);
       filatotal.addElement(fila2);
       filatotal.addElement(fila3);
       filatotal.addElement(fila4);
       filatotal.addElement(fila5);
       
       Vector<String> colunm = new  Vector<String>();
       colunm.addElement("ID");
       colunm.addElement("Descripcion");
       colunm.addElement("Direccion");
       colunm.addElement("Telefono");
       colunm.addElement("RUC");
       
       JTable tablas = new JTable(filatotal,colunm);
       JScrollPane sp = new JScrollPane(tablas);
       
       tabla.add(sp);
       
       
       
	    
	    
	}
	
	void crearventana(){

		ventana.setTitle("ejemplo form");
		ventana.setVisible(true);
		ventana.setSize(600,600);
		ventana.setLayout(new BoxLayout(ventana.getContentPane(),BoxLayout.Y_AXIS));
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		
		
     panelPrincipal = new JPanel();
	 panelPrincipal.setLayout(new BoxLayout(panelPrincipal,BoxLayout.Y_AXIS));;
	
	 panelPrincipal.add(panelTitulo);
	 panelPrincipal.add(panelDatos);
	 panelPrincipal.add(panelBotones);
	 panelPrincipal.add(tabla);

	
	
		ventana.add(panelPrincipal);	
		
		
	}
	
	
	ventana2(){
		panelTitulo();
		panelDatos();
		panelBotones();
		tabla();
		
		
		
		crearventana();
	
	}
}


