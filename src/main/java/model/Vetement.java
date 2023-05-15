package main.java.model;

public class Vetement{
    private String codeBar;
    private String marque;
    private double prix;
    private int quantite;
    private String color;

    public Vetement(String codeBar, String marque, double prix, int quantite, String color){
        this.codeBar = codeBar;
        this.marque = marque;
        this.prix = prix;
        this.quantite = quantite;
        this.color = color;
    }

    public String getCodeBar(){
        return this.codeBar;
    }

    public void setCodeBar(String codeBar){
        this.codeBar = codeBar;
    }

    public String getMarque(){
        return this.marque;
    }

    public void setMarque(String marque){
        this.marque = marque;
    }

    public double getPrix(){
        return this.prix;
    }

    public void setPrix(double prix){
        this.prix = prix;
    }

    public int getQuantite(){
        return this.quantite;
    }

    public void setQuantite(int quantite){
        this.quantite = quantite;
    }

    public String getColor(){
        return this.color;
    } 

    public void setColor(String color){
        this.color = color;
    }

    @Override 
    public String toString(){
        return "Vetement code barre: " + this.codeBar + " marque: " + this.marque + " prix: " + this.prix + 
            " quantite: " + this.quantite + " couleur: " + this.color;
    }



    



}
