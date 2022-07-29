public class ReturnValues {
    public static void main(String[] args) {

        double measure1 = measureRectangle(2.2,4.3,"area");
        double measure2 = measureRectangle(-3.2,4.1,"perimeter");


        stringPrinter(2.2,4.3,measure1,"area");
        stringPrinter(2.2,4.3,measure2,"perimeter");



    }


    public static double measureRectangle(double length , double width , String options){

        if(length<0 || width<0){
            System.out.println("Length and width must be positive ");
            System.exit(0);
        }
        switch(options){
            case "area" : return length * width ; 
            case "perimeter" : return 2*(length + width) ; 
            default : System.out.println("please select the correct option");
        }
        double area = length*width;
        return area;
    }

    public static void stringPrinter(double length , double width , double area , String options){
        System.out.println("The " + options + " of the rectange wtih length "+length+" and width "+width+" is "+area+"\n ");

    }
}
