import boissons.Boisson;
import boissons.Deca;
import boissons.Espresso;
import decorators.Caramel;
import decorators.Chocolat;
import decorators.Lait;

public class Main {

    public static void main(String[] args) {
        Boisson deca=new Lait(new Deca());
        System.out.println("produit: "+deca.getDescription());
        System.out.println("prix : "+deca.cout());
        Boisson espresso=new Chocolat(new Caramel(new Espresso()));
        System.out.println("produit: "+espresso.getDescription());
        System.out.println("prix : "+espresso.cout());
    }
}
