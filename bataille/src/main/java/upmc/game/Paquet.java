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
public class Paquet {
    
    private ArrayList<Carte> list =  new ArrayList<Carte>();;
    
    
    public Paquet()
    {
        
    }
    
  
    /* 
       Methode permettant de créer un véritable paquet de 52 cartes ne comportant
       pas plus de quatre cartes à la fois pour une valeur
    */
    public ArrayList creationPaquet()
    {
        int min = 2;
        int max = 15;   
        int nombre = 0;
        
        for(int i = 0; i < 52; i++)
        {
            Carte carte = new Carte();
            int random = (int)(Math.random() * (max-min)) + min;
            nombre = compteurCarte(random);
            
            if(nombre < 4)
            {
                carte.setNumero(random);
                list.add(carte);
            }
            else 
                i --;
        }
        
           
        return list;
   
    }
    
 
    
    /*
        Méthode permettant d'afficher l'intégralit du paquet une fois celui intégralement
        remplit.
        /! A  utiliser pour le debugging
    */
    public void affichePaquet()
    {
        for(Carte i : list)
        {
            System.out.println(i.getNumero());
        }
       
    }
    
 
    /* 
       Méthode permettant de vérifier que le paquet déja existant ne contient pas
       plus de 4 cartes de la même valeur.
    */
      public int compteurCarte(int nb)
      {
        int compteur = 0;
        
        for(Carte i : list)
        {
            if(i.getNumero() == nb)
            {
                compteur ++;
            }
        }
        
        return compteur;
       }
    
      
     /*
        Return le paquet de carte utiliser dans la classe Joueur
     */ 
     public ArrayList getList()
     {
         return this.list;
     }
    

}
