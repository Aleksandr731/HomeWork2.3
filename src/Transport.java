public abstract class Transport {

    private final String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public String getModelName() {
        return modelName;
    }

    public void servise() {
        for (int i = 0; i < this.wheelsCount; i++) {
            this.updateTyre();
        }
    }
}