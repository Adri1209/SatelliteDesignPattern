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
    public void resetPosition(int actualPosition, int differenceToOrigin) {

        Remote remote = new Remote();
        Position position = new Position(actualPosition, differenceToOrigin);
        ICommand move = new MoveCommand(position);

        remote.setCommand(move);
        remote.pressButton();

    }
}
