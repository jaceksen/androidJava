package pl.jaceksen.androidjava;

/**
 * Created by jsen on 21.01.17.
 */

public class Demo {

    public static void main(String[] args) {
        Player player = new Player("Jacek",10,1,100);
        System.out.println(player.getHandleName());
        player.setHandleName("Rima");
        System.out.println(player.getHandleName());
        player.setHandleName("Tom");
        System.out.println(player.getHandleName());

        Player player2 = new Player();
        System.out.println("Player2: " + player2.getHandleName());
    }
}
