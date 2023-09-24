import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {

        int price = 0;
        int shippingCost = 5;
        int total = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price of the item: ");
        price = in.nextInt();


        total = price + shippingCost;
        System.out.println("Your new total is " + total);

        // #2

        int month = 0;

        System.out.println("Enter your birth month: ");
        month = in.nextInt();
        if (month  >= 1 && month <= 12) {
            System.out.println("Your birth month is: " + month);
        } else {
            System.out.println("ERROR");
        }

        //#3

        String afil = "";

        System.out.println("Enter your affiliation: [R D I] ");
        afil = in.next();
        if (afil.equals("R")) {
            System.out.println("You are a Donkey");
        } else if (afil.equals("D")) {
            System.out.println("You are an Elephant");
        } else if (afil.equals("I")) {
            System.out.println("You are a person");
        }

        // #4

        System.out.println("Enter some stuff: ");


        if (in.hasNextInt()) {
            int stuff1 = in.nextInt();
            System.out.println("Input is an int: " + stuff1);
        } else if (in.hasNextDouble()) {
            double stuff2 = in.nextDouble();
            System.out.println("Input is a double: " + stuff2);
        } else {
            System.out.println("Input is not an int or double");
        }

        //#5
        int material = 0;
        String more = "Y";
        int sum = 0;


       while (more.equals("Y")) {
           System.out.println("Please enter cos4t of material: ");
           material = in.nextInt();
           sum = sum + material;
           material = 0;

           System.out.println("Are there more materials? [Y / N]");
           more = in.next();
       }
        System.out.println("The toltal sum is: " + sum);


    }
}