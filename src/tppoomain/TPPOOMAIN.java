/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tppoomain;

/**
 *
 * @author manu7
 */
public class TPPOOMAIN {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Empleado empleado1 = new Empleado("Juan", "Seguridad");
    Empleado empleado2 = new Empleado(3, "Lucas","Programador", 2500);

    System.out.println(empleado1);
    System.out.println(empleado2);
    
    System.out.println(Empleado.mostrarTotalEmpleados());
    
    empleado1.actualizarSalario(2000);
    System.out.println(empleado1);
    empleado2.actualizarSalario(10.0);
    System.out.println(empleado2);
    
  }
}
