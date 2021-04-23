package com.jorgeboletin20;

import javax.swing.*;
import java.awt.*;

public class Componentes {

    JFrame marco;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JButton bLimpiar, bEscribe, boton;
    JLabel etiqueta1, etiqueta2;
    JTextField textoNome,textoContraseña;
    JTextArea TextoCopia,elementos;

    public void iniciointerfaz() {

        // instanciar compoñentes
        marco = new JFrame("marco compoñentes");
        panel1 = new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        bLimpiar = new JButton("LIMPIAR");
        bEscribe = new JButton();
        boton=new JButton("BOTON");
        textoNome = new JTextField();
        textoContraseña = new JTextField();
        elementos=new JTextArea("ElementoLista1 \n ElementoLista2 \n ElementoLista3");
        TextoCopia = new JTextArea("area do texto");
        etiqueta1 = new JLabel("Nome:");
        etiqueta2 = new JLabel("Password:");

        // dstribución paneles
        marco.setSize(800, 800);
        panel1.setBounds(40,25,700,400);
        panel2.setBounds(40,450,700,400);
        panel1.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.black));
        panel2.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.black));
        panel1.setLayout(null);
        panel2.setLayout(null);

        // características compoñentes


        bLimpiar.setBounds(450, 300, 150, 50);
        bEscribe.setBounds(200, 300, 150, 50);
        bEscribe.setText("PREMER");
        bEscribe.setToolTipText("copia o que temos na liña de texto na area do texto ");
        boton.setBounds(290,150,100,50);
        textoNome.setBounds(300, 100, 300, 50);
        textoContraseña.setBounds(300, 200, 300, 50);
        TextoCopia.setBounds(450, 50, 200, 200);
        TextoCopia.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        elementos.setBounds(40,50,200,200);
        elementos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        etiqueta1.setBounds(100, 45, 100, 150);
        etiqueta2.setBounds(100, 145, 100, 150);

        //engadimos compoñentes

        panel1.add(etiqueta1);
        panel1.add(etiqueta2);
        panel1.add(textoNome);
        panel1.add(textoContraseña);
        panel1.add(bEscribe);
        panel1.add(bLimpiar);
        panel2.add(TextoCopia);
        panel2.add(boton);
        panel2.add(elementos);
        marco.add(panel1);
        marco.add(panel2);
        marco.add(panel3);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}