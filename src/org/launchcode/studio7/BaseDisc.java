package org.launchcode.studio7;

public abstract class BaseDisc {

    private String discName;
    private int discCapacity;
    private int yearReleased;
    private int storageLimit;
    private int runTime;
    private String genre;
    private String title;
    private double storageAmountUsed;
    private static final int STORAGELIMIT = 700;
    private boolean compatible = false;
    private String deviceType;

    public BaseDisc(String discName, int discCapacity, int yearReleased) {
        this.discName = discName;
        this.discCapacity = discCapacity;
        this.yearReleased = yearReleased;
    }

    public void reportDiscInformation(){
        System.out.println("Disc name: " + discName + "\nDisc capacity: " + discCapacity +"\nYear released: " + yearReleased);
    }

    public boolean checkCompatibility(String device){
        // code to check compatibility
        System.out.println(compatible);
        return compatible;
    }

    public void skipTract(){
        //code to skip to next tract
    }


    //Getters and Setters
    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public int getDiscCapacity() {
        return discCapacity;
    }

    public void setDiscCapacity(int discCapacity) {
        this.discCapacity = discCapacity;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public int getStorageLimit() {
        return storageLimit;
    }

    public void setStorageLimit(int storageLimit) {
        this.storageLimit = storageLimit;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getStorageAmountUsed() {
        return storageAmountUsed;
    }

    public void setStorageAmountUsed(double storageAmountUsed) {
        this.storageAmountUsed = storageAmountUsed;
    }

    public boolean isCompatible() {
        return compatible;
    }

    public void setCompatible(boolean compatible) {
        this.compatible = compatible;
    }
}
