package com.example.spaceinvaders;

import com.example.spaceinvadersapp.Sprite;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.Random;

public class HelloApplication extends Application {

    private Pane pane = new Pane();


    private Sprite player = new Sprite(300, 750, 40, 40, "player", Color.BLUE);
    private List<Sprite> sprites = new ArrayList<>();

    private boolean aPressed = false;
    private boolean dPressed = false;
    private boolean spacePressed = false;

    private Random random = new Random();


    private double t = 0;
    private double coolDownTime = 0;
    private boolean weaponActive = true;

    @Override
    public void start(Stage stage) throws IOException {

        pane.setPrefSize(600, 800);
        pane.getChildren().add(player);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                update();
            }
        };


        for (int i = 0; i < 5; i++) {
            Sprite sprite = new Sprite(90 + i * 100, 150, 30, 30, "enemy", Color.RED);
            sprites.add(sprite);
            pane.getChildren().add(sprite);
        }
        timer.start();

        Scene scene = new Scene(pane);


        scene.setOnKeyPressed(e -> {
            KeyCode keycode = e.getCode();

            if (keycode == KeyCode.A) {
                aPressed = true;
            } else if (keycode == KeyCode.D) {
                dPressed = true;
            } else if (keycode == KeyCode.SPACE) {
                spacePressed = true;
            }
        });

        scene.setOnKeyReleased(e -> {
            KeyCode keycode = e.getCode();

            if (keycode == KeyCode.A) {
                aPressed = false;
            } else if (keycode == KeyCode.D) {
                dPressed = false;
            } else if (keycode == KeyCode.SPACE) {
                spacePressed = false;
            }
        });

        stage.setScene(scene);
        stage.setTitle("Space Invaders");
        stage.show();
    }

    public void shoot(Sprite sprite) {
        double beamX = sprite.getTranslateX() + 20;
        double beamY = sprite.getTranslateY();
        Sprite beam = new Sprite(beamX, beamY, 5, 20, sprite.type + "beam", Color.BLACK);
        sprites.add(beam);
        pane.getChildren().add(beam);
    }

    public void update() {
        t += 0.016;

        //Add time to cool down if weapon inactive
        if (!weaponActive) {
            coolDownTime += 0.016;
        }
        //Check if weapon should be reactivated
        if (coolDownTime > 0.1) {
            weaponActive = true;
            coolDownTime = 0;
        }
        //check if player moves left
        if (aPressed) {
            player.moveLeft();
        }
        //check if player moves right
        if (dPressed) {
            player.moveRight();
        }
        //check if player shoots
        if (spacePressed) {
            if (!player.dead && weaponActive) {
                shoot(player);
                weaponActive = false;
            }
        }
        //moves the beams
        for (int i = 0; i < sprites.size(); i++) {
            Sprite sprite = sprites.get(i);
            if (sprite.type == "enemy") {
                if (t > 2) {
                    if (Math.random() < 0.03) {
                        shoot(sprite);
                    }
                }
            } else if (sprite.type.equals("playerbeam")) {
                sprite.moveUp();
                for (int j = 0; j < sprites.size(); j++) {
                    Sprite enemySprite = sprites.get(j);
                    if (sprites.get(j).type.equals("enemy")) {
                        boolean collisionCheck = sprite.getBoundsInParent().intersects(enemySprite.getBoundsInParent());
                        if (collisionCheck) {
                            enemySprite.dead = true;
                            sprite.dead = true;
                        }
                    }

                }

            } else if (sprite.type.equals("enemybeam")) {
                sprite.moveDown();
                boolean collisionCheck = sprite.getBoundsInParent().intersects(player.getBoundsInParent());
                if (collisionCheck) {
                    player.dead = true;
                    sprite.dead = true;
                }
            }
        }
        //moves enemies down a chunk randomly
        for(int i = 0; i < sprites.size(); i++){
            Sprite currentSprite = sprites.get(i);
            if(currentSprite.type == "enemy"){
                double moveEnemyChance = random.nextDouble();
                if(moveEnemyChance < 0.05){
                    currentSprite.moveDown();
                }
            }
        }
        //removes the dead
        for (int i = 0; i < sprites.size(); i++) {
            if (sprites.get(i).dead) {
                sprites.remove(i);
                pane.getChildren().removeIf(n -> {
                    Sprite s = (Sprite) n;
                    return s.dead;
                });
                i--;
            }
        }

    }

    public static void main(String[] args) {
        launch();
    }
}