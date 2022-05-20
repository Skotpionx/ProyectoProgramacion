package ProyectoTema5;

import ProyectoTema5.Juego.ChoiceHandler;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
-------------------------

Creado por @Juanmi

-------------------------
*/


public class VentanaMain extends Resolucion{
     /*
    
    ---------------------------------
    ¿Qué es todo esto?
    Una clase la cuál va a simplificarnos mucho el uso de ventanas,
    Cada vez que queramos una simplemente tenemos que llamar al método.
    Más conveniente que crearlas arrastrando, ( y a mi me gusta más , soy más
    de hacer código que de tocar botones.)
    
    Nos traemos en las propiedades todo lo necesario para hacer 
    una ventana, dos paneles, etiquetas y el botón para la pantalla principal
    
    Luego debemos hacer el resto de pantallas del juego.
    Todas las demás variables añadidas no estaban contempladas en un inicio
    Las fui añadiendo por si me eran necesarias.
    El toolkit para calcular la resolucion de la pantalla ( movido a otra clase al final)ç
    
    Como solo voy a usar yo las variables les dejé el modificador por defecto,
    para no tener ningún problema si necesitaba cualquier cosa de otra clase .
    ---------------------------------
    */
    JFrame window;
    JPanel pnlTextName, pnlbtnStart;
    JLabel lblTexto;
    JButton btnstart;
    String title;
    Color color;
    Font fuentetitulo = new Font("Times New Roman",Font.PLAIN,80);
    Font fuentenormal = new Font("Times New Roman", Font.PLAIN, 45);
    public void crearVentana(ChoiceHandler cHandler) {
        
        // INICIO DE LA VENTANA // 
        
        // Creamos la ventana en la que se va a ejecutar el juego
        // Y pasamos el título de la ventana, lo hacemos de esta forma
        // Ya que así para el resto de veces que se pueda usar 
        // No es necesario reescribir todo a mano, lo tenemos en un metodo.
        setTitle("Las Aventuras de Paquito");
        
        window = new JFrame(title);
        
        /* Vamos a calcular el tamaño de la ventana, para esto me voy a ayudar
         de un ejercicio que teníamos hecho en clase que calculaba
         la X y la Y de tu monitor. :D 

        Spoiler nunca encontré el ejercicio y me tocó hacerlo a mi.
        */  
        
        window.setSize(getResolucionX(),getResolucionY());
        
        // Le decimos cuando se va a cerrar esta ventana
        // Y escogemos la opción que ya nos dice que es para aplicaciones.
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        
        // FIN DE LA VENTANA // 
        
        // PANTALLA DE TÍTULO //
        
        pnlTextName = new JPanel();
        pnlTextName.setBounds((getResolucionX()/2)-260, 120, 450, 125);
        pnlTextName.setBackground(Color.black);
        lblTexto = new JLabel(" Infernus ");
        lblTexto.setForeground(Color.orange);
        lblTexto.setFont(fuentetitulo);
        pnlTextName.add(lblTexto);
        
        // El metodo SetBounds, primer parametro altura en X, segundo altura en Y , tercero anchura del panel , y cuarto altura del panel
        // En una pantalla mas pequeña esto no quedaría bien, habría que hacerlo responsive como en html.
        // ¿Cómo se puede conseguir? 
        
        /*
        int posx,posy, anchura,altura
        if(getResolucion() > X ) {  > Esto significa que para cada resolucion (1920*1080, 720*1080, etc estableceriamos un valor diferente 
                                      y luego simplemente le pasariamos al constructor esos valores
                                      Como no había que complicarse mucho la vida no lo he hecho pero se podría hacer
        posx = X;
        posy = Y;                   Cada letra representa un valor númerico que estableceríamos
        anchura = A;
        altura = ab;+ 
        }
        */
      
        pnlbtnStart = new JPanel();
        pnlbtnStart.setBounds((getResolucionX()/2)-260,750,450,125);
        pnlbtnStart.setBackground(Color.black);
        btnstart = new JButton();
        btnstart.setBackground(Color.black);
        btnstart.setForeground(Color.white);
        btnstart.setFont(fuentenormal);
        btnstart.setFocusPainted(false);
        btnstart.addActionListener(cHandler);
        btnstart.setActionCommand("HOLA");
        pnlbtnStart.add(btnstart);
        
        window.add(pnlTextName);
        window.add(pnlbtnStart);

        
        // GAME SCREEN 
        VentanaInteractuable ventana = new VentanaInteractuable();
        JPanel panelmain = ventana.crearMainTextPanel();
        window.add(panelmain);
        panelmain.add(ventana.crearTextArea());
        JPanel panelSuperior = ventana.crearPanelGridOpciones(250,350,300,150,4, 1);

        
        JButton boton1 = ventana.crearBoton("Opcion 1");
        boton1.addActionListener(cHandler);
        boton1.setActionCommand("Choice 1");
        panelSuperior.add(boton1);
        JButton boton2 = ventana.crearBoton("Opcion 2");
        boton2.addActionListener(cHandler);
        boton2.setActionCommand("Choice 2");
        panelSuperior.add(boton2);
        JButton boton3 = ventana.crearBoton("Opcion 3");
        boton3.addActionListener(cHandler);
        boton3.setActionCommand("Choice 3");
        panelSuperior.add(boton3);
        JButton boton4 = ventana.crearBoton("Opcion 4");
        boton4.addActionListener(cHandler);
        boton4.setActionCommand("Choice 4");
        panelSuperior.add(boton4);
        window.add(panelSuperior);
        
        
        
        JPanel playerPanel = ventana.crearPanelGridOpciones(100, 15, 600, 50, 1, 4);
        window.add(playerPanel);
        playerPanel.add(ventana.crearJLabel("HP"));
        playerPanel.add(ventana.crearJLabel(""));
        playerPanel.add(ventana.crearJLabel("Weapon"));
        playerPanel.add(ventana.crearJLabel(""));
        
        
        
        
        
        
    }
    
    
    
    
    
    // Por añadir algún método a la ventana aunque no se hasta qué punto es útil.
    public void setTitle(String t){
        title = t;
    }
    @Override
    public Dimension getResolucion(){
        Toolkit t= Toolkit.getDefaultToolkit();
        Dimension d= t.getScreenSize();
        return d;
    }
    
    @Override
     public int getResolucionX() {
        return getResolucion().width;
    }

     @Override
     public int getResolucionY() {
       return getResolucion().height; 
    }
}


