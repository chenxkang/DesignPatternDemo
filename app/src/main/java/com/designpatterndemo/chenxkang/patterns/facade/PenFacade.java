package com.designpatterndemo.chenxkang.patterns.facade;

/**
 * author: chenxkang
 * time  : 17/4/25
 * desc  : 外观类
 */

public class PenFacade {

    private Pen brush;
    private Pen pencil;
    private Pen paint;

    public PenFacade() {
        brush = new Brush();
        pencil = new Pencil();
        paint = new Paint();
    }

    public void brushDraw(){
        brush.draw();
    }

    public void pencilDraw(){
        pencil.draw();
    }

    public void paintDraw(){
        paint.draw();
    }

}
