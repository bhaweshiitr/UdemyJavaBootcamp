import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome! tot the java dealership. ");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option = scan.nextLine();
        switch(option){
            case "a" : 
                System.out.println("what is your Budget ?");
                int budget = scan.nextInt();
                if(budget>10000){
                    System.out.println("Congratunation a Nissan Altima is available for you ");
                    System.out.println("\nDo you have an insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a Driver's Liscence? Write 'yes' or 'no' ");
                    String liscence = scan.nextLine();
                    System.out.println("\nwhat is your credit Score?");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes") && liscence.equals("yes") && creditScore>660){
                        System.out.println("Sold! Pleasure doing business with you .");
                    }else{
                        System.out.println("we're sorry you are not eligible ");
                    }
                }else{
                    System.out.println("We don't sell cars under $10000 ,Sorry!");
                }
            break;
            case "b" : 
                System.out.println("What is your car valued at ?");
                int value = scan.nextInt();
                System.out.println("What is your Selling price?");
                int price = scan.nextInt();
                if(price<value && price<30000){
                    System.out.println("We will buy your car ! Pleasure doing business with you .");
                }else{
                    System.out.println("Sorry! We're not interested ");
                }
            break;
            default : System.out.println("You chose Invalid option "); break;
        }
        scan.close();
    }
}
