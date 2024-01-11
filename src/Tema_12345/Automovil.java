package Tema_12345;

public class Automovil extends Vehiculo{
    public int puertas;

    public Automovil(String _marca,String _modelo, int _annoF,double _precio, int _puertas){
        super(_marca,_modelo,_annoF,_precio);//llamo al constructor de vehiculo
        puertas = _puertas;
    }

    @Override
    public void imprimirInfo(){
        System.out.println("Informacion de vehiculo");
        super.imprimirInfo();//llamo a imprimir info de vehiculo
        System.out.println("Numero de puertas: "+puertas);
    }
}
