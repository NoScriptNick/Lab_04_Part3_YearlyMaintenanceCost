import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double summer;
        double winter;
        double spring;
        double fall;
        double total;

        System.out.println("Please enter the maintenance cost of summer: ");
        summer = scan.nextDouble();
        System.out.println("Please enter the maintenance cost of winter: ");
        winter = scan.nextDouble();
        System.out.println("Please enter the maintenance cost of spring: ");
        spring = scan.nextDouble();
        System.out.println("Please enter the maintenance cost of fall: ");
        fall = scan.nextDouble();
        total = summer + winter + spring + fall;
        System.out.println("The total yearly cost of your home is $" + total);
    }
}