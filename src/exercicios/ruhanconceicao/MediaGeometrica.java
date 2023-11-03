/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.ruhanconceicao;


/**
 *
 * @author logistica
 */
public class MediaGeometrica {
    /*A program to calculate the geometric mean of three numbers
    given by user.
    GM = (a * b * c) ^ 1.0/3.0 
    */
    protected double firstNumber, secondNumber, thirdNumber,
            geometricMean;
    
    MediaGeometrica(double fNumber, double sNumber, double tNumber){
        this.firstNumber = fNumber;
        this.secondNumber = sNumber;
        this.thirdNumber = tNumber;
        this.geometricMean = calculateGeometricMean(fNumber, sNumber, tNumber);
    }
    
    public double calculateGeometricMean(
            double fNumber, double sNumber, double tNumber){
        return Math.pow(firstNumber * secondNumber *  thirdNumber, 1.0/3.0);
    }
   
    
   
}
