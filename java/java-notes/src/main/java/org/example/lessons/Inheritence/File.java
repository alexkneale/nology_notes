package org.example.lessons.Inheritence;

public class File {
    // fields
    private String filename;
    private String extension;
    private double size;

    public File(String filename, String extension, double size) {
        this.filename = filename;
        this.extension = extension;
        this.size = size;
    }

    public String getFilename() {
        return filename;
    }

    public String getExtension() {
        return extension;
    }

    public double getSize() {
        return size;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFullFileName() {
        return this.getFilename() + "." + this.getExtension();
    }

}

