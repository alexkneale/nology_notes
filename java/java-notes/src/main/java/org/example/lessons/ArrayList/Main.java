package org.example.lessons.ArrayList;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList
        // How are they different from Arrays?
        // Arrays are fixed length --> a real pain
        // can create a length aware array (see class), but also a bit of a pain
        // essentially what javascript does --> arrays (under the hood) have lots of empty indices ready to be populated
        // then increase array size with empty space, when array becomes full

        // syntax:
        // ArrayList<{Type}> {NameofArrayList} = new ArrayList<{Type}>();
        ArrayList<String> names = new ArrayList<String>();

        // ArrayList has TONS of methods for dealing with them
        
        names.add("Jeff");
        // index at which to add
        names.add(0,"Jenna");
        System.out.println(names);

        // NB
        // CANNOT have array list of PRIMITIVE TYPE
        // if you want an array of integers --> use type which is wrapper of int type
        ArrayList<Integer> numbers = new ArrayList<Integer>();

    }
}
