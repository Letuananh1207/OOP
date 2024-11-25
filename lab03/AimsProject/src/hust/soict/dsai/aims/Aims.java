package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sciene Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDVD(dvd3);

        //print cost of the items in the cart
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());

        anOrder.removeDVD(dvd1);

        System.out.println(anOrder.showCart());
    }
}
