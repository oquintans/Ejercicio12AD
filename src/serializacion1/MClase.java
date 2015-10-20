/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion1;

import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class MClase implements Serializable {

    private String nombre;
    //Cambiamos la variable num1 a transient
    private transient int num1;
    private double num2;

    public MClase() {
    }

    public MClase(String nombre, int num1, double num2) {
        this.nombre = nombre;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "MClase{" + "nombre=" + nombre + ", num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    

}
