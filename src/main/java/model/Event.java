package model;

import java.time.*;
import java.util.*;

public abstract class Event {
    private final Employee chief;
    private final List<Employee> staff;
    private final List<Guest> guests;

    public Event(Employee chief, Employee... others) {
        this.chief = chief;
        staff = new ArrayList<>();
        staff.add(chief);
        staff.addAll(Arrays.stream(others).toList());
        guests = new ArrayList<>();
    }

    public void addGuests(Guest... guests) {
        this.guests.addAll(Arrays.stream(guests).toList());
    }

    public void start() {
        if (staff.stream().filter(e -> e.getClass().equals(Helper.class)).count() < 10) {
            throw new RuntimeException("Event must consists of at least 10 helpers");
        }
        if (staff.stream().filter(e -> e.getClass().equals(Organiser.class)).count() < 3) {
            throw new RuntimeException("Event must consist of at least 3 organisers");
        }
        if (guests.isEmpty()) {
            throw new RuntimeException("Event must have guests");
        }
        System.out.println("Event started at " + LocalDateTime.now());
    }

    public Employee getChief() {
        return chief;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public List<Guest> getGuests() {
        return guests;
    }
}
