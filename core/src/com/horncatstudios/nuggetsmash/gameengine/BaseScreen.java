package com.horncatstudios.nuggetsmash.gameengine;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.Gdx;

/**
 * Created by angelina on 2/28/16.
 */
public abstract class BaseScreen implements I_Screen {

    public OrthographicCamera camera;
    protected ScreenViewport mScreenViewport;

    protected ResourceManager mResourceManager;
    protected ScreenManager mScreenManager;

    public BaseScreen(ResourceManager resourceManager, ScreenManager screenManager) {

        mResourceManager = resourceManager;
        mScreenManager = screenManager;

        camera = new OrthographicCamera();

        if (Gdx.graphics.getWidth() > 800) {
            camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        } else {
            camera.setToOrtho(false, 800, 600);
        }

        mScreenViewport = new ScreenViewport(camera);

        createScene();
    }

    public abstract void createScene();

    public abstract ScreenManager.ScreenType getSceneType();

    public void setCustom(final String event) {
    }

    @Override
    public void resize(int width, int height) {
        mScreenViewport.update(width, height);
    }
}
