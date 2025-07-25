package org.example.qa_notes.OOPIntro.Practice.IceCream;

public class IceCreamDemo {
    public static void main(String[] args) {

        IceCream susy = new IceCream("Susan", 2, 3);
        susy.addToppings("butter");
        susy.printToppings();
        susy.addToppings("Rainbow");
        susy.printToppings();
        System.out.println(susy.getCost());
        System.out.println(susy.getNumScoops());
        System.out.println(susy.getName());



    }

}
