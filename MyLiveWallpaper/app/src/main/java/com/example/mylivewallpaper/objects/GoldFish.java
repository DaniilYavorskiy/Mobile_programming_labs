package com.example.mylivewallpaper.objects;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.example.mylivewallpaper.painter.Painter;

import kotlin.Triple;
public class GoldFish extends Fish {

    public GoldFish(int x, int y, Triple<Bitmap, Bitmap, Bitmap> bitmapTriple)
    {
        this.x = x;
        this.y = y;
        this.vx = 3;
        this.vy = 1;
        this.bitmapTriple = bitmapTriple;
    }

    @Override
    public void moveX(Canvas canvas)
    {
        if (x + radius > canvas.getWidth() + 20) {
            x = -200;
        }
        if (Painter.top < canvas.getHeight() - 500) x += vx;
    }
}
