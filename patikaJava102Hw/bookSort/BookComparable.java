package patikaJava102Hw.bookSort;

import java.util.Comparator;

public class BookComparable implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}
