package command;

public class MoveCommand implements ICommand {
private Position position;

    public MoveCommand(Position position)
    {
        this.position = position;
    }

    @Override
    public void execute() {
        position.move();

    }
}
