package org.example.lessons.challenges;

public class BeerSong {

    // constructor
    BeerSong() {}

    public String sing_line(int startLine) {

        if (startLine == 2) {
            String line = startLine + " bottles of beer on the wall, " + startLine+ " bottles of beer.\n" + "Take one down and pass it around, " + (startLine-1)+" bottle of beer on the wall.\n\n";
            return line;

        } else if (startLine == 1) {
            String line = startLine + " bottle of beer on the wall, " + startLine+ " bottle of beer.\n" + "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
            return line;
        } else if (startLine == 0) {
            String line = "No more bottles of beer on the wall, no more bottles of beer.\n" + "Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";
            return line;
        } else {
            String line = startLine + " bottles of beer on the wall, " + startLine+ " bottles of beer.\n" + "Take one down and pass it around, " + (startLine-1) +" bottles of beer on the wall.\n\n";
            return line;
        }


    }

    public String sing(int startLine, int numberLines) {

        String lines = "";

        for (int lineNumber = startLine; lineNumber > startLine-numberLines; lineNumber--) {
            lines += sing_line(lineNumber);
        }
        return lines;

    }

    public String singSong() {
        return sing(99,100);
    }


}