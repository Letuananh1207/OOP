package hust.soict.dsai.aims;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Aims {
    public static void main(String[] args){
//        Cart anOrder = new Cart();
//
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addMedia(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sciene Fiction", "George Lucas", 87, 24.95f);
//        anOrder.addMedia(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
//        anOrder.addMedia(dvd3);
//
//        //print cost of the items in the cart
//        System.out.println("Total cost is: ");
//        System.out.println(anOrder.totalCost());
    	
    	
    	ArrayList<Media> mediaList = new ArrayList<Media>();

    	mediaList.add(new CompactDisc(1, "CD Title", "Music", 15.5f, 60, "Director Name", "Artist Name"));
    	mediaList.add(new DigitalVideoDisc("DVD Title", "Movie", "Director Name", 120, 20.0f));
    	mediaList.add(new Book(101, "Book Title", "Literature", 10.0f));


    	for (Media media : mediaList) {
    	    System.out.println(media.toString());
    	}

    	
    }
}
