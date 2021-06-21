package decorators;

import boissons.Boisson;

public class Lait extends IngredientDecorator {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au lait ";
    }

    @Override
    public double cout() {
        return 1.56+boisson.cout();
    }
}
