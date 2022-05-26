package resultat;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List <Joueur> listeJoueur;
    private String nomEquipe;
    private float scoreEquipe;

    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
        listeJoueur = new ArrayList<Joueur>();
        for (int i = 0; i < 21 ; i++){
            Joueur joueur = new Joueur();
            listeJoueur.add(joueur);
        }
        scoreEquipe = 0;
        for ( Joueur j : listeJoueur){
            scoreEquipe = scoreEquipe + j.getTauxReussite();
        }
        scoreEquipe = scoreEquipe / 21;
    }

    public List<Joueur> getListeJoueur() {
        return listeJoueur;
    }

    public void setListeJoueur(List<Joueur> listeJoueur) {
        this.listeJoueur = listeJoueur;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public float getScoreEquipe() {
        return scoreEquipe;
    }

    public void setScoreEquipe(float scoreEquipe) {
        this.scoreEquipe = scoreEquipe;
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "nomEquipe='" + nomEquipe + '\'' +
                ", scoreEquipe=" + scoreEquipe +
                '}';
    }
}

