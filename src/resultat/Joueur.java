package resultat;

public class Joueur {
    private float tauxReussite;
    public Joueur() {
        tauxReussite = (float) (0.15 + (Math.random() * (1- 0.15)));
    }

    public float getTauxReussite() {
        return tauxReussite;
    }

    public void setTauxReussite(float tauxReussite) {
        this.tauxReussite = tauxReussite;
    }

}