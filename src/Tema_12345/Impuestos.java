package Tema_12345;

public class Impuestos {//singleton
    private static Impuestos instance;

    private Impuestos(){};

    public double calcularIm(double _precio){
        return _precio*(0.02);
    }

    public static Impuestos getInstance(){
        if(instance == null){
            instance = new Impuestos();
        }
        return instance;
    }
}
