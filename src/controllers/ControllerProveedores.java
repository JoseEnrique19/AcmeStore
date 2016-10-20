package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelProveedores;
import view.ViewProveedores;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import javax.swing.JOptionPane;

public class ControllerProveedores implements ActionListener{
    private ModelProveedores modelProveedores;
    private ViewProveedores viewProveedores;
    private Connection conexion;     
    private Statement st;     
    private ResultSet rs; 

    public ControllerProveedores(ModelProveedores modelProveedores, ViewProveedores viewProveedores) {
        this.modelProveedores=modelProveedores;
        this.viewProveedores=viewProveedores;
        
        
        this.viewProveedores.jb_agregar.addActionListener(this);
        this.viewProveedores.jb_editar.addActionListener(this);
        this.viewProveedores.jb_eliminar.addActionListener(this);
        this.viewProveedores.jb_buscar.addActionListener(this);
        
    }
    
    public void Conectar(){
         try{ 
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/acme_store","root","1234");                     
            st=conexion.createStatement(); 

            rs=st.executeQuery("Select * from proveedores");             

            rs.next(); 
                        
            this.viewProveedores.jtf_nombre.setText(rs.getString("nombre"));             
            this.viewProveedores.jtf_RFC.setText(rs.getString("RFC"));
            this.viewProveedores.jtf_calle.setText(rs.getString("calle")); 
            this.viewProveedores.jtf_numero.setText(rs.getString("No")); 
            this.viewProveedores.jtf_colonia.setText(rs.getString("colonia")); 
            this.viewProveedores.jtf_ciudad.setText(rs.getString("ciudad")); 
            this.viewProveedores.jtf_estado.setText(rs.getString("estado")); 
            this.viewProveedores.jtf_contacto.setText(rs.getString("nombre_contacto")); 
            this.viewProveedores.jtf_telefono.setText(rs.getString("telefono")); 
            this.viewProveedores.jtf_eMail.setText(rs.getString("e_mail")); 
        }catch(SQLException err){ 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        } 
    }
    
    private void siguienteRegistro(){
    try{
        if(rs.next()==false) {
            rs.next();
            this.viewProveedores.jtf_nombre.setText(rs.getString("nombre"));             
            this.viewProveedores.jtf_RFC.setText(rs.getString("RFC"));
            this.viewProveedores.jtf_calle.setText(rs.getString("calle")); 
            this.viewProveedores.jtf_numero.setText(rs.getString("No")); 
            this.viewProveedores.jtf_colonia.setText(rs.getString("colonia")); 
            this.viewProveedores.jtf_ciudad.setText(rs.getString("ciudad")); 
            this.viewProveedores.jtf_estado.setText(rs.getString("estado")); 
            this.viewProveedores.jtf_contacto.setText(rs.getString("nombre_contacto")); 
            this.viewProveedores.jtf_telefono.setText(rs.getString("telefono")); 
            this.viewProveedores.jtf_eMail.setText(rs.getString("e_mail"));
        }
    }
    catch(Exception err) {
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
    }
}
    
    private void anteriorRegistro(){
    try{
        if(rs.previous()==false) {
            rs.next();
            this.viewProveedores.jtf_nombre.setText(rs.getString("nombre"));             
            this.viewProveedores.jtf_RFC.setText(rs.getString("RFC"));
            this.viewProveedores.jtf_calle.setText(rs.getString("calle")); 
            this.viewProveedores.jtf_numero.setText(rs.getString("No")); 
            this.viewProveedores.jtf_colonia.setText(rs.getString("colonia")); 
            this.viewProveedores.jtf_ciudad.setText(rs.getString("ciudad")); 
            this.viewProveedores.jtf_estado.setText(rs.getString("estado")); 
            this.viewProveedores.jtf_contacto.setText(rs.getString("nombre_contacto")); 
            this.viewProveedores.jtf_telefono.setText(rs.getString("telefono")); 
            this.viewProveedores.jtf_eMail.setText(rs.getString("e_mail")); 
        }
    }
    catch(Exception err) {
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
    }
}
    
    private void primeroRegistro(){
    try{
        if(rs.first()==false) {
            rs.next();
            this.viewProveedores.jtf_nombre.setText(rs.getString("nombre"));             
            this.viewProveedores.jtf_RFC.setText(rs.getString("RFC"));
            this.viewProveedores.jtf_calle.setText(rs.getString("calle")); 
            this.viewProveedores.jtf_numero.setText(rs.getString("No")); 
            this.viewProveedores.jtf_colonia.setText(rs.getString("colonia")); 
            this.viewProveedores.jtf_ciudad.setText(rs.getString("ciudad")); 
            this.viewProveedores.jtf_estado.setText(rs.getString("estado")); 
            this.viewProveedores.jtf_contacto.setText(rs.getString("nombre_contacto")); 
            this.viewProveedores.jtf_telefono.setText(rs.getString("telefono")); 
            this.viewProveedores.jtf_eMail.setText(rs.getString("e_mail")); 
        }
    }
    catch(Exception err) {
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
    }
}
    
    private void ultimoRegistro(){
    try{
        if(rs.last()==false) {
            rs.next();
            this.viewProveedores.jtf_nombre.setText(rs.getString("nombre"));             
            this.viewProveedores.jtf_RFC.setText(rs.getString("RFC"));
            this.viewProveedores.jtf_calle.setText(rs.getString("calle")); 
            this.viewProveedores.jtf_numero.setText(rs.getString("No")); 
            this.viewProveedores.jtf_colonia.setText(rs.getString("colonia")); 
            this.viewProveedores.jtf_ciudad.setText(rs.getString("ciudad")); 
            this.viewProveedores.jtf_estado.setText(rs.getString("estado")); 
            this.viewProveedores.jtf_contacto.setText(rs.getString("nombre_contacto")); 
            this.viewProveedores.jtf_telefono.setText(rs.getString("telefono")); 
            this.viewProveedores.jtf_eMail.setText(rs.getString("e_mail")); 
        }
    }
    catch(Exception err) {
        JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
    }
}
    
    private void guadarRegistro() {        
       try{
            String nombre=this.viewProveedores.jtf_nombre.getText();
            String RFC=this.viewProveedores.jtf_RFC.getText();
            String calle=this.viewProveedores.jtf_calle.getText();
            String numero=this.viewProveedores.jtf_numero.getText();
            String colonia=this.viewProveedores.jtf_colonia.getText();
            String ciudad=this.viewProveedores.jtf_ciudad.getText();
            String estado=this.viewProveedores.jtf_estado.getText();
            String contacto=this.viewProveedores.jtf_contacto.getText();
            String telefono=this.viewProveedores.jtf_telefono.getText();
            String e_mail=this.viewProveedores.jtf_eMail.getText();
             

            st.executeUpdate("Insert into proveedores (nombre,RFC,calle,No,colonia,ciudad,estado,nombre_contacto,telefono,e_mail)"+ 
                    ""+" values ('"+ nombre +"','"+RFC+"','"+calle+"','"+ numero +"','"+ colonia +"','"+ ciudad +"','"+ estado +"','"+ contacto +"','"+ telefono +"','"+ e_mail +"');"); 

            this.primeroRegistro();

        } catch(SQLException err)         { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        } 

    } 

    /* private void borrarRegistro(){
        try{ 
           st.executeUpdate("delete from tabla1 where id_tabla1="+this.jtf_id_tabla1.getText());

           this.primeroRegistro();

       } catch(SQLException err){ 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        } 

    }*/
    
    public void init_view(){
        this.viewProveedores.setLocation(null);
        this.viewProveedores.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.viewProveedores.jb_agregar){
            guadarRegistro();
        }else if (e.getSource()==this.viewProveedores.jb_ultimo){
            ultimoRegistro();
        }else if (e.getSource()==this.viewProveedores.jb_anterior){
            anteriorRegistro();
        }else if (e.getSource()==this.viewProveedores.jb_siguiente){
            siguienteRegistro();
        }else if (e.getSource()==this.viewProveedores.jb_ultimo){
            ultimoRegistro();
        }
    }
}