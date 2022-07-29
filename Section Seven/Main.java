import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] parts = {"Tyres","Keys"};

        Car[] cars = new Car[] {
            new Car("Nissan",5000,2020,"red",parts),
            new Car("Dodge",11000,2020,"Blue",parts),
            new Car("Nissan",5000,2020,"yellow",new String[] {"Types","Filters"}),
            new Car("Honda",7000,2020,"yellow",new String[] {"Types","Filters"}),
            new Car("Mercedes",12000,2020,"yellow",new String[] {"Types","Filters","Transmission"})
        };

        
        
        Dealership dealership = new Dealership(cars);

        
    //    dealership.sell(0);

       System.out.println(dealership.search("Dodge", 18000));

       System.out.println(dealership);



        
    }
}