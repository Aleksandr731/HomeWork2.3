package pro.sky.java.homeworks.course2.lesson1;

public class Truck extends pro.sky.java.homeworks.course2.lesson1.MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void servise() {
        super.servise();
        checkTrailer();
    }
}