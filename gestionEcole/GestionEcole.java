

package com.mycompany.gestionecole;
import java.util.Scanner;
public class GestionEcole {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employe E1= null;
        Professeur P1 = null,P2 = null;
        Etudiant T1 = null,T2 = null;
        String choix ="";
        do{
        System.out.print("Choix- Entrer 'E' pour Employe, 'P' pour Professeur, 'T' pour Etudiant, 'q' pour Quitte : ");
        choix = input.next();
        if(choix.equalsIgnoreCase("q")){break;}
        System.out.print("Entrer Le nom : ");
        String nom = input.next();
        System.out.print("Entrer Le Prénom : ");
        String prenom = input.next();
        System.out.print("Entrer L'Adresse : ");
        String adresse = input.next();
        System.out.print("Entrer Numéro de Téléphone : ");
        String numTele = input.next();
        
        //Q4
        if(choix.equalsIgnoreCase("e") && E1 == null){
            System.out.print("Entrer le Numéro de Sécurité : ");
            String numSecu = input.next();
            System.out.print("Entrer Le Nom de Département : ");
            String nomDepa = input.next();
            E1 = new Employe(nom,prenom,adresse,numTele,numSecu,nomDepa);
            }
        else if(choix.equalsIgnoreCase("p")){
            System.out.print("Entrer le Numéro de Sécurité : ");
            String numSecu = input.next();
            System.out.print("Entrer Le Nom de Département : ");
            String nomDepa = input.next();
            System.out.print("Est-il responsable d'un module ? (oui/non) : ");
            String reponse = input.next();
            boolean respModul = reponse.equalsIgnoreCase("oui"); 
            if(P1==null){P1 = new Professeur(nom,prenom,adresse,numTele,numSecu,nomDepa,respModul);}
            else{P2 = new Professeur(nom,prenom,adresse,numTele,numSecu,nomDepa,respModul);}
            }
        else if(choix.equalsIgnoreCase("t")){
            System.out.print("Entrer le CNE : ");
            String CNE = input.next();
            System.out.print("Entrer La Filiére : ");
            String filiere = input.next();
            if(T1 == null){T1 = new Etudiant(nom,prenom,adresse,numTele,CNE,filiere);}
            else{T2 = new Etudiant(nom,prenom,adresse,numTele,CNE,filiere);}
        }
        else if (choix.equalsIgnoreCase("q")){System.out.println("Fin de Programme!!");
             }
}while(!choix.equals("q"));
        System.out.println("--- EMPLOYÉS ---");
        if(E1!=null){E1.afficher();}
        else{System.out.println("Aucun employé n'a été saisi.\n");}
        System.out.println("--- PROFESSEUR ---");
        if(P1!=null){P1.afficher();}
        if(P2!=null){P2.afficher();}
        if(P1==null&&P2==null){System.out.println("Aucun Professeur n'a été saisi.\n");}
        System.out.println("\n--- ETUDIANT ---");
        if(T1!=null){T1.afficher();}
        if(T2!=null){T2.afficher();}
        if(T1==null&&T2==null){System.out.println("Aucun Etudiant n'a été saisi.\n");}
      
    }
}
