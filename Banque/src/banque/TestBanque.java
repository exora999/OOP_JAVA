
package banque;

public class TestBanque {

    public static void main(String[] args) {
        CompteBancaire D1 = new CompteBancaire("Hamza",2007);
        D1.deposer(1000);
        D1.retirer(400);
        D1.retirer(700);
        D1.afficher();
        
    }
    
}
