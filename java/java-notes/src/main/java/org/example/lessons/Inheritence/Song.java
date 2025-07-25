package org.example.lessons.Inheritence;

// Song IS A File
// so we want Song to EXTEND File
// Song to be a child class of File
// inherits ALL fields and methods of File

public class Song extends File {
    private int runtime;
    private String artist;

    public Song(String filename, double size, int runtime, String artist) {
        // super is way to call parent constructor
        // we know extension will always be mp3 for Song instance
        super(filename, "mp3", size);

        this.runtime = runtime;
        this.artist = artist;
    }

    public int getRuntime() {
        return runtime;
    }

    public String getArtist() {
        return artist;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRuntimeInMin() {

        return Math.round(this.getRuntime())*60;
    }
}
