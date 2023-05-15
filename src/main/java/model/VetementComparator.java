package main.java.model;

import java.util.Comparator;

public class VetementComparator implements Comparator<Vetement>{
    
    public int compare(Vetement left, Vetement right){
        if (right.getPrix() > left.getPrix()){
            return -1;
        }
        else if (right.getPrix() == left.getPrix()){
            return 0;
        }
        else{
            return 1;
        }
    }
}
