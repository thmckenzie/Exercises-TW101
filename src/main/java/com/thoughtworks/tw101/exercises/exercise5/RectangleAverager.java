package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    float totalArea = 0;

    public float averageArea(Rectangle[] rectangles) {
        for(int i= 0; i< rectangles.length; i++){
            totalArea += rectangles[i].area();
        }
        return totalArea/(rectangles.length);
    }
}
