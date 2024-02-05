/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipamentosinterface.multifuncional;

import equipamentosinterface.impressora.Impressora;
import equipamentosinterface.copiadora.Copiadora;
import equipamentosinterface.digitalizadora.Digitalizadora;

/**
 *
 * @author logistica
 */
public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {
    
    @Override
    public void usarImpressora(){
        System.out.println("Usando impressora via Multifuncional.");
    }
    @Override
    public void usarCopiadora(){
        System.out.println("Usando copiadora via Multifuncional.");
    }
    @Override
    public void usarDigitalizadora(){
        System.out.println("Usando digitalizadora via Multifuncional.");
    }
    
      
    
}
