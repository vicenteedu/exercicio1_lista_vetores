package com.mycompany.exercicio1_lista;

import javax.swing.JOptionPane;

public class Principal{

    public static void main(String[] args) {
        String nomes[] = new String[100];
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidades de alunos" ));
        
         for ( int i = 0 ; i<n; i++){
        nomes [i] = JOptionPane.showInputDialog("Digite o nome: ");
    }
         for (int i=0; i<n; i++){
            System.out.println("nome: "  + nomes[i]);
         }

    }
}
