package boissons;

import boissons.Boisson;

public class Espresso extends Boisson {

    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cout() {
        return 5;
    }

}
