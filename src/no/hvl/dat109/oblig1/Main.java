package no.hvl.dat109.oblig1;

public class Main {
    public static void main(String[] args) {


        LadderGame lg1=new LadderGame();
        Thread game=new Thread(lg1);

        game.start();


        /*try{

            LadderGame ladderGame = new LadderGame();

            while(true){
//                do something forever

                if
            }


        }*/

        /*for(int i=0;i<100;i++){
           System.out.println(Dice.throwDice());
        }*/

        //setting the number of players and registering names
//        Player.addPlayers();

//        Board.createBoard();

        /*
        start a game - thread runnning as long as no player has reached field 100?

        */



    }
}