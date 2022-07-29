public class BuiltInFunctions {
    public static void main(String[] args) {
        double log = Math.log(101.2);
        System.out.println("The logrithm of 101.2 is :"+log);

        double sine = Math.sin(1.2);
        System.out.println("The Sine of 1.2 is: "+sine);

        double power = Math.pow(2,3);
        System.out.println("The vlaue of 2 to the power 3 is: "+(int)power);

        double random = Math.random()*100;
        System.out.println("The random value is : "+random);
    }
}
