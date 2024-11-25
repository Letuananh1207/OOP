package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        itemsOrdered[qtyOrdered] = dvd;
        qtyOrdered++;
    }

    public void addDVD(DigitalVideoDisc... dvds) {
        for (int i = 0; i < dvds.length; i++) {
            itemsOrdered[qtyOrdered] = dvds[i];
            qtyOrdered++;
        }
    }
    
    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	itemsOrdered[qtyOrdered] = dvd1;
    	itemsOrdered[qtyOrdered+1] = dvd2;
    	qtyOrdered += 2;
    }

    public float totalCost(){
        float total = 0;
        for(int i=0; i<qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void removeDVD(DigitalVideoDisc dvd){
        for(int i=0; i<qtyOrdered; i++){
            if(dvd.equals(itemsOrdered[i])){
                for(int j=i; j<qtyOrdered -1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                itemsOrdered[qtyOrdered -1] = null;
                qtyOrdered--;
                break;
            }
        }
    }

    public String showCart(){
        for(int i=0; i<qtyOrdered; i++){
            System.out.println("DVD of " +(i+1) + ": " + itemsOrdered[i].getTitle() + ", "
                    + itemsOrdered[i].getCategory() + ", " + itemsOrdered[i].getDirector()
                    + ", " + itemsOrdered[i].getLength() + ", " + itemsOrdered[i].getCost() + ", " + itemsOrdered[i].getId() + ".");
        }
        return null;
    }
    
    public void print(){
    	System.out.println("****************************CART****************************");
    	System.out.println("Ordered Items :");
        for(int i=0; i<qtyOrdered; i++){
            System.out.println((i+1) + itemsOrdered[i].toString());
        }
        System.out.println("Total cost : " + totalCost());
        System.out.println("************************************************************");
        return;
    }
    
    public void searchDVD(int id) {
    	for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id ) {
				System.out.println(itemsOrdered[i].toString());
				return;
			}
		}
    	System.out.println("not found");
    }
    
    public void searchDVD(String title) {
    	int foundResult = 0;
    	for (int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].isMatch(title)) {
				System.out.println(itemsOrdered[i].toString());
				foundResult++;
			}
		}
    	if (foundResult == 0) {
			System.out.println("not found");
		}
    	
    }
}
