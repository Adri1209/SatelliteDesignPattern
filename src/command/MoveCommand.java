package command;

public class MoveCommand implements ICommand {
private Position position;

    public MoveCommand(Position position)
    {
        this.position = position;
    }

    @Override
    public void execute() {
        System.out.println("Move Sattelite");
        position.move();

    }
}
