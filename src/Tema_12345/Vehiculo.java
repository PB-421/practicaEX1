package Tema_12345;

public class Vehiculo implements Imprimible {
    public String Marca;
    public String Modelo;
    public int annoFab;
    public double precio;

    protected Vehiculo(String _marca,String _modelo, int _annoF,double _precio){
        Marca = _marca;
        Modelo = _modelo;
        annoFab = _annoF;
        precio = _precio;
    }

    @Override
    public void imprimirInfo(){
        System.out.println("Marca: "+Marca);
        System.out.println("Modelo: "+Modelo);
        System.out.println("Año de fabricacion: "+annoFab);
        System.out.println("Precio: "+precio);
    }
}
