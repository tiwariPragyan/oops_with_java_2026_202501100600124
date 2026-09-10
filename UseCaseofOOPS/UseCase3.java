package oops_with_java_2026_202501100600124.UseCaseofOOPS;

interface Rentable{
    double calculateRent(int days);
}

class Car implements Rentable{
    private int rate = 1500;
    final static double TAX_RATE = 0.05;
    static int totalVehiclesRented = 0;
    public double calculateRent(int days){
        totalVehiclesRented++;
        return rate*days;
    }
}

class Bike implements Rentable{
    private int rate = 500;
    final static double TAX_RATE = 0.05;
    static int totalVehiclesRented = 0;
    public double calculateRent(int days){
        totalVehiclesRented++;
        return rate*days;
    }
}


public class UseCase3 {
    public static void main(String[] args) {
    Rentable car = new Car();
    Rentable bike = new Bike();
    double carRent = car.calculateRent(3);
    double bikeRent = bike.calculateRent(2);
    System.out.println("Car rent incl. tax: " + (carRent + carRent * Car.TAX_RATE));
    System.out.println("Bike rent incl. tax: " + (bikeRent + bikeRent * Bike.TAX_RATE));
    System.out.println("Total vehicles rented: " + Car.totalVehiclesRented);
    }
}
