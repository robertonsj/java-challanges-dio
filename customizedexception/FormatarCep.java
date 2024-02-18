/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customizedexception;

/**
 *
 * @author logistica
 */
public class FormatarCep {
    
    static public String formatar(String cep) throws InvalidCepException {
        if(cep.length() != 8){
            throw new InvalidCepException();
        }
        return "cep";
    }
    
}
