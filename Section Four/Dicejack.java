import java.util.Scanner;

public class Dicejack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three integers between 1 and 6 ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1<1 || num2<1 || num3<1){
            System.out.println("Numbers can not be less than 1. Shutting the game");
            System.exit(0);
        }
        if(num1>6 || num2>6 || num3>6){
            System.out.println("Numbers can not be greater than 6. Shutting the game");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3 ;
        int sumDiceRolls = roll1 + roll2 + roll3 ;

        System.out.println("The Dice sum = "+sumDiceRolls + ". and the number sum = "+ sumOfNumbers);

        checkWin(sumDiceRolls , sumOfNumbers );
        // System.out.println(roll1);
        // System.out.println(roll2);
        // System.out.println(roll3);
        

        scan.close();
    }

    public static int rollDice(){
        double roll = Math.random()*6 ;
        roll+=1;
        return (int)roll;
    }

    public static void checkWin(int sumDiceRolls , int sumOfNumbers){
        if(sumOfNumbers>sumDiceRolls && sumOfNumbers-sumDiceRolls<3){
            System.out.println("Congrats! you win ");
        }else{
            System.out.println("Sorry! you lose");
        }
    }
}
