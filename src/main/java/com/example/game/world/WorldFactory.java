package com.example.game.world;

import com.example.game.actors.Actor;
import com.example.game.actors.ActorManager;
import com.example.game.actors.Prop;
import javafx.scene.paint.Color;

public class WorldFactory
{
    public static World createWorld(String worldName) {
        World world = new World(worldName);

        switch (worldName) {
            case "Level1":
                setupLevel1(world);
                break;
            case "Level2":
                setupLevel2(world);
                break;
        }

        return world;
    }

    private static void setupLevel1(World world) {
        ActorManager actorManager = world.getActorManager();

        Actor obstacle1 = new Actor(200, 200, 50, 50);
        actorManager.addActor(obstacle1);


    }

    private static void setupLevel2(World world) {
        ActorManager actorManager = world.getActorManager();

        //base
        Actor obstacle1 = new Actor(-150, 500, 1000, 75);
        actorManager.addActor(obstacle1);

        //first row of platforms
        Actor obstacle2 = new Actor(0, 380, 200, 20);
        actorManager.addActor(obstacle2);

        Actor obstacle3 = new Actor(500, 380, 200, 20);
        actorManager.addActor(obstacle3);

        //second row
        Actor obstacle4 = new Actor(220, 290, 260, 20);
        actorManager.addActor(obstacle4);

        //coin for testing purposes
        Actor coin = new Prop(220, 230, 50, 50,"Coin");
        actorManager.addActor(coin);

        //third row
        Actor obstacle5 = new Actor(0, 200, 100, 20);
        actorManager.addActor(obstacle5);

        Actor obstacle6 = new Actor(600, 200, 100, 20);
        actorManager.addActor(obstacle6);

        Actor chest = new Prop(600, 150, 50, 50,"Crate");
        actorManager.addActor(chest);
    }
}
