package observer;

import command.ICommand;
import command.MoveCommand;
import command.Distance;
import command.Remote;

public class ControlCenter implements ISatelliteListener {


    @Override
    public void planetIsCircled() {

        System.out.println("Satellite has circled the Planet!");
    }

    @Override
    public void resetPosition(int differenceToOrigin, Satellite satellite) {

        Remote remote = new Remote();
        Distance distance = new Distance(differenceToOrigin, satellite);
        ICommand move = new MoveCommand(distance);

        remote.setCommand(move);
        remote.pressButton();

    }
}
