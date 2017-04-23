/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relpunto7;

/**
 *
 * @author CamiloAndrésChavez
 */
public class ABCDMain {
    public static void main(String[] args){
    
        G[] elements={new G(), new F(), new E(), new H()};
        
        for(int i = 0;i<elements.length;i++)
        {
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
    }
}


