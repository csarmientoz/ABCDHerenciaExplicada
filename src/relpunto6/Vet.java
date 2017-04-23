/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relpunto6;

import java.util.ArrayList;

/**
 *
 * @author CamiloAndrésChavez
 */
public class Vet {

    private ArrayList<Pet> petss;

    public Vet() {
        this.petss = new ArrayList<>();
    }

    public void addPet(Pet pet) {

        this.petss.add(pet);
    }

    public void removePet(Pet pet) {

        this.petss.remove(pet);
    }

    public void showPetsByType(String kind) {
//        Pet dog = new Dog("Pastor Aleman");
//        this.petss.add(dog);
        for (Pet mascota : petss) {
            if (mascota.getClass().getName() == kind) {
                System.out.println(mascota.getName() + " " + mascota.getHaircolor() + " " + mascota.getId());
            }

        }
    }

    public void showPets() {
        for (Pet pet : petss) {
            String breed = "";
            String isHunter = "";
            String weight = "";
            if(pet instanceof Dog)
                breed = ((Dog)pet).getBreed();
            if(pet instanceof Cat)
                isHunter = "Is hunter "+((Cat)pet).getIsHunter();
            if(pet instanceof Hamster)
                weight = ""+((Hamster)pet).getWeight();
            System.out.println(pet.getName() + " " + pet.getHaircolor() + " " + pet.getId() + " " + breed + " " + isHunter + " " + weight );
            
                
        }
    }
}
