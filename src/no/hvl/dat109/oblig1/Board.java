package no.hvl.dat109.oblig1;

import java.util.ArrayList;

import static no.hvl.dat109.oblig1.Tile.createTiles;

public class Board {



    public Board(){}

//    @Override
//    public String toString() {
//        for(int i=0;i<10;i++){
//            for(int j=0;j<10;j++){
//
//            }
//        };
//    }

    public static ArrayList<Tile> createBoard(){
        ArrayList<Tile> fields = createTiles();



//        add snakes
//        snake(tile x, tile y)

//        add ladders
//        ladder (tile x, tile y)

//        add winning field
//        tile(100)

        return fields;


    }

//    show where the player's piece is at




}
