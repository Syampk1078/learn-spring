package com.inSyam58.firstApp.learn;

import com.inSyam58.firstApp.learn.game.GameRunner;
import com.inSyam58.firstApp.learn.game.PacmanGame;
import com.inSyam58.firstApp.learn.game.SuperContraGame;

public class App01GamingBasic {
    public static void main(String[] args) {

//        var game = new MarioGame();
        var game = new SuperContraGame(); //1. Object creation
        var game1 = new PacmanGame();
        var gameRunner = new GameRunner(game1);
        //2. Object creation + wiring of dependency
        gameRunner.run();
    }
}
