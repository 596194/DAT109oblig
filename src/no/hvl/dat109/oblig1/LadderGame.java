package no.hvl.dat109.oblig1;

import java.util.ArrayList;

public class LadderGame implements Runnable{

    private boolean running = false;
    private boolean haveWinner = false;


    @Override
    public void run() {
        running = true;
        System.out.println("Game is starting");

//        create board
//        change to Board
        ArrayList<Tile> board = Board.createBoard();

//        register players & pieces
        ArrayList<Player> players = Player.addPlayers();


//        start game
        board.toString();



//        while(board[99]){
//
//
//
//            }


        haveWinner=true;

    }

    public boolean isRunning(){
        return running;
    }
    public boolean haveWinner(){
        return haveWinner;
    }

}
