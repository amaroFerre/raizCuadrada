/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raizCuadrada;

// Importo el paquete java.util.* para poder utilizar la clase Scanner
import java.util.*;

/**
 *
 * @author Amarico
 */
public class RaizCuadrada {
    
    
   // Creo variable de tipo double
    
    private double numero;
    
    private double resultado;
    
    // Creo el objeto entrada de la Clase Scanner
    
    Scanner entrada = new Scanner(System.in);
    
    // Creo el método ejecutaPrograma
    public void ejecutaPrograma(){
        
        
        
        imprimeResultado();
    }
    
    public void imprimeResultado(){
        
        System.out.println("Introduce un número positivo:");
        
        numero = entrada.nextDouble();
        
       if (numero >= 0){
           
           resultado = (Math.sqrt(numero));
           
           System.out.println("La raíz cuadrada de: " + numero + " es " + resultado);
       }else
           
            System.out.println("El número " + numero + " no es un número positivo");
        
        
    }
    
    
}
