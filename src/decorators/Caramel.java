package decorators;

import boissons.Boisson;

public class Caramel extends IngredientDecorator {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au caramel ";
    }

    @Override
    public double cout() {
        return 2.7+boisson.cout();
    }
}
