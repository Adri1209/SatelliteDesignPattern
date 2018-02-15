package tests;

import bridge.EngineOne;
import bridge.EngineTwo;
import bridge.IEngine;
import org.junit.Test;
import static org.junit.Assert.*;

public class EngineTest {

    @Test
    public void TestEngines() {

        IEngine engine1 = new EngineOne();
        IEngine engine2 = new EngineTwo();
        assertEquals(1, engine1.speed());
        assertEquals(2, engine2.speed());
    }
}
