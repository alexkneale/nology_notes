package org.example.lessons.Inheritence;

public class WordDoc extends File {

    private String content;


    public WordDoc(String filename, String extension, double size, String content) {
        super(filename, extension, size);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void trimContent() {
        // remove empty space at beginning and end of content
        this.content = this.content.trim();
    }
}
