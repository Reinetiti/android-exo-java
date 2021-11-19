package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Individu i = new Individu();
        i.ajouterVoyageur(new Ministre("ALI", "Baba", 45, "1995", 30000));
        i.ajouterVoyageur(new ManutARisque("ATERO", "Abdias", 30, "2001", 45));

        i.affichage();
        System.out.println("Le gain moyen pour ce voyage est de "
                + i.gainMoyen() + " francs.");
    }
}
