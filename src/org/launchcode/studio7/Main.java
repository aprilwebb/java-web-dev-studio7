package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD mixtape = new CD("LaunchCode Album", 4.8, "RW", true);

        DVD movie = new DVD("LaunchCode Movie", 10.2, "RW", false);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        movie.storeData(new Data(7.2, "First Act"));
        movie.storeData(new Data(2.2, "Second Act"));
        movie.storeData(new Data(3.1, "Third Act"));

        movie.spinDisc();

    }
}
