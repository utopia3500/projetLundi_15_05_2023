package main.java.model;

public abstract class VehiculeGlissant implements Vehicule{
    
    public void seDeplace(){
        glisse();
    }

    public abstract void glisse();
}
