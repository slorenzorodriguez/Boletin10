/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10__2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */
public class Xogo2 {
    public void inicio() {
        Random aleatorio = new Random();
        int num = 1 + aleatorio.nextInt(50);
        boolean correcto = false;
        do {
            int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Adivine un número entre 1 y 50:"));
            if (respuesta == num) {
                JOptionPane.showMessageDialog(null, "Respuesta correcta");
                correcto = true;
                break;
            } else if (Math.abs(num - respuesta) <= 5) {
                JOptionPane.showMessageDialog(null, "Muy cerca");
            } else if (Math.abs(num - respuesta) <= 10) {
                JOptionPane.showMessageDialog(null, "Cerca");
            } else if (Math.abs(num - respuesta) <= 20) {
                JOptionPane.showMessageDialog(null, "Lejos");
            } else if (Math.abs(num - respuesta) > 20) {
                JOptionPane.showMessageDialog(null, "Muy lejos");
            }

        } while (correcto == false);
    }
}




