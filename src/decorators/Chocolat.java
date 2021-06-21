package decorators;

import boissons.Boisson;

public class Chocolat extends IngredientDecorator {

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au chocolat ";
    }

    @Override
    public double cout() {
        return 3+boisson.cout();
    }
}
