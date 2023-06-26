package australianspire;

import basemod.interfaces.ScreenPostProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AustraliaPostProcessor implements ScreenPostProcessor
{
    //k but you have to change it up a bit - daddy
    @Override
    public void postProcess(SpriteBatch spriteBatch, TextureRegion textureRegion, OrthographicCamera camera)
    {
        spriteBatch.setColor(Color.WHITE);
        spriteBatch.setBlendFunction(GL20.GL_ONE, GL20.GL_ZERO);
        textureRegion.flip(false, true);
        spriteBatch.draw(textureRegion, 0, 0);
        textureRegion.flip(false, true);
    }

    @Override
    public int priority() {
        return 50;
    }
}