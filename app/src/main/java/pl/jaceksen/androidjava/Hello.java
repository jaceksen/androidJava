package pl.jaceksen.androidjava;

/**
 * Created by jsen on 20.01.17.
 */

public class Hello {

    public static void main(String[] args) {

        int lives = 0;

        boolean isGameOver = (lives < 1);

        if(isGameOver){
            System.out.println("Game Over");
        }

        System.out.println("Ala ma kota.");
        System.out.println("Ola ma kota");
    }

}
