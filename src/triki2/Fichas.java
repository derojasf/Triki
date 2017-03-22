/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triki2;

/**
 *
 * @author David
 */
public class Fichas {
    
    int contador=0;
    String z;
    
    
    public String jugador(){
       
        if(contador%2==0){
            
            z="X";
        
        
        contador++;
            
            
        }
        
        else{
            
            z="O";
        
        
        contador++;
            
           
        }
        
        
    
return z; 
    }
}
    
    

