package no.hvl.dat109.oblig1;

public class Piece {

    //   first
    //int 
    private String color;
    private int placement;

    public Piece(){}

    public Piece(int placement, String color){
        this.color=color;
        this.placement=placement;
    }

    public int get() {
        return placement;
    }

    public void set(int placement) {
        this.placement = placement;
    }

    public String getFarge() {
        return color;
    }

    public void setFarge(String farge) {
        this.color = farge;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color='" + color + '\'' +
                ", placement=" + placement +
                '}';
    }
}
