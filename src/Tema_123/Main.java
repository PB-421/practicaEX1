package Tema_123;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> BT = new ArrayList<>();
        Persona p1 = new Persona("Pablo",19,"Guadalajara");
        Estudiante p2 = new Estudiante("Nobita",14,"Japon",14560);
        BT.add(p1);
        BT.add(p2);
        for(int i = 0;i<BT.size();i++){
            int aux = i+1;
            System.out.print("Persona "+ aux );
            BT.get(i).imprimirInfo();
        }
    }
}
