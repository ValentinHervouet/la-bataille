// Copyright 2017 Pierre Talbot (IRCAM)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package upmc.game;

import java.io.IOException;
import java.util.Scanner;

/*******
 * /!\ ATTENTION : Pour que mon programme fonctionne à 100% il faut remplacer le chemin
 * du fichier.txt par votre chemin sinon le fichier sera introuvable à l'execution. Dans 
 * l'ensemble de mon programme le chemin figure 4 fois (3 fois dans Bataille.java et
 * 1 fois dans MenuPseudo.java;
 */

public class Bataille
{
    
  public static void main(String[] args) throws IOException
  {
      
      
      Scanner sc = new Scanner(System.in);
      
      int i = 0;
     
      Paquet paquet1 = new Paquet();
      paquet1.creationPaquet();
      
      Joueur joueur1 = new Joueur(paquet1);
      Joueur joueur2 = new Joueur(paquet1);
      
      LectureConsole lc = new LectureConsole();
      
      System.out.println("!!! Quelques règles à prendre en compte : \n-Les cartes sont numérotées de 2 à 14\n"
              + "-Le valet étant le 11\n-La dame étant le 12\n-Le roi étant le 13\n-L'as étant donc le 14 (carte la plus forte)\n");
     
      
      //paquet1.affichePaquet();    //affiche le paquet pour vérifier si il n'y a pas eu de bug avec le random.
      
      iniPseudoJoueur();
      choixLectPseudo();
           
      System.out.println("Pour lancer une partie appuyer sur entrer :\n");
      sc.nextLine();
      
      while(i < 52)
      {
         
          System.out.println(lc.getPseudo(0)+" a pioché un : "+joueur1.tireCarte(i));
          System.out.println(lc.getPseudo(1)+" a pioché un : "+joueur2.tireCarte(i +1));
          if (joueur1.tireCarte(i) > joueur2.tireCarte(i +1))
          {
              System.out.println(lc.getPseudo(0)+" gagne !");
              joueur1.setCompteur();
          }
          
          else if(joueur1.tireCarte(i) == joueur2.tireCarte(i +1))
          {
              System.out.println("Egalité !");
          }
          else
          {
              System.out.println(lc.getPseudo(1)+" gagne !");
              joueur2.setCompteur();
          }
          
          System.out.println("Score : "+lc.getPseudo(0)+" à "+joueur1.getCompteur()+", "+lc.getPseudo(1)+" à "+joueur2.getCompteur()+"");  
          i = i + 2;
          System.out.println("Appuyer sur entrer passer au prochain tour !\n");
          sc.nextLine();
      }
      
      if(joueur1.getCompteur() > joueur2.getCompteur())
        System.out.println("/! Résultat : "+lc.getPseudo(0)+" remporte la partie");
      else if(joueur1.getCompteur() < joueur2.getCompteur())
        System.out.println("/! Résultat : "+lc.getPseudo(1)+" remporte la partie");
      else
        System.out.println("/! Résultat : égalité");
     
      LectureFichier lf = new LectureFichier();
      lf.supprContenuFichier("C:\\Users\\hervouet\\Desktop\\java\\la-bataille\\bataille\\src\\main\\java\\upmc\\game\\name.txt");
      
  }
  
 
  /*
        Demande à l'utilisateur d'entrer le nom des deux joueurs de la partie 
        puis ces deux noms sont insérés dans un ArrayList et dans un fichier.txt
  */
  
  public static void iniPseudoJoueur() throws IOException
  {
      LectureConsole lc = new LectureConsole();
      LectureFichier lf = new LectureFichier();
      Scanner sc = new Scanner(System.in);
      String name;
      System.out.println("Entrez le pseudo du joueur 1 : ");
      name = sc.nextLine();
      lc.insertPseudo(name);
      lf.ecritureFichier("C:\\Users\\hervouet\\Desktop\\java\\la-bataille\\bataille\\src\\main\\java\\upmc\\game\\name.txt", name);
      System.out.println("Entrez le pseudo du joueur 2 : ");
      name = sc.nextLine();
      lc.insertPseudo(name);
      lf.ecritureFichier("C:\\Users\\hervouet\\Desktop\\java\\la-bataille\\bataille\\src\\main\\java\\upmc\\game\\name.txt", name);
  }
  
  /*
    Demande à l'utilaseur par quelle méthode il souhaite visualiser les pseudos 
    des joueurs de la partie en cours.
  */
  
    public static void choixLectPseudo() throws IOException
    {

        MenuPseudo mp = new MenuPseudo();
        int choix;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Menu visualisation pseudos ---`\n"
                + "Pour visualiser les pseudos via la console (collection) tapez 1\n"
                + "Pour visualiser les pseudos via un fichier.txt tapez 2\n");
        choix = sc.nextInt();
        System.out.println("Les joueurs de la partie en cours sont : ");
        mp.modeLecturePseudo(choix);
        System.out.println();
    }
  
}
