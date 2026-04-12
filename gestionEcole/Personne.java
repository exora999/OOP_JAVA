
package com.mycompany.gestionecole;

public class Personne {
    private String nom,prenom,adresse,numeroTele;
  public Personne(){}
  public Personne(String nom, String prenom, String adresse, String numeroTele){
   this.nom = nom;
  this.prenom = prenom;
  this.adresse = adresse;
  this.numeroTele = numeroTele;}
  public String getNom(){return nom;}
  public String getPrenom(){return prenom;}
  public String getAdresse(){return adresse;}
  public String getNumTele(){return numeroTele;}
  public void setNom(String nom){this.nom = nom;}
  public void setPrenom(String prenom){this.prenom = prenom;}
  public void setAdresse(String adresse){this.adresse = adresse;}
  public void setNumTele(String numeroTele){this.numeroTele = numeroTele;}
  
  public void afficher(){System.out.print("Nom : "+nom +" Prenom : "+prenom+" Adresse : "+adresse+" Numero de Telephone : "+numeroTele);}
      
}

class Employe extends Personne{
    private String numeroSecu, nomDepartement;
  public Employe(){}
  public Employe(String nom, String prenom, String adresse, String numeroTele, String numeroSecu, String nomDepartement){
      super(nom,prenom,adresse,numeroTele);
      this.nomDepartement =nomDepartement;
      this.numeroSecu = numeroSecu;
  }
@Override
  public void afficher(){
  super.afficher();
  System.out.print("Numero de Sécurité : "+numeroSecu+" Nom de Département : "+nomDepartement);}         
}
class Professeur extends Employe implements Bonus{
    private boolean respModul;
  public Professeur(){}
  public Professeur(String nom, String prenom, String adresse, String numeroTele, String numeroSecu, String nomDepartement, boolean  respModul){
  super(nom,prenom,adresse,numeroTele,numeroSecu,nomDepartement);
  this.respModul = respModul;}
@Override
public void afficher(){
 super.afficher();
 System.out.print("Responsable Module : "+respModul);}
@Override
public void calcleBonus(){System.out.println("Le bonus de cet employé est : 500 DH");}
}
class Etudiant extends Personne{
    private String CNE;
    private String inscFiliére;
public Etudiant(){}
public Etudiant(String nom, String prenom, String adresse, String numeroTele,String CNE, String inscFiliére){
 super(nom,prenom,adresse,numeroTele); 
 this.CNE =CNE;
 this.inscFiliére = inscFiliére;}
@Override
public void afficher(){
super.afficher();
System.out.print("CNE : "+CNE+" Inscrit Filiére : "+inscFiliére);}
}