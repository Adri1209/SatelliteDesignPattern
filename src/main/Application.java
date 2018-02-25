package main;

import bridge.EngineOne;
import bridge.EngineTwo;
import bridge.IEngine;
import observer.ControlCenter;
import observer.Satellite;
import random.MersenneTwisterFast;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        IEngine engine;
        System.out.println("Please choose between Engine one or two by typing the Number: ");
        byte enginenumber = scanner.nextByte();
        if (enginenumber == 1)
            engine = new EngineOne();
        else if (enginenumber == 2)
            engine = new EngineTwo();
        else {
            engine = new EngineOne();
            System.out.println("No Engine chosen! Engine One will be used.");
        }
        MersenneTwisterFast randomizer = new MersenneTwisterFast();
        ControlCenter controlCenter = new ControlCenter();
        Satellite satellite = new Satellite(controlCenter,engine);
        Planet planet = new Planet();
        int circumference = (int) Math.round(planet.getCircumference());                        // Umfang des Planeten wird gerundet
        while (circumference > satellite.getPosition()){                                       //Wird solange durchgeführt, bis Planet umkreist ist
            if (satellite.getDistance() != 3){
                satellite.wrongPosition(3-satellite.getDistance());             // Wenn Distanz nicht korrekt, wird hier die Korrektur durchgeführt
            }
            satellite.setPosition(satellite.getPosition()+satellite.speed());                   // Satellit wird mit Geschwindigkeit des Motors fortbewegt
            double random = randomizer.nextDouble();
            if (random <= 0.1){
                int randomInt = randomizer.nextInt(-1,1);
                if (randomInt == 0) randomInt = 1;                                              // Mit einer Wahrscheinlichkeit von 0,1 wird hier die Distanz zum Planeten verändert
                satellite.setDistance(satellite.getDistance()+(randomInt));
            }
            System.out.println("Position: "+satellite.getPosition()+ " Distance to planet: "+ satellite.getDistance());

        }
        satellite.circled();                                                                    // Satellit hat Planet umkreist

    }

}
