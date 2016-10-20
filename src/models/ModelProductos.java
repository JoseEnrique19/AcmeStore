/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author megam
 */
public class ModelProductos {
    private DBConnection conection = new DBConnection(3306,"localhost", "acme", "root", "");
    
    private int id_producto;
    private String producto;
    private String descripcion;
    private int precio_compra;
    private int precio_venta;
    private int existencias;

    /**
     * @return the id_producto
     */
    public int getId_producto() {
        return id_producto;
    }

    /**
     * @param id_producto the id_producto to set
     */
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio_compra
     */
    public int getPrecio_compra() {
        return precio_compra;
    }

    /**
     * @param precio_compra the precio_compra to set
     */
    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    /**
     * @return the precio_venta
     */
    public int getPrecio_venta() {
        return precio_venta;
    }

    /**
     * @param precio_venta the precio_venta to set
     */
    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    /**
     * @return the existencias
     */
    public int getExistencias() {
        return existencias;
    }

    /**
     * @param existencias the existencias to set
     */
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    public void moveNext(){
        conection.moveNext();
        setValues();
    }
    
    public void movePrevious(){
        conection.movePrevious();
        setValues();
    }
    
    public void moveFirst(){
        conection.moveFirst();
        setValues();
    }
    
    public void moveLast(){
        conection.moveLast();
        setValues();
    }
    
    public void initValues(){
        conection.executeQuery("SELECT idContacto, nombre, telefono, email FROM contactos;");
        conection.moveNext();
        setValues();
    }
    public void setValues(){
        this.id_producto = conection.getInteger("ID_Producto");
        this.producto= conection.getString("Nombre");
        this.descripcion = conection.getString("Descripcion");
        this.precio_compra = conection.getInteger("Precio (Compra)");
        this.precio_venta = conection.getInteger("Precio (Venta)");
        this.existencias = conection.getInteger("Existencias");
    }
}
