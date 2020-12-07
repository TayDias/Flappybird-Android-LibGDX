package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import static com.mygdx.game.Constantes.*;

public class Cano {

    private Texture tex;

    public Rectangle corpo;
    public Rectangle colide;
    public Rectangle push;

    public boolean cima;

    public Cano(float posx, float posy, boolean cima){
        this.cima = cima;
        if(cima){
            corpo = new Rectangle(posx, posy, canow, screeny);
            colide = new Rectangle(posx, posy, canoColide, screeny);
            push = new Rectangle((posx+0.02f), posy, canoPush, screeny);

        } else {
            corpo = new Rectangle(posx, posy-screeny, canow, screeny);
            colide = new Rectangle(posx, posy-screeny, canoColide, screeny);
            push  = new Rectangle(posx, posy-screeny, canoPush, screeny);
        }

        tex = new Texture("cano.png");
    }

    public void draw(SpriteBatch batch){
        batch.draw(tex, colide.x, colide.y, colide.getWidth(), colide.getHeight(),
                0, 0, tex.getWidth(), tex.getHeight(), false, false);
        batch.draw(tex, push.x, push.y, push.getWidth(), push.getHeight(),
                0, 0, tex.getWidth(), tex.getHeight(), false, false);
        batch.draw(tex, corpo.x, corpo.y, corpo.getWidth(), corpo.getHeight(),
                0, 0, tex.getWidth(), tex.getHeight(), false, cima);
    }

    public int update(float time){
        corpo.x += canovelx * time;
        colide.x += canovelx * time;
        push.x += canovelx * time;

        if(corpo.x + corpo.getWidth() < 0){
            return 1;
        }
        return 0;
    }

    public void dispose(){
        tex.dispose();
    }

}
