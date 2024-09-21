package com.inSyam58.firstApp.learn;

import com.inSyam58.firstApp.learn.game.GameRunner;
import com.inSyam58.firstApp.learn.game.GamingConsole;
import com.inSyam58.firstApp.learn.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

//
//    //        var game = new MarioGame();
//    var game = new SuperContraGame(); //1. Object creation
//    var game1 = new PacmanGame();
//    var gameRunner = new GameRunner(game1);
//    //2. Object creation + wiring of dependency
//    gameRunner.run();
}
