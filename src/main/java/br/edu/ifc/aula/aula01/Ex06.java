/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.aula01;

import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Ex06 {

    public static void main(String[] args) {
        try {
            String loginValido = "aluno";
            String senhaValida = criptografar("ifcfraiburgo");

            String login = JOptionPane.showInputDialog("Login: ");
            String senha = JOptionPane.showInputDialog("Senha: ");

            if (login.equals(loginValido) && senhaValida.equals(criptografar(senha))) {
                JOptionPane.showMessageDialog(null, "Bem vindo Aluno!");
            } else {
                JOptionPane.showMessageDialog(null, "Login Inválido!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static String criptografar(String senha) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(senha.getBytes(), 0, senha.length());
        String resultado = new BigInteger(1, md.digest()).toString(16);
        return resultado;
    }
}
