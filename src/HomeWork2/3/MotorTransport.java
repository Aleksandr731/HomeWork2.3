package pro.sky.java.homeworks.course2.lesson1;

public abstract class MotorTransport extends pro.sky.java.homeworks.course2.lesson1.Transport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void servise() {
        super.servise();
        checkEngine();
    }
}
