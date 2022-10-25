/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

class Television {
    private static int nextId = 0;
    private final int id;
    private String brand;
    private  int volume;
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 0;


    public Television() {
        this.id = nextId++;
    }

    public Television(String brand, int volume) {
        this.id = nextId++;
        setBrand(brand);
        setVolume(volume);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static int getNextId() {
        return nextId;
    }

    public String toString() {
        return "Television: brand=" + getBrand() + ", volume=" + getVolume();
    }
}