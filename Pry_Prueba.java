/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_prueba;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Pry_Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
                Productos obj1;
                obj1=new Productos();
                Tipo_Producto f1=new Tipo_Producto("Lacteo");
                Producto g1 =new Producto("12", "Leche", 1, f1);
                Tipo_Producto f2=new Tipo_Producto("Vegetal");
                Producto g2=new Producto("13", "Tomate", 3, f2);
                obj1.insertarProducto(g1);
                obj1.insertarProducto(g2);
                obj1.imprimirProducto();
                obj1.elminarProducto(g2);
                System.out.println("");
                System.out.println("Eliminacion de Producto");
                obj1.imprimirProducto();
                
                System.out.println("");
                System.out.println("Bucar Producto");
                obj1.buscarProducto("13");
            System.out.println("");
            
            System.out.println("Seleccione lo que desea modificar:");
                int opcion=teclado.nextInt();
                switch(opcion){
                    case 1:
                         System.out.println("Ingrese el nombre:");
                         String nom=teclado.next();
                         obj1.modificarProducto(1,"Mantequilla",nom);
                         obj1.imprimirProducto();
                    break;
                
                }
    }
}
        