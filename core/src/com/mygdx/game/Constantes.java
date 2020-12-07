package com.mygdx.game;

import com.badlogic.gdx.Gdx;

public class Constantes {

    public static int screenx = Gdx.graphics.getWidth();
    public static int screeny = Gdx.graphics.getHeight();

    public static float canoSizes[] = {0.15f, 0.20f, 0.25f};

    public static float canovelx = -0.3f*screenx;

    public static int pasrad = (int)(0.06f*screeny);

    public static int pasInix = (int)(0.2f*screenx);

    public static float decVely = screeny/1.5f;

    public static float impulso = screeny/5;

    public static int canow = (int)(canoSizes[0]*screenx);

    public static int canoColide = (int)(0.02f*screenx);

    public static int canoPush = (int)(((canoSizes[0])-0.02f)*screenx);

    public static float timecanos = 3f;

    public static int posMax = (int)(0.7f*screeny);

    public static int gap = (int)(0.2f*screeny);

    public static int btnSize = (int)(0.4f*screenx);
    public static int btnx = (int)(0.3f*screenx);
    public static int btny = (screeny -btnSize)/2;
}
