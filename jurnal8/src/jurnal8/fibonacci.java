/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal8;

/**
 *
 * @author Praktikan
 */
import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        int deret=Integer.parseInt(JOptionPane.showInputDialog("Masukkan berapa deret Fibonacci: "));
        int a=0;
        int b=1;
        System.out.print(deret+" deret Fibonacci: " );
        for (int i=0;i<deret;i++){
            System.out.print(a+" ");
            a=a+b;
            b=a-b;   
        }
    }
}
