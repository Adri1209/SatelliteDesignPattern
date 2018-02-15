package observer;

public interface ISatelliteListener {

    void planetIsCircled();
    void resetPosition(int differenceToOrigin, Satellite satellite);
}
