/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
Calculate the distance between points in the cartesian plane.*/
package exercicios.ruhanconceicao;

import java.util.Scanner;

/**
 *
 * @author logistica
 */
public class PlanoCartesiano {
    private double distanceBetweenPoints,
            coordenatePoints[] = new double[4]; 
    

    public PlanoCartesiano(double x1, double y1, double x2, double y2){
        coordenatePoints[0] = x1;
        coordenatePoints[1] = y1;
        coordenatePoints[2] = x2;
        coordenatePoints[3] = y2;
        this.distanceBetweenPoints = getDistance(coordenatePoints);
    }
    
    public double getDistance(double points[]){
        double distance;
        distance = Math.sqrt(Math.pow(points[2] - points[0], 2) + 
                Math.pow(points[3] - points[1], 2));
        return distance;
    }
    
    public double getDistanceBetweenPoints() {
        return distanceBetweenPoints;
    }

}
