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
        System.out.println(player.getWeapon().getName().toUpperCase());


        player.setHandleName("Tom");
        System.out.println(player.getHandleName());

        Player player2 = new Player();
        System.out.println("\nPlayer2: " + player2.getHandleName());

        Player player3 = new Player();
        System.out.println("\nPlayer3: " + player3.getHandleName());
        System.out.println(player3.getWeapon().getName());

//        Weapon timsWeapon = player.getWeapon();
//        System.out.println(timsWeapon.getName());

        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        player.setWeapon(myAxe);
        System.out.println(player.getWeapon().getName());


    }
}
