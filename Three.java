class Car {
    String carName;
    String carType;

    Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    private String getCarName() {
        return carName;
    }

    class Engine {
        String engineType;

        void setEngine() {
            if (carType.equals("4T")) {
                if (getCarName().equals("Mehran")) {
                    engineType = "small";
                } else {
                    engineType = "large";
                }
            } else {
                engineType = "Bigger";
            }
        }

        String getEngineType() {
            return engineType;
        }
    }
}

public class Three {
    public static void main(String[] args) {
        Car c = new Car("Mehran", "4T");
        Car.Engine e = c.new Engine();

        e.setEngine();
        System.out.println("Engine type is: " + e.getEngineType());
    }
}