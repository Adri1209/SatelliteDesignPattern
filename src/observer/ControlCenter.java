package observer;

import command.ICommand;
import command.MoveCommand;
import command.Position;
import command.Remote;

public class ControlCenter implements ISatelliteListener {


    @Override
    public void planetIsCircled() {

        System.out.println("Satellite has circled the Planet!");
    }

    @Override
    public void resetPosition(int differenceToOrigin, Satellite satellite) {

        Remote remote = new Remote();
        Position position = new Position(differenceToOrigin, satellite);
        ICommand move = new MoveCommand(position);

        remote.setCommand(move);
        remote.pressButton();

    }
}
