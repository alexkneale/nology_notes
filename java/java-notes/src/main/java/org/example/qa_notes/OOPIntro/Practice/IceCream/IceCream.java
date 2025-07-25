package org.example.qa_notes.OOPIntro.Practice.IceCream;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IceCream {
    // fields
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    // constructor
    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<String>();
    }

    // methods
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
    public int getNumScoops() {
        return numScoops;
    }

    public void addToppings(String topping) {
        toppings.add(topping);
    }
    public void printToppings() {
        System.out.println(toppings);
    }





}
