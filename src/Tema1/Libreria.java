package Tema1;

import java.util.ArrayList;

public class Libreria {

    ArrayList<Libro> inventario = new ArrayList<>();

    public void leerAtributosDeStock(){
        for(int i = 0;i<inventario.size();i++){
            int aux = i+1;
            System.out.println("Libro "+aux);
            System.out.println();
            System.out.println("Nombre del libro: "+inventario.get(i).getNombre());
            System.out.println("Autor: "+inventario.get(i).getAutor());
            System.out.println("Paginas: "+inventario.get(i).getPaginas());
            System.out.println("Año de publicación: "+inventario.get(i).getAnno());
            inventario.get(i).esAntiguo();
            System.out.println();
        }
    }

    public void addToInventory(Libro libro1){
        inventario.add(libro1);
        System.out.println("Libro añadido al inventario");

    }

    public static void main(String[] args) {
        Libro porsche= new Libro("La historia del Porsche 911","Alex Fisher",205,2021);
        Libro Lotus= new Libro("El olvidado Lotus Omega","Jeremy Clarkson",300,1995);
        Libreria libreria= new Libreria();
        libreria.addToInventory(porsche);
        libreria.addToInventory(Lotus);
        System.out.println();
        libreria.leerAtributosDeStock();
    }
}
