package no.hvl.dat109.oblig1;

import java.util.ArrayList;

public class Tile {

    private int number;
//    private Snake snakeHead;
//    private

    public Tile(){}

    public Tile(int number){
        this.number=number;
    }




    public static ArrayList<Tile> createTiles() {
        ArrayList<Tile> fields = new ArrayList<>(100);
        for(int i=1; i<=100; i++){
            fields.add(new Tile(i));
        }

        return fields;
    }


}
