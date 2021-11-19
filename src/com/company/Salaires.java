package com.company;

import java.util.Date;
//La classe Voyageur
abstract class Voyageur {
    //Un Voyageur est caractérisé par son nom, son prénom, son âge
    private String nom;
    private  String prenom;
    private  int age;
    private String date;

    public Voyageur(String nom, String prenom, int age, String date){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getDate() {
        return date;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public abstract double billet();

    public String getTitre()
    {
        return "Le Voyageur";
    }

    public String getNom()
    {
        return getTitre()+" " + prenom + " "  + nom;
    }
}

/* **********************************************************************
 *  La classe VIP (regroupe Ministre et HommeAffaire)
 * **********************************************************************/
abstract class VIP extends Voyageur {
    private double gain;

    public VIP(String nom, String prenom, int age, String date, double gain){
        super(nom, prenom, age, date);
        this.gain = gain;
    }

    public double getGain()
    {
        return gain;
    }

    public void setGain(double gain)
    {
        this.gain = gain;
    }
}

/* **********************************************************************
 *  La classe Ministre
 * **********************************************************************/
class Ministre extends VIP {
    private final static double POURCENT_MINISTRE = 0.5;
    //private final static int BONUS_MINISTRE = 400;

    public Ministre (String nom, String prenom, int age, String date, double gain){
        super(nom, prenom, age, date, gain);
    }

    public double billet()
    {
        return (getGain() * POURCENT_MINISTRE);
    }

    public String getTitre ()
    {
        return "Le Ministre";
    }
}

/* **********************************************************************
 *  La classe HommeAffaire
 * **********************************************************************/
class HommeAffaire extends VIP {
    private final static double POURCENT_HOMMEAFFAIRE = 0.5;
    //private final static int BONUS_HOMMEAFFAIRE = 800;

    public HommeAffaire (String nom, String prenom, int age, String date, double gain){
        super(nom, prenom, age, date, gain);
    }

    public double billet()

    {
        return (getGain() * POURCENT_HOMMEAFFAIRE);
    }

    public  String getTitre ()
    {
        return "L' Homme d'affaire";
    }
}

/* **********************************************************************
 *  La classe Technicien (Production)
 * **********************************************************************/
class Technicien extends Voyageur {
    private final  static double FACTEUR_UNITE = 5.0;
    private int NBR_MACHINE;

    public Technicien (String nom, String prenom, int age, String date, int NBR_MACHINE){
        super(nom, prenom, age, date);
        this.NBR_MACHINE = NBR_MACHINE;
    }

    public static double getFacteurUnite() {
        return FACTEUR_UNITE;
    }

    public int getNBR_MACHINE() {
        return NBR_MACHINE;
    }

    public void setNBR_MACHINE(int NBR_MACHINE) {
        this.NBR_MACHINE = NBR_MACHINE;
    }

    public double billet()

    {
        return NBR_MACHINE * FACTEUR_UNITE;
    }

    public String getTitre()
    {
        return "Le Technicien";
    }
}

/* **********************************************************************
 *  La classe Pilote
 * **********************************************************************/
class Pilote extends Voyageur {
    private final static double HORAIRE = 65.0;
    private int heures;

    public Pilote (String nom, String prenom, int age, String date, int heures){
        super(nom, prenom, age, date);
        this.heures = heures;
    }

    public static double getHORAIRE() {
        return HORAIRE;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public double billet()
    {
        return heures * HORAIRE;
    }

    public String getTitre()
    {
        return "Le Pilote";
    }
}

/* **********************************************************************
 *  L'interface d'employés à risque
 * **********************************************************************/
interface ARisque {
    int BONUS = 700;
}

/* **********************************************************************
 *  Une première sous-classe d'employé à risque
 * **********************************************************************/
class TechnARisque extends Technicien implements ARisque {
    public TechnARisque(String nom, String prenom, int age, String date, int Unites){
        super(nom, prenom, age, date, Unites);
    }

    public double calculerBillet()
    {
        return super.billet() + BONUS;
    }
}

/* **********************************************************************
 *  Une autre sous-classe d'employé à risque
 * **********************************************************************/
class  ManutARisque extends Pilote implements ARisque {
    public ManutARisque(String nom, String prenom, int age, String date, int heures){
        super(nom, prenom, age, date, heures);
    }

    public double calculerBillet()
    {
        return super.billet() + BONUS;
    }
}

/* **********************************************************************
 *  La classe Individu
 * **********************************************************************/
class Individu {
    //staff est de type Voyageur
    private Voyageur[] staff;
    private int nbreVoyageur;
    private final static int MAXVOYAGEUR = 70;

    public Individu() {
        //le nombre maximum de Voyageur qui sera créer est 70
        staff = new Voyageur[MAXVOYAGEUR];
        //Initialisation du nombre de Voyageur à 0. C'est à dire au début il n'y a pas de Voyageur
        nbreVoyageur = 0;
    }

    public void ajouterVoyageur(Voyageur e) {
        //incrémentation du nombre d'employe
        nbreVoyageur++;
        if (nbreVoyageur <= MAXVOYAGEUR) {
            staff[nbreVoyageur - 1] = e;
        } else {
            System.out.println("Pas plus de " + MAXVOYAGEUR + "Voyageur");
        }
    }
    //le salaire moyen est égale à la somme des salaire de tous les employés diviser par le nombre d'employé
    public double gainMoyen() {
        double somme = 0.0;
        for (int i = 0; i < nbreVoyageur; i++) {
            somme += staff[i].billet();
        }
        return somme / nbreVoyageur;
    }

    public void affichage() {
        for (int i = 0; i < nbreVoyageur; i++) {
            System.out.println(staff[i].getNom() + " achète un billet qui vaut "
                    + staff[i].billet() + " francs.");
        }
    }
}




