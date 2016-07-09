package com.horncatstudios.nuggetsmash.gameengine.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Rectangle;
import com.horncatstudios.nuggetsmash.gameengine.BaseScreen;
import com.horncatstudios.nuggetsmash.gameengine.ScreenManager;
import com.horncatstudios.nuggetsmash.gameengine.ResourceManager;

/**
 * Created by angelina on 2/28/16.
 */
public class SmashScreen extends BaseScreen {

    private Rectangle grumpyCatPosition;

    public SmashScreen( ResourceManager resourceManager, ScreenManager screenManager ) {
        super(resourceManager, screenManager);

        grumpyCatPosition = new Rectangle();
        grumpyCatPosition.x = 640 / 2 - 480 / 2;
        grumpyCatPosition.y = (480 / 2 - 480 / 2) + 20;
    }

    @Override
    public void createScene() {
        mResourceManager.loadSmashResources();
    }

    @Override
    public ScreenManager.ScreenType getSceneType() {
        return null;
    }

    @Override
    public ScreenManager.ScreenType getScreenType() {
        return null;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        mScreenManager.Batch.setProjectionMatrix(camera.combined);

        mScreenManager.Batch.begin();
        mScreenManager.Batch.draw(mResourceManager.grumpyCatImage, grumpyCatPosition.x, grumpyCatPosition.y);
        mScreenManager.Batch.end();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        mResourceManager.disposeSplashResources();
    }
}
