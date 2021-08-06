package patikaJava102Hw.bookSort;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<Book>(new BookComparable()); 
		set.add(new Book("Zübük", 250, 1950));
		set.add(new Book("Mehmet", 350, 1920));
		set.add(new Book("Abc", 750, 1900));
		set.add(new Book("CinAli", 50, 2005));
		set.add(new Book("Kastamonulu", 1050, 2001));
		
		for(Book b : set) {
			System.out.println(b.getTitle());
		}
		System.out.println("---------");
		
		TreeSet<Book> set2 = new TreeSet<Book>(new BookComparable() {
			@Override
			public int compare(Book o1, Book o2) {
				
				return o1.getPageNumber() - o2.getPageNumber();
			}
		}.reversed());
		
		set2.add(new Book("Zübük", 250, 1950));
		set2.add(new Book("Mehmet", 350, 1920));
		set2.add(new Book("Abc", 750, 1900));
		set2.add(new Book("CinAli", 50, 2005));
		set2.add(new Book("Kastamonulu", 1050, 2001));
		
		for(Book b : set2) {
			System.out.println(b.getTitle());
		}
		
	}

}
