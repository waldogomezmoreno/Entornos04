/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entornos4;

/**
 * 
 * @author Waldo Gómez Moreno
 */

public class Main { 

    public static void main(String[] args) {

        eCesta cesta;

        cesta = new eCesta("Apellidos del alumno",100, "dni del alumno", 10);

        NuevoMetodo(cesta); 

    }

    public static void NuevoMetodo(eCesta cesta) {
        try
            
        {
            
            cesta.comprar(50);

        } catch (Exception e)

        {

            System.out.println("No se puede pagar  ");

        }

        try

        {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e)

        {

            System.out.println("Error al recargar");

        }

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  "+ bonoactual );
        
        try {
                    System.out.println(" Modificación 1");
                     cesta.ActualizarBono(-50);
        } catch (Exception e) {
                           System.out.print("Fallo…….");
        }
    }
    
}
