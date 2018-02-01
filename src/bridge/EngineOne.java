package bridge;

public class EngineOne implements IEngine {
    private final int speed = 1;

    @Override
    public int speed() {
        return speed;
    }
}
