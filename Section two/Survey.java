import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        System.out.println("Welcome. Thank you for taking the Survey");
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much money did you spent on coffee?");
        double cofeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food");
        double fastFoodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times in a week do you buy cofee");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food");
        int fastFoodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you "+name+" for answering all "+counter+" Questions\n");

        scan.close();


    }
}
