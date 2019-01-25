/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_prueba;

/**
 *
 * @author HP
 */
public class Producto {
    // Atributos
    private String codigo;
    private String nombre;
    private double precio;
    Tipo_Producto p;

    public Producto(String codigo, String nombre, double precio, Tipo_Producto p) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.p = p;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Tipo_Producto getP() {
        return p;
    }

    public void setP(Tipo_Producto p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", p=" + p + '}';
    }
    
    
}
