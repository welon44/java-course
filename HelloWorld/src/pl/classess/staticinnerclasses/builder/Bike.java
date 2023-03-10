package pl.classess.staticinnerclasses.builder;

public class Bike {

    private final String color;
    private final String type;
    private final boolean isFast;

    private Bike(BikeBuilder builder) {
        this.color = builder.color;
        this.type = builder.type;
        this.isFast = builder.isFast;
    }

    public static BikeBuilder builder() {
        return new BikeBuilder();
    }

    public static class BikeBuilder {

        private String color;
        private String type;
        private boolean isFast;

        public BikeBuilder() {

        }

        public BikeBuilder(String color, String type, boolean isFast) {
            this.color = color;
            this.type = type;
            this.isFast = isFast;
        }

        public Bike build() {
            return new Bike(this);
        }

        public BikeBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public BikeBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public BikeBuilder setFast(boolean fast) {
            isFast = fast;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", isFast=" + isFast +
                '}';
    }
}
