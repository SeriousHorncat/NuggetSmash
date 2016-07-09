package com.horncatstudios.nuggetsmash.gameengine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by angelina on 2/28/16.
 */
public class ResourceManager {

    public ResourceManager() {

    }

    public void loadSharedResources()  {

    }

    //regionSplash Resources
    public Texture ursaRageLogoImage = null;

    public void loadSplashResources() {
        ursaRageLogoImage = new Texture(Gdx.files.internal("logo.png"));
    }
    public void disposeSplashResources() {
        ursaRageLogoImage.dispose();
    }
    //endregion


    //regionSmash Resources
    public Texture grumpyCatImage = null;

    public void loadSmashResources() {
        grumpyCatImage = new Texture(Gdx.files.internal("grumpycat.jpg"));
    }

    public void disposeSmashResources() {
        grumpyCatImage.dispose();
    }
    //endregion
}
