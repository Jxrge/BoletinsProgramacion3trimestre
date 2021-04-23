package com.jorgeboletin19;

import javax.swing.*;
import java.awt.*;

public class Componentes {

    JFrame marco;
    JPanel panel;
    JButton bLimpiar, bEscribir;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JTextField textoNome;
    JTextField textoPassword;
    JTextArea aTexCopia;

    public void iniciointerfaz() {

        // instanciar compoñentes

        marco = new JFrame("marco con compoñentes");
        panel = new JPanel();
        bLimpiar = new JButton("LIMPIAR");
        bEscribir = new JButton();
        textoNome = new JTextField();
        textoPassword = new JTextField();
        aTexCopia = new JTextArea("area de texto");
        etiqueta1 = new JLabel("Nome :");
        etiqueta2 = new JLabel("Password :");

        // características compoñentes

        marco.setSize(800, 800);
        panel.setSize(750, 750);
        panel.setLayout(null);
        bLimpiar.setBounds(500, 600, 100, 50);
        bEscribir.setBounds(200, 600, 100, 50);
        bEscribir.setText("PREMER");
        bEscribir.setToolTipText("copia o que hai na area do texto");
        textoNome.setBounds(300, 100, 300, 50);
        textoPassword.setBounds(300, 200, 300, 50);
        aTexCopia.setBounds(100, 300, 500, 200);
        etiqueta1.setBounds(100, 45, 100, 150);
        etiqueta2.setBounds(100, 145, 100, 150);

        // compoñentes

        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(textoNome);
        panel.add(textoPassword);
        panel.add(aTexCopia);
        panel.add(bEscribir);
        panel.add(bLimpiar);
        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }
}
