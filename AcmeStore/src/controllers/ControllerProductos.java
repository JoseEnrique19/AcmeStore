/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelProductos;
import view.ViewProductos;
import view.ViewAgregar;
import javax.swing.JOptionPane;
import libreria.Libreria;

/**
 *
 * @author megam
 */
public class ControllerProductos implements ActionListener{
    ModelProductos modelProductos = new ModelProductos();
    ViewProductos viewProductos = new ViewProductos();
    ViewAgregar viewAgregar = new ViewAgregar();
    Libreria libreria = new Libreria();
    
    public ControllerProductos(ModelProductos modelProductos, ViewProductos viewProductos){
        this.viewProductos = viewProductos;
        this.modelProductos = modelProductos;
        
        this.viewProductos.jbtn_inicio.addActionListener(this);
        this.viewProductos.jbtn_retroceder.addActionListener(this);
        this.viewProductos.jbtn_avanzar.addActionListener(this);
        this.viewProductos.jbtn_final.addActionListener(this);
        this.viewProductos.jbtn_agregar.addActionListener(this);
        this.viewProductos.jbtn_eliminar.addActionListener(this);
        this.viewProductos.jbtn_editar.addActionListener(this);
        this.viewProductos.jbtn_buscar.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewProductos.jbtn_inicio){
           accionInicio();
        }
       else if(e.getSource()==viewProductos.jbtn_retroceder){
           accionRetroceder();
       }
       else if(e.getSource()==viewProductos.jbtn_avanzar){
           accionAvanzar();
       }
       else if(e.getSource()==viewProductos.jbtn_final){
           accionFinal();
       }
       else if(e.getSource()==viewProductos.jbtn_agregar){
           JOptionPane.showMessageDialog(viewProductos, viewAgregar);
           if(e.getSource()==viewAgregar.jbtn_Insertar){
           accionAgregar();
           }
       }
    }
    
    public void accionAgregar(){
        modelProductos.setProducto(viewAgregar.jtf_nombre.getText());
        modelProductos.setDescripcion(viewAgregar.jta_descripcion.getText());
        modelProductos.setPrecio_compra(libreria.stringToInt(viewAgregar.jtf_compra.getText()));
        modelProductos.setPrecio_venta(libreria.stringToInt(viewAgregar.jtf_venta.getText()));
        modelProductos.setExistencias(libreria.stringToInt(viewAgregar.jtf_cantidad.getText()));
    }
    
    public void accionInicio(){
        modelProductos.moveFirst();
        showValues();
    }
    
    public void accionRetroceder(){
        modelProductos.movePrevious();
        showValues();
    }
    
    public void accionAvanzar(){
        modelProductos.moveNext();
        showValues();
    }
    
    public void accionFinal(){
        modelProductos.moveLast();
        showValues();
    }
    
    private void showValues(){
        
    }
}
