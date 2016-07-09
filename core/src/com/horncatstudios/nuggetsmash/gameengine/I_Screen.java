package com.horncatstudios.nuggetsmash.gameengine;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;

/**
 * Created by angelina on 2/28/16.
 */
public interface I_Screen extends Screen, InputProcessor {

    public ScreenManager.ScreenType getScreenType();

    public void setCustom( final String event );
}
