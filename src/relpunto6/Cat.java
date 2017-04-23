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
public class Cat extends Pet {
    private boolean isHunter;

    public Cat(boolean isHunter) {
        this.isHunter = isHunter;
    }

    public boolean getIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }
    
    @Override
    public String sound(){
    return "miauuuuu";
    }
   
}
