/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hervouet
 */
public class LectureFichier implements LecturePseudo {

    public ArrayList<String> lirePseudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
        Méthode permettant de lire les noms des joueurs de la partie en cours
        présent dans le fichier.txt
    */
    
    public void lectFichier(String fichier) throws IOException
    {
        File f = new File(fichier);
        byte[] buf = new byte[2];
        int n = 0;
        
        try {
            FileInputStream fis = new FileInputStream(f);
            
            while((n = fis.read(buf)) >= 0)
            {
                for(byte bit : buf)
                {
                    System.out.print((char)bit);
                }
            }          
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectureFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
        Méthode permettant d'écrire les noms des joueurs de la partie en cours
        dans le fichier.txt
    */
    
    public void ecritureFichier(String fichier, String name) throws IOException
    {
        File f = new File(fichier);
        
        try {
                 
            FileWriter fw = new FileWriter(f, true);
            fw.write(name+"\n");
            fw.flush();
            fw.close();
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectureFichier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
        Méthode permettant de supprimer le contenu du fichier.txt à la fin de chaque partie.
        Le fichier contient uniquement les noms des joueurs de la partie en cours.
    */
   
    public void supprContenuFichier(String fichier) throws IOException
    {
        File f = new File(fichier);
        FileWriter fw = new FileWriter(f);
        fw.write("");
        fw.flush();
        fw.close();
        
        
    }
    
}
