package pro.sky.java.homeworks.course2.lesson1;


public class ServiceStation {

    public void check(pro.sky.java.homeworks.course2.lesson1.Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.servise();
    }

}