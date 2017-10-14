/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.io.IOException;

/**
 *
 * @author hervouet
 */
public class MenuPseudo {
    
    LectureConsole lc = new LectureConsole();
    LectureFichier lf = new LectureFichier();
 
    
    /*
        Méthode permettant d'effectuer le mode de lecture des pseudos des
        joueurs de la partie en cours en fonction du paramètre passé.
    */
    
    public LecturePseudo modeLecturePseudo(int choix) throws IOException
    {
        if(choix == 1)
        {
            lc.diplayPseudo();
            return lc;
        }
        else
        {
            lf.lectFichier("C:\\Users\\hervouet\\Desktop\\java\\la-bataille\\bataille\\src\\main\\java\\upmc\\game\\name.txt");
            return lf;
        }
        
    }
    
}
