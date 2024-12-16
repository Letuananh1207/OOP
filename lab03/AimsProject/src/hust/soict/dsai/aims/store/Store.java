package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	private int qtyInStore = 0;
	
	public void addMedia(Media media) {
	    itemsInStore.add(media);
	    System.out.println(media.getTitle() + " đã được thêm vào store.");
	}

	
	public void removeMedia(Media media) {
	    if (itemsInStore.remove(media)) {
	        System.out.println(media.getTitle() + " đã được xóa khỏi store.");
	    } else {
	        System.out.println(media.getTitle() + " không có trong store.");
	    }
	}

	
}
