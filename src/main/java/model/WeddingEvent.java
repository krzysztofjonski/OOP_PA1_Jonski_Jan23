package model;

public class WeddingEvent extends Event {
    private final Cake cake;

    public WeddingEvent(Cake cake, Employee chief, Employee... others) {
        super(chief, others);
        this.cake = cake;
    }

    @Override
    public void start() {
        if (cake == null) {
            throw new RuntimeException("Wedding must have cake");
        }
        super.start();
    }

    public Cake getCake() {
        return cake;
    }
}
