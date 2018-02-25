package tests;

import bridge.EngineOne;
import bridge.EngineTwo;
import bridge.IEngine;
import main.Planet;
import observer.ControlCenter;
import observer.Satellite;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    @Test
    public void testEngine1() {

        IEngine engine1 = new EngineOne();
        assertEquals(1, engine1.speed());
    }

    @Test
    public void testEngine2(){

        IEngine engine2 = new EngineTwo();
        assertEquals(2, engine2.speed());
    }

    @Test
    public void getCorrectSpeedFromEngine(){
        ControlCenter controlCenter = new ControlCenter();
        IEngine engine = new EngineOne();
        Satellite satellite = new Satellite(controlCenter,engine);
        assertEquals(satellite.speed(),1);
    }

    @Test
    public void getCircumfenceOfPlanet(){
        Planet planet = new Planet();
        assertEquals(Math.round(planet.getCircumference()),63);
    }
}
