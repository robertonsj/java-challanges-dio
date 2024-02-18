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
public class InvalidCepException extends Exception {

    @Override
    public String getMessage() {
        return super.getMessage() + " IT HASN'T EIGHT DIGITS."; //To change body of generated methods, choose Tools | Templates.
    }
    
}
