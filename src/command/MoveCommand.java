package command;

public class MoveCommand implements ICommand {
private Distance position;

    public MoveCommand(Distance position)
    {
        this.position = position;
    }

    @Override
    public void execute() {
        position.move();

    }
}
