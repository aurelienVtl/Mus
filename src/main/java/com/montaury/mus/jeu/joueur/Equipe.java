package com.montaury.mus.jeu.joueur;

import java.util.List;

public class Equipe {
    private String nom;
    private List<Joueur> listeJoueurs;

    public Equipe(String nom){
        this.nom=nom;
    }

    public void addJoueur(Joueur joueur){
        joueur.setEquipe(this);
        this.listeJoueurs.add(joueur);
    }
}
