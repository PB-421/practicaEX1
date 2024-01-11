package Tema_123;

public class Estudiante extends Persona{
    private int numeroEstudiante;

    public Estudiante(String _name,int _age,String _adress,int _numEst){
        super(_name,_age,_adress);
        numeroEstudiante = _numEst;
    }


    public void setNumeroEstudiante(int numEst){
        numeroEstudiante = numEst;
    }

    public int getNumeroEstudiante(){
        return numeroEstudiante;
    }

    @Override
    public void imprimirInfo(){
        System.out.println("  Estudiante");
        System.out.println("Nombre: "+getName());
        System.out.println("Edad: "+getAge());
        System.out.println("Dirección: "+getAdress());
        System.out.println("Numero de estudiante: "+getNumeroEstudiante());
        System.out.println("\n");
    }
}
