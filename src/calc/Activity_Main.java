/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import javax.swing.JFrame;



/**
 *
 * @author User
 */
public class Activity_Main {
    
    public static void main(String[] args) {
        Calculator calculator = new  Calculator();
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(calculator);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
    
   
    
}
