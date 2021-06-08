package clone;

public class Engine implements Cloneable {
    private String name;
    private Engine engine;
    private int volume;
    private int power;
    private String company;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTypeEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getTypeEngine() {
        return engine;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "clone.Engine{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", volume=" + volume +
                ", power=" + power +
                ", company='" + company + '\'' +
                '}';
    }

    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Can`t colone", e);
        }
    }
}
