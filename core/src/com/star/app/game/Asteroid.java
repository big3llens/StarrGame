package com.star.app.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.star.app.screen.ScreenManager;

public class Asteroid {

    private Texture texture;
    private Vector2 position;
    private float angel;

    public Asteroid() {
        this.texture = new Texture("asteroid.png");
        this.position = new Vector2(0, MathUtils.random(10, ScreenManager.SCREEN_HEIGHT));
        angel = 350f;
    }

    public void render(SpriteBatch batch) {
        batch.draw(texture, position.x - 128, position.y - 128, 128, 128, 256, 256, 1, 1,
                angel, 0, 0, 256, 256, false, false);
    }

    public void update(float dt) {
        position.x += 200 * dt;

        if (position.x > ScreenManager.SCREEN_WIDTH) position.x = 0;
    }
}
