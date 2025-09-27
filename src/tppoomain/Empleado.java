/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tppoomain;

/**
 *
 * @author manu7
 */
public class Empleado {
  
  private int id;
  private String nombre;
  private String puesto;
  private double salario;
  static int totalEmpleados = 0;

  public Empleado(int id, String nombre, String puesto, double salario) {
    sumarEmpleados();
    this.id = id;
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = salario;
  }

  public Empleado(String nombre, String puesto) {
    sumarEmpleados();
    this.nombre = nombre;
    this.puesto = puesto;
    this.salario = 1000;
    this.id = totalEmpleados;
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getPuesto() {
    return puesto;
  }

  public double getSalario() {
    return salario;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }
 
  public static int sumarEmpleados(){
    totalEmpleados += 1;
    return totalEmpleados;
  };
  
  public void actualizarSalario(int cantFijaAumento){
    this.salario += cantFijaAumento;
  };
  
  public void actualizarSalario(double porcentajeAumento){
    this.salario += this.salario * porcentajeAumento / 100;
  };
  
  public static int mostrarTotalEmpleados(){
    return totalEmpleados;
  };
  
  @Override
  public String toString() {
    return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
  }
  
  
  
}
