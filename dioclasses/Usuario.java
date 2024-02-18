/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dioclasses;

/**
 *
 * @author logistica
 */
public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTV smart  = new SmartTV();
        
        smart.ligarDesligar();
        smart.aumentarVolume();
        smart.mudarCanal(4);
        smart.mudarCanalMaisUm();
        
        System.out.println("Current Channel : " + smart.canal);
        System.out.println("Current sound level : " + smart.volume);
        System.out.println("It's turned on: " + smart.ligada);
        
        
    }
}
