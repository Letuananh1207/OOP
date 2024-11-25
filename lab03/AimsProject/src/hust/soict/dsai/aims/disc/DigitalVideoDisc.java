package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	
	
	public void updatenbDVD() {
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		this.id = nbDigitalVideoDiscs;
		updatenbDVD();
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs;
		updatenbDVD();
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs;
		updatenbDVD();
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs;
		updatenbDVD();
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
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
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean isSameDisc(DigitalVideoDisc other) {
        if (other == null) return false;
        
        return this.title.equals(other.title) &&
               (this.category == null ? other.category == null : this.category.equals(other.category)) &&
               (this.director == null ? other.director == null : this.director.equals(other.director)) &&
               this.length == other.length &&
               Float.compare(this.cost, other.cost) == 0;
    }
	
	public String toString() {
		return "DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length + ": " + this.cost+" $";
	}
	
	public boolean isMatch(String title) {
		String[] word =  title.toLowerCase().split(" ");
		for (int i = 0; i < word.length; i++) {
			if (this.title.toLowerCase().contains(word[i])) {
				return true;
			}
		}
		return false;
	}
	
}