package in.gagan.design.pattern.creational;

import java.util.List;

public class Prototype implements Cloneable {
    private List<String> employees;

    public Prototype() { }

    public List<String> fetchEmployeeList() {
        return List.of("A", "B", "C");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return List.copyOf(employees);
    }
}
