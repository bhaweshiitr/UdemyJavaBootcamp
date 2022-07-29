public class DocComments {
    public static void main(String[] args) {
        
    }

    /*
     * Function Name : greets 
     * 
     * 
     * Inside The Function : it prints 'Hi' 
     */
    public static void greets(){
        System.out.println("Hi");
    }

    /**
     * 
     * Function Name : printText
     * 
     * @param name (String)
     * @param age (int)
     * 
     * Inside the function 
     *   1. This function prints name and age as part of the texts 
     */
    public static void printText(String name,int age){
        System.out.println("Hi I'm "+name+" and I'm "+age+" years old.");
    }


    /**
     * Function name : calculateArea
     * 
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     * 
     * Inside the function :
     *  1. This function calculates the area and returens it.
     */
    public static double calculateArea(double length , double width){
        double area = length * width ;
        return area;
    }
}
