public class Car {
    private String model;
    private int year;
    private int size;
    private int price;

    private Car(Builder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.size = builder.size;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", size=" + size +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String model;
        private int year;
        private int size;
        private int price;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }

}
