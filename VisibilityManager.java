/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoTema5;

/**
 *
 * @author skotp
 */
public class VisibilityManager {
    
    VentanaInteractuable ui;
    
    public VisibilityManager(VentanaInteractuable userInterface){
        
        ui = userInterface;
        
    }
    
    public void showTitleScreen(){
        
        
        // Show the title screen
        ui.pnlTextName.setVisible(true);
        ui.btnstart.setVisible(true);
        
        //Hide the game screen
        
        ui.mainTextPanel.setVisible(false);
        ui.choiceButtonPanel.setVisible(false);
        ui.playerPanel.setVisible(false);
        
    }
    
    public void titleToTown(){
        // Hide the title screen
        ui.pnlTextName.setVisible(false);
        ui.btnstart.setVisible(false);
        
        //Hide the game screen
        
        ui.mainTextPanel.setVisible(true);
        ui.choiceButtonPanel.setVisible(true);
        ui.playerPanel.setVisible(true);
    }
    
}
