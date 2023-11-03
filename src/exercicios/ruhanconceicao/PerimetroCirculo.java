/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.ruhanconceicao;



/**
 *
 * @author logistica
 * The class aims to calculate the circle circumference and area.
 */
public final class PerimetroCirculo {
    
    protected double  radius, circlePerimeter, circleArea;
    
    PerimetroCirculo(double radius) {
        this.radius = radius;
        this.circlePerimeter = calculateCirclePerimeter(radius);
        this.circleArea = calculateCircleArea(radius);
    }
    
    public double calculateCirclePerimeter(double radius){
        return 2 * Math.PI * radius;
    }
    
    public double calculateCircleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
              
}
