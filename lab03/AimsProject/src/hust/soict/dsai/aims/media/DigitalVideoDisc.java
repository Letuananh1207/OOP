package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	private static int nbDigitalVideoDiscs = 0;
	
	
	public void updatenbDVD() {
		nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String title) {
		super(title);
		this.id = nbDigitalVideoDiscs;
		updatenbDVD();
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		this.id = nbDigitalVideoDiscs;
		updatenbDVD();
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
		this.id = nbDigitalVideoDiscs;
		updatenbDVD();
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		this.id = nbDigitalVideoDiscs;
		updatenbDVD();
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

	public void play() {
	    System.out.println("Playing DVD: " + this.getTitle());
	    System.out.println("DVD length: " + this.getLength());
	}

	
}