package main.java.model;

public abstract class VehiculeVolant implements Vehicule{
    
    @Override
    public void seDeplace(){
        vole();
    }

    public abstract void vole();
}
