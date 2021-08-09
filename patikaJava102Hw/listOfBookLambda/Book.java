package patikaJava102Hw.listOfBookLambda;

public class Book {
	private String bookName;
	private String authorName;
	private int pages;
	private int releaseYear;
	
	public Book(String bookName, String authorName, int pages, int releaseYear) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.pages = pages;
		this.releaseYear = releaseYear;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	
}
