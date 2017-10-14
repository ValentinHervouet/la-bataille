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
public class LectureConsole implements LecturePseudo {

    public ArrayList<String> lirePseudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
        Méthode permettant d'insérer un joueur de la partie en cours dans 
        la collection
    */
    public void insertPseudo(String pseudo)
    {
        lirePseudo.add(pseudo);
    }
    
    /*
        Méthode retournant le joueur désiré de la partie en cours en
        fonction de l'indice passé en paramètre
    */
    
    public String getPseudo(int i)
    {
        return lirePseudo.get(i);
    }
    
    /*
        Méthode permettant d'afficher tous les joueurs de la partie en 
        cours figurant dans la collection
    */
    
    public void diplayPseudo()
    {
        for(String i : lirePseudo)
        {
            System.out.println(i);
        }
    }
    
}
