package command;

public class Position {
    private int actualposition;

    public Position (int actualposition){
        this.actualposition = actualposition;
    }

    public void move(int differenceToOrigin){

        actualposition += (differenceToOrigin);
    }
}
