package org.example.lessons.Inheritence;

public class Main {
    public static void main(String[] args) {
        // inheritence
        // a parent class can pass down traits (fields and methods)
        // DRY

        File myFile = new File("test", "txt", 12);
        Song mySong = new Song("song", 240, 240,"Bob D");
        WordDoc myDoc = new WordDoc("doc", "txt", 300, "Dark and stromy night");
        System.out.println(mySong.getFullFileName());
        System.out.println(mySong.getRuntimeInMin());
        // but File doesn't have access to child methods
        // System.out.println(myFile.getRuntimeInMin());

        // Upcasting and Downcasting

        // our inheritence hierarchy
        // Object -> File -> Song
        // Object -> File -> WordDoc

        // Upcasting
        // Casting a child class instance as an instance of one of its parents/grandparents
        // Safe, as we're always essentially downgrading (losing properties)

        // create new File instance which is upcast to WordDoc instance
        File myNewDoc = myDoc;
        myNewDoc.getExtension();
        // but can't access to methods that were exclusively in child class, as we've been casted to parent class
        // myNewDoc.trimContent();

        // NB in above example we've created a binding between myNewDoc and myDoc
        // so if we change field in myNewDoc, will affect myDoc
        myNewDoc.setExtension("pdf");
        System.out.println(myDoc.getExtension());
        // "pdf"


        // Donwcasting
        // Casting a parent class instance as a child class instance
        // tricky/unsafe as child class can have more properties/methods than parent

        // Casting is useful when dealing with arrays
        //


    }
}
