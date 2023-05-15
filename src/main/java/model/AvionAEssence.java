package main.java.model;

public class AvionAEssence extends VehiculeVolant implements VehiculeAEssence{
    private String marque;
    private String modele;
    private int vitesseMax;

    public AvionAEssence(String marque, String modele, int vitesseMax){
        this.marque = marque;
        this.modele = modele;
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void consommeDuCarburant(){
        System.out.println("je consomme de l'essence");
    }

    @Override
    public void vole(){
        consommeDuCarburant();
        System.out.println("je vole");
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
    public String toString(){
        String result = "Avion à essence de marque: " + this.marque + " de modele: " + this.modele + " et de vitesse max: " + this.vitesseMax;
        return result;
    } 
}
