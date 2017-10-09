/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.util.ArrayList;

/**
 *
 * @author hervouet
 */
public class Joueur {
    
    private Paquet paquet;
    private int compteur = 0;
    
    public Joueur(Paquet paquet)
    {
        this.paquet = paquet;
    }    
    
    /*
        Méthode permettant de faire piocher une carte de notre paquet pour
        chaque joueur
    */
    public int tireCarte(int i)
    {  
        ArrayList<Carte> list = paquet.getList(); 
        return list.get(i).getNumero();
    }
    
    
    /*
        Méthode permettant de renvoyer le score actuel du joueur en question
    */
    public int getCompteur()
    {
        return this.compteur;
    }
    
    
    /*
        Méthode permettant de mettre à joueur le compteur de point du gagnant 
        par manche
    */
    public void setCompteur()
    {
        this.compteur ++;
    }
    
    
}
