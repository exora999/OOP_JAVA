
package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

 
        Qcm[] listeQuestions = new Qcm[5]; 

        String[] choix1 = {"HTML", "JavaScript", "PHP"};
        listeQuestions[0] = new Qcm("Quel langage est le mieux adapté au développement d'interfaces utilisateur ?", choix1, 1);

        String[] choix2 = {"C++", "Python", "Java"};
        listeQuestions[1] = new Qcm("Quel langage est le plus utilisé pour le développement Android ?", choix2, 3);

        String[] choix3 = {"Object Output Process", "Object Oriented Programming", "Only Object Programming"};
        listeQuestions[2] = new Qcm("Que signifie l'abréviation OOP ?", choix3, 2);
        String[] choix4 = {".java", ".class", ".txt"};
        listeQuestions[3] = new Qcm("Quelle est l'extension d'un fichier Java compilé (Bytecode) ?", choix4, 2);

        String[] choix5 = {";", ":", "."};
        listeQuestions[4] = new Qcm("Quel symbole est utilisé pour terminer une instruction en Java ?", choix5, 1);
     

     
        Score gestionnaireScore = new Score(listeQuestions.length);


        Chrono chronometre = new Chrono();

        System.out.println("==============================================");
        System.out.println("   Bienvenue dans le Quiz Interactif !");
        System.out.println("==============================================");


        chronometre.demarrer();


        for (int i = 0; i < listeQuestions.length; i++) {
            listeQuestions[i].afficherQuestion(); 
            System.out.print(" Votre réponse (1, 2 ou 3) : ");
            
            int reponseUser = input.nextInt(); 

            if (listeQuestions[i].estCorrect(reponseUser)) {
                System.out.println(" Bonne réponse !");
                gestionnaireScore.ajouterPoint(); 
            } else {
                System.out.println(" Mauvaise réponse !");
            }
        }


        chronometre.arreter();

        System.out.println("\n==============================================");
        System.out.println("             JEU TERMINÉ");
        System.out.println("==============================================");
        gestionnaireScore.afficherResultatFinal(); 
        chronometre.afficherTemps(); 
        System.out.println("==============================================");

        input.close(); 
    }
}

    

