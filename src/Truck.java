public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void servise() {
        super.servise();
        checkTrailer();
    }
}