import java.util.Arrays;

public class Dealership {
    Car[] cars ;

    public Dealership(Car[] cars){
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
        

    }
    //setter
    public void setCar(Car car,int index){
        this.cars[index] = new Car(car);

    }
    public Car getCar(int index){
        return new Car( this.cars[index]);
    }

    //Method 
    public void sell(int index){
        (this.cars[index]).drive();
        this.cars[index] = null;
    }
    public String search(String make , int budget){
        for(Car i: this.cars){
            if(i==null){
                continue;
            }else if(i.getMake().equals(make) && i.getPrice()<=budget){
                return "\nWe found one : \n"+i.toString()+"\nAre you Interested?\n";
            }
        }
        
        return "Sorry!, We couldn't find any cars for you";
    }

    public String toString(){
        String temp= "";
        for (int i = 0; i < this.cars.length; i++) {
            if(this.cars[i]==null){
                temp+="Parking Spot : "+(i+1) +"\n";
                temp+="null" + "\n";
            }else{
                temp+="Parking Spot : "+(i+1) +"\n";
                temp+=this.cars[i].toString() + "\n";
            }

            
        }
        return temp;
    }
}
