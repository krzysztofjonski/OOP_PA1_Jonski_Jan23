package service;

import model.*;
import repository.*;

import java.util.*;

public class EventService {
    private final EventRepository repository;

    public EventService(EventRepository repository) {
        this.repository = repository;
    }

    public Organiser findChiefOrganiserForMostEvents() {
        Collection<Event> events = repository.getAll();
        Map<Employee, Integer> eventCounters = new HashMap<>();
        for (Event event : events) {
            eventCounters.merge(event.getChief(), 1, Integer::sum);
        }
        return (Organiser) Collections.max(eventCounters.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
