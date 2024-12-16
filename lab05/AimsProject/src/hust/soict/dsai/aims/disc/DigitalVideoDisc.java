package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDisc = 0;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public int getId() {
		return id;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDisc++;
		this.id = DigitalVideoDisc.nbDigitalVideoDisc;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id = DigitalVideoDisc.nbDigitalVideoDisc;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id = DigitalVideoDisc.nbDigitalVideoDisc;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDisc++;
		this.id = DigitalVideoDisc.nbDigitalVideoDisc;
	}

	public String toString() {
		return this.id + ". DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length
				+ ": " + this.cost + "$";
	}

	public boolean isMatch(String title) {
		if (this.title.contentEquals(title)) {
			return true;
		} else
			return false;
	}

	public boolean isMatch(int id) {
		if (this.id == id) {
			return true;
		} else
			return false;
	}
}
