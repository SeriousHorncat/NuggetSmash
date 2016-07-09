package com.horncatstudios.nuggetsmash.gameengine;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.horncatstudios.nuggetsmash.gameengine.screens.SmashScreen;
import com.horncatstudios.nuggetsmash.gameengine.screens.SplashScreen;

/**
 * Created by angelina on 2/28/16.
 */
public class ScreenManager {
    private BaseScreen splashScreen = null;
    private BaseScreen smashScreen = null;

    //! Current screen in display
    private I_Screen mCurrentScreen;

    private ResourceManager mResourceManager;
    public  SpriteBatch Batch;

    public ScreenManager( ResourceManager resourceManager, SpriteBatch batch, Game game ) {
        mResourceManager = resourceManager;
        Batch = batch;
        mGame = game;
    }

    //! base libGDX game used for displaying screens.
    private Game mGame = null;

    public enum ScreenType {
        SPLASH,
        SMASH
    }

    /**
     * Sets the current screen according to \a screenType.
     */
    public void setScreen(ScreenType screenType ) {
        switch (screenType) {
            case SPLASH:
                loadSplashScreen();
                break;
            case SMASH:
                loadSmashScreen();
                break;
            default:
                break;
        }
    }

    private void setScreen(BaseScreen screen ) {
        mCurrentScreen = screen;
        mGame.setScreen(mCurrentScreen);
    }

    public void loadSplashScreen() {
        if( null == splashScreen ) {
            splashScreen = new SplashScreen(mResourceManager, this);
        }

        setScreen(splashScreen);
    }

    private void disposeSplashScreen() {
        splashScreen.dispose();
        splashScreen = null;
    }

    public void loadSmashScreen() {
        this.mResourceManager.loadSmashResources();
        if( null == smashScreen ) {
            smashScreen = new SmashScreen(mResourceManager, this);
        }

        setScreen(smashScreen);
    }

    private void disposeSmashScreen() {
        smashScreen.dispose();
        smashScreen = null;
    }
}
