/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bienvenida;

/**
 *
 * @author crubiano
 */
public class Student {
    
    private int idStudent;
    private String name;
    private static int countStudent;
    
    private Student(){
        this.idStudent = ++Student.countStudent;
    }
    
    public Student(String name){
        this();
        this.name = name;
    }
    
    public int getidStudent() {
        return idStudent;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }
    
       @Override
    public String toString() {
        return "Student{" + "idStudent=" + idStudent + ", nombre=" + name +'}';
    }
    
    
}
