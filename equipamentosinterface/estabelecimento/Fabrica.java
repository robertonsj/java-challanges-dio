/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipamentosinterface.estabelecimento;

import equipamentosinterface.multifuncional.EquipamentoMultifuncional;
import equipamentosinterface.copiadora.*;

/**
 *
 * @author logistica
 */
public class Fabrica {
    public static void main(String[] args){
        EquipamentoMultifuncional multifuncional = new EquipamentoMultifuncional();
        Copiadora xerox = new Xerox();
        
        multifuncional.usarCopiadora();
        xerox.usarCopiadora();
        
    }
}
