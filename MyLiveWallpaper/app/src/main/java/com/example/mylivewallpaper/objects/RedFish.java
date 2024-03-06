package com.example.mylivewallpaper.objects;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.example.mylivewallpaper.painter.Painter;

import kotlin.Triple;
public class RedFish extends Fish {

    public RedFish(int x, int y, Triple<Bitmap, Bitmap, Bitmap> bitmapTriple) {
        this.x = x;
        this.y = y;
        this.vx = 3;
        this.vy = 1;
        this.bitmapTriple = bitmapTriple;
    }

    @Override
    public void moveX(Canvas canvas) {
        if (x - radius < -200) {
            x = canvas.getWidth() + 10;
        }
        if (Painter.top < canvas.getHeight() - 500) x -= vx;
    }
}
