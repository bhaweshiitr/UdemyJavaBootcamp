import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers on the Same Line \n");
        String num1 = scan.nextLine();
        // int num2 = scan.nextInt();

        System.out.println("Enter two ling Integers on the Same Line \n");
        String bigNum1 = scan.nextLine();
        // long bigNum2 = scan.nextLong();

        System.out.println("Enter two Decimals on the Same Line \n");
        String decimal1 = scan.nextLine();
        // double decimal2 = scan.nextDouble();

        System.out.println("Enter two Texts  on the Same Line \n");
        String text1 = scan.nextLine();
        // String text2 = scan.next();

        scan.close();

        System.out.println("\tThe integers are : "+num1);
        System.out.println("\tThe Big Integers are : "+bigNum1);
        System.out.println("\tThe decimals are : "+decimal1);
        System.out.println("\tThe Texts are : "+text1);
    }
}
