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
public abstract class Pet {
    protected String id;
    protected String name;
    protected String haircolor;

//    public Pet(String id, String name, String haircolor) {
//        this.id = id;
//        this.name = name;
//        this.haircolor = haircolor;
//    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHaircolor() {
        return haircolor;
    }
    
    public abstract String sound();
    
    
    
}
