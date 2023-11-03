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
public class PerimetroCirculo {
    
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(".####");
        double  radius, circlePerimeter, circleArea;

        System.out.print("Enter the radius of the circle (cm): ");
        radius = scanner.nextDouble();
        
        circlePerimeter = 2 * Math.PI * radius;
        circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("The Circle perimeter is: " + format.format(circlePerimeter));
        System.out.println("The Circle area is: " + format.format(circleArea));
        scanner.close();
        
        
    }
}
