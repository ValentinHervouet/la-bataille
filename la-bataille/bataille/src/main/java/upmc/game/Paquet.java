/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.util.ArrayList;

/**
 *
 * @author licence
 */
public class Paquet {
    
    private Carte carte;
    private ArrayList paquet;
    
    
    public ArrayList remplirPaquet()
    {
        for(int i = 0; i < 52; i++)
        {
            paquet.add(2);
        }
        return paquet;
    }
    
}
