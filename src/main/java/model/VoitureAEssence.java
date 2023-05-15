package main.java.model;

public class VoitureAEssence extends VehiculeRoulant implements VehiculeAEssence {
    private String marque;
    private String modele;
    private int vitesseMax;

    public VoitureAEssence(String marque, String modele, int vitesseMax){
        this.marque = marque;
        this.modele = modele;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void consommeDuCarburant(){
        System.out.println("je consomme de carburant");
    }

    @Override
    public void roule(){
        consommeDuCarburant();
        System.out.println("je roule");
    }

    public String getMarque(){
        return marque;
    }

    public void setMarque(String marque){
        this.marque = marque;
    }

    public String getModele(){
        return modele;
    }

    public void setModele(String modele){
        this.modele = modele;
    }

    public int getVitesseMax(){
        return this.vitesseMax;
    }

    public void setVitesseMax(int vitesseMax){
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void affiche(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        String result = "Voiture à essence marque: " + this.marque + " de modèle: " + modele + " et de vitesse max: " + vitesseMax;
        return result;
    } 

}
