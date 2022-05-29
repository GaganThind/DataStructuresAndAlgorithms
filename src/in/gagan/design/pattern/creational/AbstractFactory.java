package in.gagan.design.pattern.creational;

public class AbstractFactory {

    public static TwoWheeler getTwoWheeler(TwoWheelerFactory twf) {
        return twf.getTwoWheeler();
    }

    public static void main(String[] agrs) {
        TwoWheeler t = AbstractFactory.getTwoWheeler(new MopedFactory("", "", ""));
    }
}

class MopedFactory implements TwoWheelerFactory {

    private String type;
    private String engineType;
    private String fuel;

    public MopedFactory(String type, String engineType, String fuel) {
        this.type = type;
        this.engineType = engineType;
        this.fuel = fuel;
    }

    @Override
    public TwoWheeler getTwoWheeler() {
        return new Moped(type, engineType, fuel);
    }
}

class MotorcycleFactory implements TwoWheelerFactory {

    private String type;
    private String engineType;
    private String fuel;

    public MotorcycleFactory(String type, String engineType, String fuel) {
        this.type = type;
        this.engineType = engineType;
        this.fuel = fuel;
    }

    @Override
    public TwoWheeler getTwoWheeler() {
        return new Motorcycle(type, engineType, fuel);
    }
}

interface TwoWheelerFactory {
    TwoWheeler getTwoWheeler();
}

class Moped implements TwoWheeler {
    private final String type;
    private final String engineType;
    private final String fuel;

    public Moped(String type, String engineType, String fuel) {
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

class Motorcycle implements TwoWheeler {
    private final String type;
    private final String engineType;
    private final String fuel;

    public Motorcycle(String type, String engineType, String fuel) {
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

interface TwoWheeler {
    String getType();
    String getEngineType();
    String getFuel();
}
