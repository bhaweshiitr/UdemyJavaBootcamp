public class IfElse {
    public static void main(String[] args) {
        int grade = 65;
        if(grade>80){
            System.out.println("You got an A");
        }else if(grade>70){
            System.out.println("you got B");
        }else if(grade>60){
            System.out.println("You got C");
        }else if(grade>50){
            System.out.println("You got D");
        }else{
            System.out.println("Better luck next time");
        }
    }
}
