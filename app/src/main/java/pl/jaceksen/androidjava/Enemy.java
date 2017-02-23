package pl.jaceksen.androidjava;

/**
 * Created by jsen on 06.02.17.
 */

public class Enemy {

    private String name;
    private int hitPoints;
    private int lives;

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    public void takeDamage(int damage){
        int remainingHitpoints = this.hitPoints - damage;
        if(remainingHitpoints > 0) {
            setHitPoints(remainingHitpoints);
            System.out.println("I took " + damage + " points damage, and have " + remainingHitpoints + " left.");
        } else {
            this.lives = this.lives - 1;
            if(lives >0){
                System.out.println("I've lost a life " + this.lives + " lives left.");
            } else {
                System.out.println("No lives left, I'm dead.");
            }

        }
    }

    public void showInfo(){
        System.out.println("Name: "  + this.name);
        System.out.println("Hitpoints: " + this.hitPoints);
        System.out.println("Lives: " + this.lives);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
