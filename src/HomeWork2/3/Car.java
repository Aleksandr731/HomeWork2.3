package pro.sky.java.homeworks.course2.lesson1;

public class Car extends pro.sky.java.homeworks.course2.lesson1.MotorTransport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car(String modelName) {
        super(modelName, 4);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}