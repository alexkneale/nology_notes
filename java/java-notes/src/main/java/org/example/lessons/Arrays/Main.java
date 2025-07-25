package org.example.lessons.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // in java its more complicated
        // there are many different types of 'arrays'

        // there are Arrays (standard arrays)
        // fixed size
        // have to declare type (typehinting)
        // items stored in curly brackets (as Array is an object

        String[] names = {"Jeff","Jane","Jenny"};
        // can use index notation, with square brackets
        System.out.println(names[0]);
        // length is a property
        System.out.println(names.length);

        // declare array with indices
        // declare new array with 3 dimensions
        int[] ages = new int[3];
        // fill array
        ages[0] = 20;
        ages[1] = 7;
        ages[2] = 32;

        System.out.println(ages);
        // [I@6acbcfc0 (hash reference, as we're working with objects)

        // if we want to display values, have to access static method from Arrays class
        System.out.println(Arrays.toString(ages));
        // [20, 7, 32]

        // what if i want to put more values in an array?
        // all methods involve making a new copy of the array, with modified values

        int[] newAges = new int[ages.length +1];
        // start copying from index 0 in ages
        // copy to newAges
        // start pasting from index 0 in newAges
        // how many elements you want to copy to newAges (ages.length)
        System.arraycopy(ages, 0, newAges, 0, ages.length);
        System.out.println(Arrays.toString(newAges));
        // [20, 7, 32, 0]
        // as empty spaces default to 0 in int arrays

        // other method
        // Arrays.copyOf
        // create copy with length 4 now
        // then reassign to copied array
        ages = Arrays.copyOf(ages, 4);

        // with for loop
        String colours[] = {"blue","green","yellow"};

        String moreColours[] = new String[colours.length +4];

        for(int i = 0; i < colours.length; i++) {
            moreColours[i] = colours[i];
        }
        System.out.println(Arrays.toString(moreColours));
        //[blue, green yellow, null, null, null, null]

        // multidimensional arrays
        int[][] multiDim = {{1,3},{2,3,4}};

        // can access using double brackets
        System.out.println(multiDim[0][0]);
        // 1

        // looping through
        for (int i = 0; i < multiDim.length; i++) {
            for(int j =0; j< multiDim[i].length; j++) {
                System.out.println(multiDim[i][j]);
            }
        }

        // populating multidim arrays
        int[][][] multiDim2 = new int[3][4][5];
        for(int i = 0; i < multiDim2.length; i++) {
            for(int j = 0; j < multiDim2[i].length; j++) {
                for(int k = 0; k < multiDim2[i][j].length; k++) {
                    multiDim2[i][j][k] = i*j*k;
                }

            }
        }
        // nb have to use deepToString() instead of toString()
        System.out.println(Arrays.deepToString(multiDim2));

    }
}




