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
public class Hamster extends Pet {

    private double weight;

    public Hamster(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String sound() {
        return "roeeeeer";
    }
}
