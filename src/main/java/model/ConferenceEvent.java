package model;

import java.util.*;

public class ConferenceEvent extends Event {
    private final Dictionary<Guest, Boolean> gotGoodieBag;

    public ConferenceEvent(Employee chief, Employee... others) {
        super(chief, others);
        gotGoodieBag = new Hashtable<>();
    }

    public boolean requestGoodieBag(Guest guest) {
        if (!getGuests().contains(guest)) {
            return false;
        }
        if (gotGoodieBag.get(guest)) {
            return false;
        }
        return gotGoodieBag.put(guest, true);
    }
}
