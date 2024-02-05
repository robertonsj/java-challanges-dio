/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipamentosinterface.impressora;

/**
 *
 * @author logistica
 */
public class Deskjet implements Impressora {
    @Override
    public void usarImpressora(){
        System.out.println("Imprimindo via Deskjet...");
    }
}
