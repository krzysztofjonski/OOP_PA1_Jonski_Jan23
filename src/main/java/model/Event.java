package model;

import model.enums.*;

import java.util.*;

public class Event {
    private final Employee chief;
    private final List<Employee> staff;
    private final EventType type;

    public Event(EventType type, Employee chief, Employee... others) {
        this.type = type;
        this.chief = chief;
        staff = new ArrayList<>();
        staff.add(chief);
        staff.addAll(Arrays.stream(others).toList());
    }

    public Employee getChief() {
        return chief;
    }

    public List<Employee> getStaff() {
        return staff;
    }
}
