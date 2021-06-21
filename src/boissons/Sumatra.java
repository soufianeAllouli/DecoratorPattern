package boissons;

import boissons.Boisson;

public class Sumatra extends Boisson {

    public Sumatra() {
        description="Sumatra";
    }

    @Override
    public double cout() {
        return 6.5;
    }
}
