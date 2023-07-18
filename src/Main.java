public class Main {
    public static void main(String[] args) {

        Car car = new Car("Car");
        car.checkEngine();

        Truck truck = new Truck("Truck", 8);
        truck.checkTrailer();

        Bicycle bicycle = new Bicycle("Bycycle", 2);
        bicycle.updateTyre();

        ServiceStation ServiceStation = new ServiceStation();
        ServiceStation.check(car);
        ServiceStation.check(truck);
        ServiceStation.check(bicycle);


    }
}