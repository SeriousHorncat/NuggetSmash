package com.horncatstudios.nuggetsmash;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.horncatstudios.nuggetsmash.gameengine.ResourceManager;
import com.horncatstudios.nuggetsmash.gameengine.ScreenManager;

public class NuggetSmashGame extends Game {
	SpriteBatch batch;

	ResourceManager resourceManager = null;
	ScreenManager screenManager = null;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Gdx.app.setLogLevel(Gdx.app.LOG_DEBUG);

		resourceManager = new ResourceManager();
		screenManager = new ScreenManager(resourceManager, batch, this);

		screenManager.loadSplashScreen();
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}
}
