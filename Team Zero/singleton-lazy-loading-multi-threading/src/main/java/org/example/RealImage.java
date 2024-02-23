package org.example;

public class RealImage {
    private String filename;
    private boolean loaded;

    public RealImage(String filename) {
        this.filename = filename;
        this.loaded = false;
    }

    private synchronized void loadFromDisk() {
        if (!loaded) {
            System.out.println("Loading image: " + filename);
            loaded = true;
        }
    }

    public synchronized void display() {
        loadFromDisk();
        System.out.println("Displaying image: " + filename);
    }
}
