package observer;

import bridge.IEngine;

import java.util.ArrayList;

public class Satellite {
    private ISatelliteListener listeners;
    private IEngine engine;

    public Satellite (ISatelliteListener listeners){
        this.listeners = listeners;
    }

    public void circled() {

        listeners.planetIsCircled();
    }

    public void wrongPosition() {

        listeners.resetPosition();
    }

    public int speed (){
        return engine.speed();
    }
}
