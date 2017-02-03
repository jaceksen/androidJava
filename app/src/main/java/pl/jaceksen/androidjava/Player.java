package pl.jaceksen.androidjava;

import java.util.ArrayList;

/**
 * Created by jsen on 20.01.17.
 */

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public Player(){
        //to jest wywołanie drugiego konstruktora (tego ze Setring handle)
        this("Unknown playerer");
    }

    public Player(String handle){
        this(handle,1);
        handleName = handle;
        lives = 3;
        level = 1;
        score = 0;
    }

    public Player(String handle, int startingLevel){
        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
//        setDefaultWeapon();
        inventory = new ArrayList<>();
    }

    public Player(String handleName, int lives, int level, int score) {
        this(handleName,1);
        this.handleName = handleName;
        this.lives = lives;
        this.level = level;
        this.score = score;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        //jeżeli handlename krótsze niż 4 znaki to powróć do
        //głównego programu i nie rób nic
        if(handleName.length()<4){
            return;
        }
        this.handleName = handleName;

    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword",10,20);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    public void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot){
        if(this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }
}
