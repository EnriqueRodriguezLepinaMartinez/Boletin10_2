/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 2
        
          int secreto, oportunidades, secreto2=0;
        boolean juego=false;
        
        
        secreto = (int) (Math.random() * 50+1);
        oportunidades = (int) (Math.random() *9+1);
        
        for(int i=0; ;i++){
            secreto2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
            if(secreto2 == secreto){
                juego=true;
                break;
            }
            else{
                if(secreto2>secreto){
                JOptionPane.showMessageDialog(null, "Te has pasado! Te quedan " + oportunidades + " oportunidades.");    
                }
                else
                JOptionPane.showMessageDialog(null, "Te has quedado corto.  Te quedan " + oportunidades + " oportunidades.");
                oportunidades--;
            }
                
            if(oportunidades==-1){
                    juego=false;
                    break;
                }
        }
        if(juego==true){
             JOptionPane.showMessageDialog(null, "Enhorabuena");
        }
             else
             JOptionPane.showMessageDialog(null, "Has perdido");
    }
    
}
