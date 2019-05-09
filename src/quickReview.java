import java.util.Scanner;

public class quickReview
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("TO convert fom celsius to fahrenheit type the celsius degrees you want to Convert:");
        float celsius = userInput.nextFloat();
        float fahrnheit = (9*celsius)/5 + 32;
        System.out.println("The fahrenheit degrees is: "+ fahrnheit);
    }
}
