package Tema_12345;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;//cambios en un jTextfield
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interfaz {

    public static ArrayList<Automovil> crearAuto(JPanel panel1,ArrayList<Automovil> stock){
        panel1.removeAll();
        JLabel marca1 = new JLabel("Marca");
        marca1.setBounds(90, 80, 150, 40);//Al ser el panel null, tengo que especificar tamaño y posicon de los elementos
        JTextField marca2 = new JTextField();//campo de texto
        marca2.setBounds(140,90, 150, 20);
        JLabel modelo1 = new JLabel("Modelo:");
        modelo1.setBounds(90, 130, 150, 40);
        JTextField modelo2 = new JTextField();//campo de texto
        modelo2.setBounds(140,140, 150, 20);
        JLabel anno1 = new JLabel("Año fabr");
        anno1.setBounds(90, 170, 150, 40);
        JTextField anno2 = new JTextField();//campo de texto
        anno2.setBounds(140,180, 150, 20);
        JLabel precio1 = new JLabel("Precio");
        precio1.setBounds(90, 210, 150, 40);
        JTextField precio2 = new JTextField();//campo de texto
        precio2.setBounds(140,220, 150, 20);
        JButton b4 = new JButton("Aceptar");
        b4.setBounds(150,250,125,30);
        b4.setEnabled(false);
        marca2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Este método se utiliza menos frecuentemente
            }

            private void updateLabel() {
                if(!marca2.getText().isEmpty()&&!modelo2.getText().isEmpty()&&!anno2.getText().isEmpty()&&!precio2.getText().isEmpty()){
                    b4.setEnabled(true);
                }
                else{
                    b4.setEnabled(false);
                }
            }
        });//saber cuando hay un cambio en un JTextfield
        modelo2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Este método se utiliza menos frecuentemente
            }

            private void updateLabel() {
                if(!marca2.getText().isEmpty()&&!modelo2.getText().isEmpty()&&!anno2.getText().isEmpty()&&!precio2.getText().isEmpty()){
                    b4.setEnabled(true);
                }
                else{
                    b4.setEnabled(false);
                }
            }
        });
        anno2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Este método se utiliza menos frecuentemente
            }

            private void updateLabel() {
                if(!marca2.getText().isEmpty()&&!modelo2.getText().isEmpty()&&!anno2.getText().isEmpty()&&!precio2.getText().isEmpty()){
                    b4.setEnabled(true);
                }
                else{
                    b4.setEnabled(false);
                }
            }
        });
        precio2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLabel();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Este método se utiliza menos frecuentemente
            }

            private void updateLabel() {
                if(!marca2.getText().isEmpty()&&!modelo2.getText().isEmpty()&&!anno2.getText().isEmpty()&&!precio2.getText().isEmpty()){
                    b4.setEnabled(true);
                }
                else{
                    b4.setEnabled(false);
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoAux = Integer.parseInt(anno2.getText());
                double precioAux = Integer.parseInt(precio2.getText());
                Automovil a1 = new Automovil(marca2.getText(),modelo2.getText(),anoAux,precioAux,2);
                stock.add(a1);
                JOptionPane.showMessageDialog(null,"Se añadio un "+marca2.getText()+" "+modelo2.getText()+" a la lista");
            }
        });
        panel1.add(marca1);
        panel1.add(marca2);
        panel1.add(modelo1);
        panel1.add(modelo2);
        panel1.add(anno1);
        panel1.add(anno2);
        panel1.add(precio1);
        panel1.add(precio2);
        panel1.add(b4);
        panel1.repaint();
        return stock;
    }

    public static void main(String[] args) {
        ArrayList<Automovil> stock = new ArrayList<>();
        JFrame ventana = new JFrame("Control de vehiculos");
        JPanel panel1 = new JPanel(null);
        JButton b1 = new JButton("Añadir automovil");
        JButton b2 = new JButton("Mostrar info");
        JButton b3 = new JButton("Calcular impuesto");
        b1.setBounds(120,80,150,40);
        b2.setBounds(120,160,150,40);
        b3.setBounds(120,240,150,40);
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        b1.addActionListener(new ActionListener() {
            @Override
          public void actionPerformed(ActionEvent e) {
                ArrayList<Automovil> aux = new ArrayList<>();
             aux = crearAuto(panel1,stock);

          }
        });
        ventana.add(panel1);
        ventana.setSize(400, 500);
        ventana.setLocationRelativeTo(null);//aparece en el centro de la pantalla
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
