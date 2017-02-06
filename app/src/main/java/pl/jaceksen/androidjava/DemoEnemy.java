package pl.jaceksen.androidjava;

/**
 * Created by jsen on 06.02.17.
 */

public class DemoEnemy {

    public static void main(String[] args) {

        Enemy enemy = new Enemy("test enemy",10,3);
        enemy.showInfo();

        enemy.takeDamage(3);
        enemy.showInfo();

        enemy.takeDamage(11);
        enemy.showInfo();

    }
}
