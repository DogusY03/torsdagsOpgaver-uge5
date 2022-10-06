package Task1;

public class Main {
public static void main (String[] args){
    Car car = new Car("suzuki", "Swift", 2016, "limousine");
    Car car2 = new Car("Mercedes", "AMG c-klasse", 2022, "Coupe");
    Driver driver = new Driver("Jeppe", 31);




    car.setDriver(driver);
    car2.setDriver(driver);

    System.out.println(car);
    System.out.println(car2);
    System.out.println(driver);

}





}
