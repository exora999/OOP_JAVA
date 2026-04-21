
package main;


public class Score {
    private int points;
    private int totalQuestions;

  
    public Score(int totalQuestions) {
        this.points = 0;
        this.totalQuestions = totalQuestions;
    }

  
    public void ajouterPoint() {
        this.points++;
    }

    
    public void afficherResultatFinal() {
        System.out.println(" Votre score final est : " + points + " / " + totalQuestions);
        
     
        if (points == totalQuestions) {
            System.out.println(" Excellent ! Sans faute !");
        } else if (points >= totalQuestions / 2) {
            System.out.println(" Bon travail !");
        } else {
            System.out.println(" Vous devez réviser un peu plus.");
        }
    }
}
    

