package main.java.model;

public class Salarier{
    private int id;
    private String nom;
    private  String prenom;
    private double salaire;

    public Salarier(int id, String nom, String prenom, double salaire){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public void augmenterSalaire(double pourcentage){
        this.salaire *= (1+(pourcentage/100.0));
    }

    public void diminuerSalaire(double pourcentage){ 
        this.salaire *= (1-(pourcentage)/100.0);
    }

    public int geId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public double getSalaire(){
        return salaire;
    }

    public void setSalaire(double salaire){
        this.salaire = salaire;
    }

    @Override
    public String toString(){
        return "class: Salarié id: " + this.id + " nom: " + this.nom + " prenom: " + this.prenom + " salaire : " + this.salaire + " Euros.";
    }
}