package command;

public class MoveCommand implements ICommand {
private Position position;
private int differenceToOrigin;

    public MoveCommand(Position position, int differenceToOrigin)
    {
        this.position = position;
        this.differenceToOrigin = differenceToOrigin;
    }

    @Override
    public void execute() {
        System.out.println("Move Sattelite around " + differenceToOrigin);
        position.move(differenceToOrigin);

    }
}
