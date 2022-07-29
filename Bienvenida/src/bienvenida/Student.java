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
    
    private int     idStudent;
    private String  name;
    private String  carrer;
    private String     age;
    private String  gender;
    
    private static int countStudent;
    
    private Student(){
        this.idStudent = ++Student.countStudent;
    }
    
    public Student(String name, String gender, String age, String carrer){
        this();
        this.name   = name;
        this.gender = gender;
        this.age    = age;
        this.carrer = carrer;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return "Student{" + "ID:" + idStudent + ", Nombre:" + name + ", Genero: " + gender + ", Edad: " + age + ", Carrera: " + carrer +'}';
    }
    
    
}
