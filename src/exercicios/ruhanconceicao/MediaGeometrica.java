/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.ruhanconceicao;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author logistica
 */
public class MediaGeometrica {
    /*Write a algorithm to calculate the geometric mean of three numbers
    given by user.
    mean = square root of de a * b * c, index 3 
    */
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat(".######");
    
    System.out.print("Enter the first number: ");
    double firstNumber = scanner.nextInt();
    System.out.print("Enter the second number: ");
    double secondNumber = scanner.nextInt();
    System.out.print("Enter the third number: ");
    double thirdNumber = scanner.nextInt();
    
    double geometricMean = 
            Math.pow(firstNumber * secondNumber *  thirdNumber, 1.0/3.0);
    
    System.out.println("The geometric average is: " + format.format(geometricMean));
    scanner.close();
    
    }
   
}
