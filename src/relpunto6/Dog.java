/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relpunto6;

/**
 *
 * @author CamiloAndrésChavez
 */
public class Dog extends Pet{
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

   

    public String getBreed() {
        return breed;
    }



    @Override
    public String sound() {
        return "wow wow";
    }
    
}
