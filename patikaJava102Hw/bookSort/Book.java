package patikaJava102Hw.bookSort;

public class Book {
	private String title;
	private int pageNumber;
	private int releaseDate;
	
	public Book(String title, int pageNumber, int releaseDate) {
		super();
		this.title = title;
		this.pageNumber = pageNumber;
		this.releaseDate = releaseDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	
}
