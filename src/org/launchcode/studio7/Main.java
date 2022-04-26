package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Blue Moon", 700, 1985 );
        DVD dvd = new DVD("Strawberry Moon", 700, 1990);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.reportDiscInformation();
        dvd.reportDiscInformation();
    }
}
