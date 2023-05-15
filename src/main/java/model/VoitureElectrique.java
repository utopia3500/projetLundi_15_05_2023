package main.java.model;

public class VoitureElectrique extends VehiculeRoulant implements VehiculeElectrique{
    private String marque;
    private String modele;
    private int vitesseMax;

    public VoitureElectrique(String marque, String modele, int vitesseMax){
        this.marque = marque;
        this.modele = modele;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void consommeDeLelectricite(){
        System.out.println("je consomme de l'electricité");
    }

    @Override
    public void roule(){
        consommeDeLelectricite();
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
        String result = "Voiture électrique de marque: " + this.marque + " de modele: " + this.modele + " et de vitesse max: " + this.vitesseMax + " kms/h";
        return result;
    } 

}
