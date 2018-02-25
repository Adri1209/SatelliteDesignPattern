package command;

import observer.Satellite;

public class Distance {
    private int differenceToOrigin;
    private Satellite satellite;

    public Distance (int differenceToOrigin, Satellite satellite){
        this.differenceToOrigin = differenceToOrigin;
        this.satellite = satellite;
    }

    public void move(){

        System.out.println("Move Satellite about " + differenceToOrigin);
        int newposition = satellite.getDistance() + (differenceToOrigin);
        satellite.setDistance(newposition);
    }
}
