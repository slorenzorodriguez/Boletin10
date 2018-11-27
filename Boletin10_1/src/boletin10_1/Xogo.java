/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Xogo {
    private int num;
    private int intentos;
    private int respuesta;

    public void establecerXogo() {
        boolean correcto = false;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero entre 1 y 50:"));
            if (num > 0 && num <= 50) {
                correcto = true;
            } else {
                JOptionPane.showMessageDialog(null, "Numero incorrecto");
            }
        } while (correcto == false);
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos del juego:"));
    }

    public void iniciarXogo() {
        this.establecerXogo();
        for (int i = 0; i < intentos; i++) {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Adivinar numero entre 1 y 50:"));
            if (respuesta > num) {
                JOptionPane.showMessageDialog(null, "Incorrecto. Es menor");
            } else if (respuesta < num) {
                JOptionPane.showMessageDialog(null, "Incorrecto. Es mayor");
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta correcta");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "No más intentos");
    }
}


}
