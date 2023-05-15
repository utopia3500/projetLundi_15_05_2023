package main.java.user;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import main.java.model.Salarier;
import main.java.model.Vetement;
import main.java.model.VetementComparator;

public class Program {

    public static void main(String[] args){

   
        //testSalarier();
        testVetement();

    }

    public static void testVetement(){
        List<Vetement> list = new ArrayList<Vetement>();

        list.add(new Vetement("123456", "Zara", 50.0, 7, "noir"));
        list.add(new Vetement("123465", "Vuitton", 500.0, 4, "rose"));
        list.add(new Vetement("123654", "Salamander", 200.0, 8, "rouge"));
        list.add(new Vetement("321456", "Paraboots", 300.0, 3, "noir"));
        list.add(new Vetement("321654", "Levis", 100.0, 2, "jaune"));

        List<Vetement> listStockMoinsQueCinq = new ArrayList<Vetement>();

        System.out.println();
        System.out.println("--------------- affiche les vetements----------------------------");
        System.out.println();

        afficheTableau(list);

        for (Vetement vet : list){
            if (vet.getQuantite() <= 5){
                listStockMoinsQueCinq.add(vet);
            }
        }

        List<Vetement> listCouleurNoire = new ArrayList<Vetement>();

        for (Vetement vet: list){
            if (vet.getColor().equals("noir")){
                listCouleurNoire.add(vet);
            }
        }

        System.out.println();
        System.out.println("------------------stock moins que 5----------------");
        System.out.println();
        afficheTableau(listStockMoinsQueCinq);

        System.out.println();
        System.out.println("------------------couleur noire---------------------");
        System.out.println();

        afficheTableau(listCouleurNoire);


        System.out.println();
        System.out.println("-------tableau de vetements copié et trié par prix-------");
        System.out.println();

        List<Vetement> copieDeList = new ArrayList<Vetement>();

        for (Vetement vet : list){
            copieDeList.add(vet);
        }

        VetementComparator vc = new VetementComparator();

        Collections.sort(copieDeList, vc);

        afficheTableau(copieDeList);
        System.out.println();

    }

    public static void afficheTableau(List<Vetement> list){
        for (Vetement vet : list){
            System.out.println(vet.toString() + "  ");
        }
    }


    public static void testSalarier(){
        Salarier salarier1 = new Salarier(1, "Fauré", "Gabriel", 3000.0);
        Salarier salarier2 = new Salarier(2, "Rachmaninov", "Serguei", 4000.0);
        System.out.println();
        System.out.println("********************les deux salariés*********************");
        System.out.println();

        System.out.println(salarier1.toString());
        System.out.println(salarier2.toString());

        salarier1.augmenterSalaire(10);

        System.out.println();
        System.out.println("------------ajouter 10% de salarié 1----------------");
        System.out.println();

        System.out.println(salarier1.toString());
        System.out.println(salarier2.toString());

        double salaireTemp1 = salarier1.getSalaire();
        double salaireTemp2 = salarier2.getSalaire();

        salarier1.setSalaire(salaireTemp2);
        salarier2.setSalaire(salaireTemp1);

        System.out.println();
        System.out.println("---------------échanger les salaires des deux salariés------------------");
        System.out.println();

        System.out.println(salarier1.toString());
        System.out.println(salarier2.toString());
    }

}
