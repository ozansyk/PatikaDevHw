package patikaJava102Hw.listOfBookLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		List<Book> list = new ArrayList<>();
		list.add(new Book("Kitap1", "Yazar1", 250, 2020));
		list.add(new Book("Kitap2", "Yazar2", 150, 2010));
		list.add(new Book("Kitap3", "Yazar3", 240, 2015));
		list.add(new Book("Kitap4", "Yazar4", 254, 1953));
		list.add(new Book("Kitap5", "Yazar5", 252, 1952));
		list.add(new Book("Kitap6", "Yazar6", 524, 1857));
		list.add(new Book("Kitap7", "Yazar7", 143, 1957));
		list.add(new Book("Kitap8", "Yazar8", 434, 2005));
		list.add(new Book("Kitap9", "Yazar9", 853, 2011));
		list.add(new Book("Kitap10", "Yazar10", 125, 2021));
		
		Map<String, String> map = new TreeMap<>();
		list.stream().forEach(book -> map.put(book.getBookName(), book.getAuthorName()));
		System.out.print(map.get("Kitap1"));
		
		List<Book> list2 = new ArrayList<>();
		list.stream().filter(book -> book.getPages()>200).forEach(b-> list2.add(b));
		list2.stream().forEach(b-> System.out.println(b.getPages()));
		
	}

}
