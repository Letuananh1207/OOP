package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public Book(int id, String title, String category, float cost) {
		super(id, title,category, cost);
	}

	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Tac Gia da ton tai!");
			return;
		}
		authors.add(authorName);
		System.out.println("Đã thêm" + authorName);
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Tac Gia da ton tai!");
			return;
		}
		authors.remove(authorName);
		System.out.println("Đã xóa" + authorName);
	}

	public String toString() {
	    return "Book - " + this.title + " - " + this.category + " - " + String.join(", ", this.authors) + " - " + this.cost + " $";
	}

}
