import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;
    //Constructor
    public Car(String make,double price,int year,String color ,String[] parts){
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    //Copy Constructor
    public Car(Car source){
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    //Method to Access make
    public String getMake() {
        return make;
    }
    //Method to Access price
    public double getPrice(){
        return price;
    }
    //Method to Access the Year
    public int getYear(){
        return year;
    }
    //Method to Access the color 
    public String getColor(){
        return color;
    }
    public String[] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    //Setters
    public void setMake(String make){
        this.make = make;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setParts(String[] parts){
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    //Methods
    public void drive(){
        System.out.println("You bought the beautiful "+ this.year+ " "+this.color+" "+this.make+
        " "+this.price+".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    public String toString(){
        return "Make : "+this.make + "\n"+
               "Price : "+this.price  + "\n"+
               "Year : "+this.year + "\n"+
               "Color : "+this.color + "\n"+
               "Parts : "+Arrays.toString(Arrays.copyOf(this.parts,this.parts.length)) + "\n"; 
               
    }
}
