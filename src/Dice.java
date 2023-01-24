public class Dice {

    //   first
    //random 1-6

    //produces a random value 1-6
    public static int throwDice(){
        return (int) Math.floor(Math.random() * 6 + 1);
    }


    //   second
    //om 6, kast på nytt
    //om 3x6, tilbake til 1
    //om tilbake til 1, må ha 6 for å komme videre
}
