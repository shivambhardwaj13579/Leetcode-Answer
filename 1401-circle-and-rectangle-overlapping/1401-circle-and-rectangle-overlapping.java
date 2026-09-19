class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xi = 0;
        if(xCenter < x1) xi = x1;
        else if(xCenter > x2) xi = x2;
        else xi = xCenter;

        int yi = 0;
        if(yCenter < y1) yi = y1;
        else if(yCenter > y2) yi = y2;
        else yi = yCenter;

        radius = radius * radius;
        int dis = ((xCenter - xi)*(xCenter - xi))+((yCenter - yi)*(yCenter - yi));
        return radius >= dis ? true : false;
    }
}