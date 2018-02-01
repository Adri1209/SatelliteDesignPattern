package main;

public class Planet {
    private final int diameter = 20;

    public double getCircumference(){
        return 2*Math.PI*(diameter/2);
    }
}
