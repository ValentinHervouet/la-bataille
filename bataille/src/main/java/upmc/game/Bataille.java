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

import java.util.Scanner;


public class Bataille
{
  public static void main(String[] args)
  {
      
      
      Scanner sc = new Scanner(System.in);
      
      int i = 0;
     
      Paquet paquet1 = new Paquet();
      paquet1.creationPaquet();
      
      Joueur joueur1 = new Joueur(paquet1);
      Joueur joueur2 = new Joueur(paquet1);
          
      
      System.out.println("!!! Quelques règles à prendre en compte : \n-Les cartes sont numérotées de 2 à 14\n"
              + "-Le valet étant le 11\n-La dame étant le 12\n-Le roi étant le 13\n-L'as étant donc le 14 (carte la plus forte)\n");
     
      
      //paquet1.affichePaquet();    //affiche le paquet pour vérifier si il n'y a pas eu de bug avec le random.
     
      
      
      System.out.println("Pour lancer une partie appuyer sur entrer :\n");
      sc.nextLine();
      
      while(i < 52)
      {
         
          System.out.println("Le joueur 1 a pioché un : "+joueur1.tireCarte(i));
          System.out.println("Le joueur 2 a pioché un : "+joueur2.tireCarte(i +1));
          if (joueur1.tireCarte(i) > joueur2.tireCarte(i +1))
          {
              System.out.println("Le joueur 1 gagne !");
              joueur1.setCompteur();
          }
          
          else if(joueur1.tireCarte(i) == joueur2.tireCarte(i +1))
          {
              System.out.println("Egalité !");
          }
          else
          {
              System.out.println("Le joueur 2 gagne !");
              joueur2.setCompteur();
          }
          
          System.out.println("Score : joueur1 à "+joueur1.getCompteur()+", joueur2 à "+joueur2.getCompteur()+"");  
          i = i + 2;
          System.out.println("Appuyer sur entrer passer au prochain tour !\n");
          sc.nextLine();
      }
      
      if(joueur1.getCompteur() > joueur2.getCompteur())
        System.out.println("/! Résultat : le joueur 1 remporte la partie");
      else if(joueur1.getCompteur() < joueur2.getCompteur())
        System.out.println("/! Résultat : le joueur 2 remporte la partie");
      else
        System.out.println("/! Résultat : égalité");
      
      
      
  }


}
