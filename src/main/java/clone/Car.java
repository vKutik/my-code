package clone;

public class Car implements Cloneable {
    private String model;
    private String typeCar;
    private String color;
    private Engine engine;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "clone.Car{" +
                "model='" + model + '\'' +
                ", typeCar='" + typeCar + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                '}';
    }

    public Car clone() {
        try {
            Car cloneCar = (Car) super.clone();
            cloneCar.setEngine(engine.clone());
            return cloneCar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t colone", e);
        }
    }
}
