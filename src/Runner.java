import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the first x-y coordinate point: ");
        String fCoord = s.nextLine();
        String xcoord1 = fCoord.substring(1,fCoord.indexOf(","));
        String ycoord1 = fCoord.substring(fCoord.indexOf(",")+1 ,fCoord.length()-1);
        System.out.println("Enter the second x-y coordinate point: ");
        String sCoord = s.nextLine();
        String xcoord2 = sCoord.substring(1,sCoord.indexOf(","));
        String ycoord2 = sCoord.substring(sCoord.indexOf(",")+1,sCoord.length()-1);

        LinearEquation new1 = new LinearEquation(xcoord1,ycoord1,xcoord2,ycoord2);
        System.out.println(new1.toString());
        System.out.println("Enter an x value: ");
        double xvalue = s.nextDouble();
        System.out.println("Solved coordinate point is: " + new1.coordinatePoint(xvalue));

    }

}
