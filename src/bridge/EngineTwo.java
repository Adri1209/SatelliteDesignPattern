package bridge;

public class EngineTwo implements IEngine {
    private final int speed = 2;

    @Override
    public int speed() {
        return speed;
    }
}
