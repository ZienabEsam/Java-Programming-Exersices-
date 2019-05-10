import java.util.Scanner;

public class WindChillTemperature
{
    public static void main(String args[])
    {
        //The temperature alone is not enough to know the coldness outside
        //other factors like relative humidity and wind speed affect the calculations
        //this programme calculates the wind chill temperature taking into considirations the other factors
        System.out.println("Type in the temperature outside in range from -58F & 41F \n also " +
                "type in the wind speed in mile per hours greater than or equal 2: ");
        //better t use the same object for less memory use
        Scanner UserInput = new Scanner(System.in);
        float OutsideTemperature = UserInput.nextFloat();
        float WindSpeed = UserInput.nextFloat();
        //Wind chill temperature formula calculation
        double WindChillTemperature = 35.74 + (0.6215*OutsideTemperature) - (35.75*Math.pow(WindSpeed,0.16))+
                (0.4275*OutsideTemperature*Math.pow(WindSpeed,0.16));
        System.out.println("This is the Wind Chill temperature outside: "+WindChillTemperature);
    }
}
