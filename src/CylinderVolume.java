import java.util.Scanner;

public class CylinderVolume
{
    public static void main(String args[])
    {
        System.out.println("Type in the Cylinder radius and length in centimeter: ");
        //Let the user type the radious and the length of the cylinder to calculate the area and the volume
        Scanner UserInput = new Scanner(System.in);
        float radius = UserInput.nextFloat();
        float length = UserInput.nextFloat();
        double area = radius * radius* Math.PI;
        double volume = area * length;
        System.out.println("The area of the Cylinder is:" + area +"\n" + "the volume" +
                "of the Cylinder is: "+ volume);
    }
}
