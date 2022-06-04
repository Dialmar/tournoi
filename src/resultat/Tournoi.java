package resultat;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Tournoi{
    private List<Equipe> listeEquipe;
    private Equipe vainqueurTournoi;

    public Tournoi() {
        listeEquipe = new ArrayList<>();
        for (int i = 0; i<8; i++){
            Equipe equipe = new Equipe("equipe" + (i + 1));
            listeEquipe.add(equipe);
        }

    }

    public void simulation (){
        if (listeEquipe.size() == 1)
        {
            vainqueurTournoi = listeEquipe.get(0);
            System.out.println("------------------------------");
            System.out.println("FINALISTE");
            System.out.println(vainqueurTournoi);
            System.out.println("------------------------------");

            return;
        }
        else {
            List<Equipe> gagnants = new ArrayList<>();
            int i = 0;
            int j = 1;

            while ( i != listeEquipe.size()){
                System.out.println("------------------------------");
                System.out.println(listeEquipe.get(i));
                System.out.println("VS");
                System.out.println(listeEquipe.get(j));
                if (listeEquipe.get(i).getScoreEquipe() > listeEquipe.get(j).getScoreEquipe()) {
                    gagnants.add(listeEquipe.get(i));
                    System.out.println("Vainqueur :");
                    System.out.println(listeEquipe.get(i));
                }
                else {
                    gagnants.add(listeEquipe.get(j));
                    System.out.println("Vainqueur :");
                    System.out.println(listeEquipe.get(j));
                }
                System.out.println("------------------------------");
                System.out.println();
                i += 2;
                j += 2;
            }
            listeEquipe = gagnants;
            simulation();
        }
    }

    public List<Equipe> getListeEquipe() {
        return listeEquipe;
    }

    public void setListeEquipe(List<Equipe> listeEquipe) {
        this.listeEquipe = listeEquipe;
    }

    public Equipe getVainqueurTournoi() {
        return vainqueurTournoi;
    }

    public void setVainqueurTournoi(Equipe vainqueurTournoi) {
        this.vainqueurTournoi = vainqueurTournoi;
    }

}
