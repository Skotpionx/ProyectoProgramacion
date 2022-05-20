/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoTema5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
----------------------------
 Developed by @Juanmi
----------------------------

 */


public class Juego {
    
    ChoiceHandler cHandler = new ChoiceHandler();
    VentanaInteractuable ventana = new VentanaInteractuable();
    VisibilityManager vm = new VisibilityManager(ventana);
    
    public static void main(String[] args){
        new Juego();
    }
    public Juego(){
        
        ventana.crearVentana(cHandler);
        vm.showTitleScreen();
    }
    
    public class ChoiceHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String yourChoice= e.getActionCommand();
            System.out.println(e.getActionCommand());
        
        switch (yourChoice){
            case "start": vm.showTitleScreen();; break;
            case "Choice 1": break;
            case "Choice 2": break;
            case "Choice 3": break;
            case "Choice 4": break;
        }
        }
        
    }
    
}
