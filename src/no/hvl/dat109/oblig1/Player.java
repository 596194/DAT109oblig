package no.hvl.dat109.oblig1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private Piece piece;

    public Player(){}

    public Player(String name, Piece piece) {
        id = count.incrementAndGet();
        this.name = name;
        this.piece=piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", piece=" + piece.toString() +
                '}';
    }

    //list of players, not string
    //set number of players & add players to a ArrayList
    public static ArrayList<Player> addPlayers(){
        ArrayList<Player> players = new ArrayList<Player>();

        //set number of players
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("number of players?");
        int numberOfPlayers=scanNumber.nextInt();

        while(players.size()<numberOfPlayers){

//            register player name
            Player player = new Player();
            Scanner scanName = new Scanner(System.in);
            System.out.println("Player name");
            player.setName(scanName.nextLine());
//            players.add(name);

//            register player piece
            Scanner scanPiece=new Scanner(System.in);
            System.out.println("Choose piece");
            String colour=scanPiece.nextLine();
            Piece piece=new Piece(0, colour);
            player.setPiece(piece);

//            add player to array
            players.add(player);
        }
//        System.out.println(players.toString());
        return players;
    }
}
