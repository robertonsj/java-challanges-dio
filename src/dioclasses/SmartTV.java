/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dioclasses;

/**
 *ghghghghg
 * @author logistica
 */
public class SmartTV {
    boolean ligada;
    int canal;
    int volume;
    
    SmartTV(){
        ligada = false;
        canal = 1;
        volume = 50;
    }
    
    public void ligarDesligar(){
        ligada = !ligada;
    }
    
    //Alterar volume para o  nível desejado (maior ou menor)
    public void alterarVolume(int alterarPara){
        volume = alterarPara;
    }
    //Aumentar volume em uma unidade
    public void aumentarVolume(){
        volume++;
    }
    //Diminur volume em uma unidade
    public void diminurVolume(){
        volume--;
    }
    
    //Mudar para canal desejado
    public void mudarCanal(int mudarPara){
        canal = mudarPara;
    }
    public void mudarCanalMaisUm(){
        canal++;
    }
    public void mudarCanalMenosUm(){
        canal--;
    }
    
}
