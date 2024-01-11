package Tema_123;

import java.util.ArrayList;

public class Persona implements Imprimible {

    private String name;
    private int age;
    private String adress;

    public Persona(String _name,int _age,String _adress){
        name = _name;
        age = _age;
        adress = _adress;
    }

    public void setName(String _name){
        name = _name;
    }

    public void setAge(int _age){
        age = _age;
    }

    public void setAdress(String _adress){
        adress = _adress;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAdress(){
        return adress;
    }

    @Override
    public void imprimirInfo(){
        System.out.println("  No estudiante");
        System.out.println("Nombre: "+getName());
        System.out.println("Edad: "+getAge());
        System.out.println("Dirección: "+getAdress());
        System.out.println("\n");
    }
}
