package main.java.model;

public abstract class VehiculeRoulant implements Vehicule{
    
    @Override
    public void seDeplace(){
        roule();
    }

    public abstract void roule();
}
