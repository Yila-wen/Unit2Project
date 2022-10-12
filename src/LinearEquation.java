import java.lang.Math;
import java.text.DecimalFormat;

public class LinearEquation {
    private int x;
    private int x2;
    private int y;
    private int y2;
    private double slopeInt;
    private double slopeX;
    private double slopeY;
    private double yIntercept;
    private double xIntercept;
    private double distance;

    DecimalFormat dRound = new DecimalFormat("0.00");

    public LinearEquation(int xcoord1, int ycoord1, int xcoord2, int ycoord2) {
        x = xcoord1;
        y = ycoord1;
        x2 = xcoord2;
        y2 = ycoord2;
        slopeX = (x2 - x);
        slopeY = (y2 - y);
        yIntercept();
        distance();
        System.out.println("y = "+ slopeY + "/" + slopeX + "x + " + (int)yIntercept );
        System.out.println((int) yIntercept);
        System.out.println(dRound.format(distance));


    }

    private double slope() {
        slopeInt = (y2 - y) / (x2 - x);
        return slopeInt;
    }
    private double yIntercept(){
        yIntercept = (-(slopeY/slopeX)*x+y);
        return yIntercept;
    }
    private double distance(){
        distance = (double)Math.sqrt((x2-x)*(x2-x) + (y2-y)*(y2-y));
        return distance;
    }




    }
