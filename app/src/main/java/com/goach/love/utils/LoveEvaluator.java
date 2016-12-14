package com.goach.love.utils;

import android.animation.TypeEvaluator;
import android.graphics.Point;

/**
 * Created by 钟光新 on 2016/7/1 0001.
 */
public class LoveEvaluator implements TypeEvaluator<Point> {
    private Point dirPoint;
    public LoveEvaluator(Point dirPoint){
        this.dirPoint = dirPoint ;
    }
    @Override
    public Point evaluate(float t, Point startValue, Point endValue) {
        //(1 - t)^2 P0 + 2 t (1 - t) P1 + t^2 P2;
        int x = (int)(Math.pow((1-t),2)*startValue.x+2*t*(1-t)*dirPoint.x+Math.pow(t,2)*endValue.x);
        int y = (int)(Math.pow((1-t),2)*startValue.y+2*t*(1-t)*dirPoint.y+Math.pow(t,2)*endValue.y);
        return new Point(x,y);
    }
}
