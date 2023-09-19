import model.*;
import repository.*;
import service.*;

public class Main {
    public static void main(String[] args) {
        EventRepository repository = new EventRepository();
        EventService service = new EventService(repository);
        Organiser megaChief = service.findChiefOrganiserForMostEvents();

        System.out.println("Chief with most events: " + megaChief.getName());
    }
}
