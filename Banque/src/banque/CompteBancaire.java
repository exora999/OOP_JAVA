
package banque;

public class CompteBancaire {
   private String titulaire;
   private int numero;
   private double solde;
   
  public CompteBancaire(String titulaire,int numero){
      this.titulaire = titulaire;
      this.numero = numero;
      solde = 0.0;
   }
   public CompteBancaire(String titulaire,int numero,double solde){
      this.titulaire = titulaire;
      this.numero = numero;
      this.solde = solde;
   }
   public String getTitulaire(){
   return titulaire;}
   public int getNumero(){
   return numero;}
   public double getSolde(){
   return solde;}
   public void deposer(double montant){
   solde = solde + montant;}
   public void retirer(double montant){
   if (solde >= montant) solde = solde - montant;
   else System.out.println("Solde insuffisant !");}
   public void afficher(){
   System.out.println("Compte N°: "+numero);
   System.out.println("Titulaire : "+titulaire);
   System.out.println("Solde : " +solde +"DH");}
}
