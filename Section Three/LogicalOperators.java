public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
        String language = "Java";
        if(chemistryGrade>75 || englishGrade>75 || language.equals("Java")){
            System.out.println("congratulation you got the scholarship ");
        }else{
            System.out.println("We'r sorry , you did not get the scholarship ");
        }
    }
}
