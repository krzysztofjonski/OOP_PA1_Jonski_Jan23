package model;

public class CocktailPartyEvent extends Event {
    private int cocktailLimit;

    public CocktailPartyEvent(int cocktailLimit, Employee chief, Employee... others) {
        super(chief, others);
        this.cocktailLimit = cocktailLimit;
    }

    public boolean requestCocktail(Guest guest) {
        if (!getGuests().contains(guest)) {
            return false;
        }
        if (cocktailLimit > 0) {
            cocktailLimit--;
            return true;
        }
        return false;
    }

    public int getCocktailLimit() {
        return cocktailLimit;
    }
}
