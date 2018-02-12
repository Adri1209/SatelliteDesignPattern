package observer;

import bridge.IEngine;

import java.util.ArrayList;

public class Satellite {
    private ISatelliteListener listeners;
    private IEngine engine;
    private int distance;
    private int position;

    public Satellite (ISatelliteListener listeners, IEngine engine){
        this.listeners = listeners;
        this.engine = engine;
        this.distance = 3;
        this.position = 0;
    }

    public void circled() {

        listeners.planetIsCircled();
    }

    public void wrongPosition(int differenceToOrigin) {

        listeners.resetPosition(this.distance,differenceToOrigin);
    }

    public int speed (){
        return engine.speed();
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
