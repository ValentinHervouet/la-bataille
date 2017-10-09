/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

/**
 *
 * @author hervouet
 */
public class Carte {
    
    private int numero;
    
     public Carte()
    {
        this.numero = 0;
    }
   
    public Carte(int numero)
    {
        this.numero = numero;
    }
    
    
    
    public int getNumero()
    {
        return this.numero;
    }
    
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
}
