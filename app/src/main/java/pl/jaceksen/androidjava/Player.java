package pl.jaceksen.androidjava;

/**
 * Created by jsen on 20.01.17.
 */

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player(){
        //to jest wywołanie drugiego konstruktora (tego ze Setring handle)
        this("Unknown playerer");
    }

    public Player(String handle){
        handleName = handle;
        lives = 3;
        level = 1;
        score = 0;
    }

    public Player(String handleName, int lives, int level, int score) {
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
}
