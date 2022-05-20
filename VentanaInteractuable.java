/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoTema5;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author skotp
 */
public class VentanaInteractuable extends VentanaMain{
    
    
    JPanel mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel hpLabel, hpNumberLabel, weaponLabel, weaponnameLabel;
    JButton choice1, choice2,choice3,choice4;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
    JTextArea mainTextArea;
    
    public JPanel crearMainTextPanel(){
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        return mainTextPanel;
    }
    
    public JTextArea crearTextArea(){
        mainTextArea = new JTextArea("Aquí va el lore de la historia");
        mainTextArea.setBounds(100,100,650,250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        
        return mainTextArea;
    }public JPanel crearPanelGridOpciones(int XA,int YA,int XB, int YB, int row, int column){
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(XA,YA,XB,YB);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(column,row));
        return choiceButtonPanel;
    }
     public JButton crearBoton(String s){
        JButton a= new JButton(s);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
        a.setFont(normalFont);
        a.setFocusPainted(false);
        return a;
    }
   public JLabel crearJLabel(String s) {
        hpLabel = new JLabel(s);
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        return hpLabel;
    }
   
   
}
