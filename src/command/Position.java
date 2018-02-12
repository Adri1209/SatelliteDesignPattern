package command;

public class Position {
    private int actualposition;
    private int differenceToOrigin;

    public Position (int actualposition, int differenceToOrigin){
        this.actualposition = actualposition;
        this.differenceToOrigin = differenceToOrigin;
    }

    public void move(){

        actualposition += (differenceToOrigin);
    }
}
