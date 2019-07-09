/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labMuiltyArray;

import javax.swing.JOptionPane;

/**
 * JOptionPane 視窗
 *
 * @author kevinchang
 */
public class JOptionPaneTest {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What's your name ?");
        System.out.println("My name is " + name);
        String age = JOptionPane.showInputDialog("How old are you ?");
        System.out.println("I'm " + age + " year old");
        
        String bodyH = JOptionPane.showInputDialog("請輸入身高");
        String bodyW = JOptionPane.showInputDialog("請輸入體重");
        double h = Double.parseDouble(bodyH);
        double w = Double.parseDouble(bodyW);
        double bmi = w / Math.pow((h/100), 2);
        System.out.println("BMI=" + bmi);

    }
}
