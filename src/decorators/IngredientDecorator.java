package decorators;

import boissons.Boisson;

public abstract class IngredientDecorator extends Boisson {
    protected Boisson boisson;

    public IngredientDecorator(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();
    public abstract double cout();
}
