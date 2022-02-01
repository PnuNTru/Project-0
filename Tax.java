//calculates total
import java.util.Scanner;
public class Tax
{
    public static void main(String[] args)
    {
        //Initializing
        double Total, Tax, Tip, GTotal, People;
        Scanner value = new Scanner(System.in);
        //Asking for values
        System.out.println("How many people are in your party?");
        People = value.nextDouble();
        System.out.println("What is your total bill before taxes and tip?");
        Total = value.nextDouble();
        //Calculations
        Tax = Total * 0.0725;
        Tip = Total * 0.20;
        GTotal = (Total + Tax + Tip)/People;
        System.out.println("Each person needs to pay: $"+ GTotal);
        value.close();
 }
}