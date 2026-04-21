
package main;

public class Qcm {
 
    private String enonce;        
    private String[] options;     
    private int indexCorrect;     

    public Qcm(String enonce, String[] options, int indexCorrect) {
        this.enonce = enonce;
        this.options = options;
        this.indexCorrect = indexCorrect;
    }

    public void afficherQuestion() {
        System.out.println(" Question : " + enonce);
        for (int i = 0; i < options.length; i++) {
            System.out.println("   " + (i + 1) + ") " + options[i]);
        }
    }

    public boolean estCorrect(int choixUtilisateur) {
        return choixUtilisateur == indexCorrect;
    }
}
    

