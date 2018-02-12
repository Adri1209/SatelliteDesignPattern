package main;

import bridge.EngineOne;
import bridge.IEngine;
import observer.ControlCenter;
import observer.Satellite;
import random.MersenneTwisterFast;

public class Application {

    public static void main(String[] args){

        MersenneTwisterFast randomizer = new MersenneTwisterFast();
        ControlCenter controlCenter = new ControlCenter();
        IEngine engine1 = new EngineOne();
        Satellite satellite = new Satellite(controlCenter,engine1);
        Planet planet = new Planet();
        long circumference = Math.round(planet.getCircumference());
        while (circumference != satellite.getPosition()){
            if (satellite.getDistance() != 3){
                satellite.wrongPosition(3-satellite.getDistance());
                //TODO Command can set distance of Satellite

            }
            satellite.setPosition(satellite.getPosition()+satellite.speed());
            double random = randomizer.nextDouble();
            if (random <= 0.1){
                int randomInt = randomizer.nextInt(-1,1);
                if (randomInt == 0) randomInt = 1;
                satellite.setDistance(satellite.getDistance()+(randomInt));
            }
            System.out.println("Position: "+satellite.getPosition()+ " Distance to planet: "+ satellite.getDistance());

        }
        satellite.circled();

    }

}
