package observer;

public interface ISatelliteListener {

    void planetIsCircled();
    void resetPosition(int actualPosition, int differenceToOrigin);
}
