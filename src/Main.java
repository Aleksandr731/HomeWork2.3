public class Main {
    public static void main(String[] args) {

        Car car = new Car("Car");
        Car.checkEngine();

        Truck truck = new Truck("Truck", 8);
        Truck.checkTrailer();

        Bicycle bicycle = new Bicycle("Bycycle", 2);
        Bicycle.updateTyre();

        ServiceStation ServiceStation = new ServiceStation();
        ServiceStation.check(car);
        ServiceStation.check(truck);
        ServiceStation.check(bicycle);


    }
}