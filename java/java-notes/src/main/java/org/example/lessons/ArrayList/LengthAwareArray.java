package org.example.lessons.ArrayList;

public class LengthAwareArray {
    // fields

    private int[] data;
    // cushion --> 'empty' data space
    private int bufferSize;
    private int length = 0;

    public LengthAwareArray() {
        this.data = new int[this.bufferSize];
        this.bufferSize = 5;
        this.length = 0;
    }

    // method for doubling buffer size, when array becomes fully populated

    private void resizeBuffer() {

        this.bufferSize *= 2;
        int[] temporaryArray = new int[this.bufferSize];
        int i = this.data.length;
        while(i-- != 0) {
            temporaryArray[i] = this.data[i];
        }

        this.data = temporaryArray;
    }
    // method for adding to array
    public void add(int item) {
        // here we increase length each time item added
        this.data[this.length++] = item;
        // check if length has reached buffer size
        if(this.length == this.bufferSize) {
            this.resizeBuffer();
        }
    }

    // function to get an array
    public int get(int index) {
        return this.data[index];
    }







}


