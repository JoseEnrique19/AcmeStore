package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;
import javax.swing.JOptionPane;
import models.*;

public class ControllerMain implements ActionListener {
    ViewMain viewMain;
    ViewProveedores viewProveedores;
    ModelMain modelMain;
    String nl= System.getProperty("line.separator");
    
    public ControllerMain (ViewMain viewMain, ViewProveedores viewProveedores, ModelMain modelMain) {
        this.viewMain = viewMain;
        this.viewProveedores = viewProveedores;
        this.modelMain = modelMain;
        this.viewMain.jmiProveedores.addActionListener(this);
        initView();
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewMain.jmiProveedores){
            //msgVolumenes();
            Proveedores();
        }
    }
    
    private void Proveedores(){
        this.viewMain.setContentPane(viewProveedores);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    
    
    /*public void msgVolumenes(){
        JOptionPane.showMessageDialog(viewProveedores,"Instrucciones"
                +nl+"1.- Eliga la figura"
                +nl+"2.- Inserte los valores"
                +nl+"3.- Presione resultado");
    }
    */
    private void initView(){
        this.viewMain.setTitle("ACME-Store");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
        JOptionPane.showMessageDialog(null,"Instrucciones"
                +nl+"1.- Desplieque el menu de arriba a la Izquierda"
                +nl+"2.- Seleccione una opcion");
    }
    
}
