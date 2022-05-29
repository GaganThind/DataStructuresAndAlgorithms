package in.gagan.design.pattern.creational;

public class Factory {

    private Factory() { }

    public static Vehicle getVehicle(String instance, String type, String engineType, String fuel) {
        if ("Car".equals(instance)) {
            return new Car(type, engineType, fuel);
        } else if ("Bike".equals(instance)) {
            return new Bike(type, engineType, fuel);
        }

        return null;
    }
}

class Car implements Vehicle {
    private final String type;
    private final String engineType;
    private final String fuel;

    public Car(String type, String engineType, String fuel) {
        this.type = type;
        this.engineType = engineType;
        this.fuel = fuel;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getEngineType() {
        return this.engineType;
    }

    @Override
    public String getFuel() {
        return this.fuel;
    }
}

class Bike implements Vehicle {
    private final String type;
    private final String engineType;
    private final String fuel;

    public Bike(String type, String engineType, String fuel) {
        this.type = type;
        this.engineType = engineType;
        this.fuel = fuel;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getEngineType() {
        return this.engineType;
    }

    @Override
    public String getFuel() {
        return this.fuel;
    }
}

interface Vehicle {
    String getType();
    String getEngineType();
    String getFuel();
}
