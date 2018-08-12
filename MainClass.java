/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Nayeem
 */
public class MainClass {
    
    public static void main(String args[])
    {
        Calculator obj = new Calculator();
        
        Scanner printer = new Scanner(System.in);
        
        System.out.print("A = ");
        int a = printer.nextInt();
        System.out.print("B = ");
        int b = printer.nextInt();
        
        System.out.println(obj.addNumber(a, b));
        System.out.println(obj.subNumber(a, b));
        System.out.println(obj.multiNumber(a, b));
        System.out.println(obj.divNumber(a, b));
        
        
    }
    
}
