package Tema1;

public class Libro {
    private String nombre="Sin nombre";

    private String autor="Sin autor";

    private int paginas=0;

    private int anno=0;

    Libro(String _nombre,String _autor,int _paginas,int _anno){
        nombre=_nombre;
        autor=_autor;
        paginas=_paginas;
        anno=_anno;
    }

    Libro(){}

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String _nombre){
        nombre=_nombre;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String _autor){
        autor=_autor;
    }

    public int getPaginas(){
        return paginas;
    }

    public void setPaginas(int _paginas){
        paginas=_paginas;
    }

    public int getAnno(){
        return anno;
    }

    public void  setAnno(int _anno){
        anno=_anno;
    }

    public void esAntiguo(){
        if(anno<2000){
            System.out.println("El libro "+nombre+" es un libro antiguo porque se publico antes del 2000");
        }
        else{
            System.out.println("El libro "+nombre+" no es un libro antiguo");
        }
    }

}
