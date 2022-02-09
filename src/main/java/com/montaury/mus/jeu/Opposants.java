package com.montaury.mus.jeu;

import com.montaury.mus.jeu.joueur.Joueur;
import java.util.Iterator;
import java.util.List;

public class Opposants {
  private Joueur[] ordreDePassage;
  private Joueur joueurZaku;
  private Joueur joueurEsku;

  public Opposants(Joueur[] joueurs) {
    this.ordreDePassage=joueurs;
    this.joueurEsku = joueurs[0];
    this.joueurZaku = joueurs[3];
  }

  public void tourner() {
    Joueur[] copieOdreDePassage;
    copieOdreDePassage =ordreDePassage;
    for(int i=1; i< ordreDePassage.length;i++) {
      ordreDePassage[i+1 % ordreDePassage.length] = copieOdreDePassage[i];
    }
    this.joueurEsku = ordreDePassage[0];
    this.joueurZaku = ordreDePassage[ordreDePassage.length -1];

  }

  public Joueur joueurEsku() {
    return joueurEsku;
  }

  public Joueur joueurZaku() {
    return joueurZaku;
  }

  public List<Joueur> dansLOrdre() {
    return List.of(ordreDePassage);
  }
}
