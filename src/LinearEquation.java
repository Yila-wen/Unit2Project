import java.lang.Math;
import java.text.DecimalFormat;

public class LinearEquation {
    private int x;
    private int x2;
    private int y;
    private int y2;
    private double slopeInt;
    private int slopeX;
    private int slopeY;
    private double yIntercept;
    private double distance;

    DecimalFormat dRound = new DecimalFormat("0.00");

    public LinearEquation(String xcoord1, String ycoord1, String xcoord2, String ycoord2) {
        x = Integer.parseInt(xcoord1);
        y = Integer.parseInt(ycoord1);
        x2 = Integer.parseInt(xcoord2);
        y2 = Integer.parseInt(ycoord2);
        slopeX = x2 - x;
        slopeY = y2 - y;
    }

    private double slope() {
        slopeInt =(double)slopeY/ slopeX;
        return slopeInt;
    }

    private double yIntercept() {
        yIntercept = (-((double)slopeY/slopeX) * x + y);
        return yIntercept;
    }

    private double distance() {
        distance = Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
        return distance;
    }
    private String slopeIntForm() {
        if (yIntercept >= 0) {
            return "y = " + slopeY + "/" + slopeX + "x + " + dRound.format(yIntercept());
        } else if (yIntercept < 0) {
            return "y = " + slopeY + "/" + slopeX + "x - " + dRound.format(Math.abs(yIntercept()));
        }
        return null;
    }
    private String pairSetter(int xvalue, int yvalue){
        return "("+xvalue+","+yvalue+")";
    }
    public String coordinatePoint(double xvalue){
        double y3 = (slopeInt * xvalue+yIntercept);
        return "("+dRound.format(xvalue)+","+ dRound.format(y3) +")";

    }

    @Override
    public String toString() {
        String pair =
                "First Pair: " + pairSetter(x,y) + "\n" +
                "Second Pair:  " + pairSetter(x2,y2) + "\n" +
                "Slope of line: " + dRound.format(slope()) + "\n" +
                "Y-Intercept: " + dRound.format(yIntercept()) + "\n" +
                "Slope intercept form: " + slopeIntForm() + "\n" +
                "Distance between points: " + dRound.format(distance());
        return pair;
    }
}

