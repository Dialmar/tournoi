package resultat;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private List <Joueur> listeJoueur;
    private String nomEquipe;
    private float scoreEquipe;

    public Equipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
        listeJoueur = generatePlayers();
        scoreEquipe = getAverageScore();
    }

    private float getAverageScore() {
        float scoreAccumule = 0;
        for ( Joueur j : listeJoueur){
            scoreAccumule = scoreEquipe + j.getTauxReussite();
        }

        return scoreAccumule / 21;
    }

    private List<Joueur> generatePlayers() {
        List<Joueur> listPlayers = new ArrayList<>();
        for (int i = 0; i < 21 ; i++){
            listPlayers.add(new Joueur());
        }
        return listPlayers;
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

