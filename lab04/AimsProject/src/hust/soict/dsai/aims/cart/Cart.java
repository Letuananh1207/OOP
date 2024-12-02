package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void showCart() {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println("DVD of " + (i + 1) + ": " + itemsOrdered.get(i).getTitle() + ", "
                    + itemsOrdered.get(i).getCategory() + ", " + itemsOrdered.get(i).getDirector()
                    + ", " + itemsOrdered.get(i).getLength() + ", " + itemsOrdered.get(i).getCost() + ", " + itemsOrdered.get(i).getId() + ".");
        }
    }

    public void print() {
        System.out.println("****************************CART****************************");
        System.out.println("Ordered Items :");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            System.out.println((i + 1) + " " + itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost : " + totalCost());
        System.out.println("************************************************************");
    }

    public void searchDVD(int id) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).getId() == id) {
                System.out.println(itemsOrdered.get(i).toString());
                return;
            }
        }
        System.out.println("Not found");
    }

    public void searchDVD(String title) {
        int foundResult = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (itemsOrdered.get(i).isMatch(title)) {
                System.out.println(itemsOrdered.get(i).toString());
                foundResult++;
            }
        }
        if (foundResult == 0) {
            System.out.println("Not found");
        }
    }

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " đã được thêm vào cart.");
        } else {
            System.out.println("Cannot add more items, cart is full.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println(media.getTitle() + " đã bị xóa khỏi cart.");
        } else {
            System.out.println(media.getTitle() + " không có trong cart.");
        }
    }
}
