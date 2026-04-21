
package main;

public class Chrono {
    
    private long debut;
    private long fin;
    private boolean enCours;

    public void demarrer() {
        this.debut = System.currentTimeMillis();
        this.enCours = true;
        System.out.println("Chronomètre démarré...");
    }

    public void arreter() {
        this.fin = System.currentTimeMillis();
        this.enCours = false;
    }

    public long getTempsEcoule() {
        if (enCours) {
            return System.currentTimeMillis() - debut;
        }
        return fin - debut;
    }

    public void afficherTemps() {
        long ms = getTempsEcoule();
        long secondes = (ms / 1000) % 60;
        long minutes  = (ms / 1000) / 60;
        System.out.printf(" Temps écoulé : %02d min %02d sec%n", minutes, secondes);
    }
}

