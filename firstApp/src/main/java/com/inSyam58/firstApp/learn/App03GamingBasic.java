package com.inSyam58.firstApp.learn;

import com.inSyam58.firstApp.learn.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasic {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext
                        (GamingConfiguration.class)) {

//            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }
    }
}

