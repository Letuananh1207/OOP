package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[50];
	private int qtyInStore = 0;
	
	public void addDVD(DigitalVideoDisc dvd) {
		if (qtyInStore < itemsInStore.length) {
			itemsInStore[qtyInStore] = dvd;
			qtyInStore++;
			System.out.println("Thêm DVD thành công!");
		}else {
			System.out.println("Cửa hàng đã đầy không thể thêm DVD!");
		}
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i = 0; i < qtyInStore; i++) {
			if (itemsInStore[i].equals(dvd)) {
				for (int j = i; j < qtyInStore-1; j++) {
					itemsInStore[j] = itemsInStore[j+1];
				}
				itemsInStore[qtyInStore-1] = null;
				qtyInStore--;
				System.out.println("Đã xóa " + dvd.toString()+ " thành công!");
				return;
			}
		}
		System.out.println("Không tồn tại DVD cần xóa!");
	}
	
}
