package patikaJavaHw.myList;

public class Main {
	public static void main(String[] args) {
		MyList<Integer> list = new MyList<>();
		System.out.println("Dizideki Eleman Sayýsý : " + list.size());
		System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    System.out.println("Dizideki Eleman Sayýsý : " + list.size());
	    System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
	    list.add(50);
	    list.add(60);
	    list.add(70);
	    list.add(80);
	    list.add(90);
	    list.add(100);
	    list.add(110);
	    System.out.println("Dizideki Eleman Sayýsý : " + list.size());
	    System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
	    
	    System.out.println("---------------------");
	    
	    MyList<Integer> list2 = new MyList<>();
	    list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println("2. indisteki deðer : " + list2.get(2));
        list2.remove(2);
        list2.add(40);
        list2.set(0, 100);
        System.out.println("2. indisteki deðer : " + list2.get(2));
        System.out.println(list2.toString());
        
        System.out.println("---------------------");
        
        MyList<Integer> list3 = new MyList<>();
        System.out.println("Liste Durumu : " + (list3.isEmpty() ? "Boþ" : "Dolu"));
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(20);
        list3.add(50);
        list3.add(60);
        list3.add(70);

        System.out.println("Liste Durumu : " + (list3.isEmpty() ? "Boþ" : "Dolu"));

        // Bulduðu ilk indeksi verir
        System.out.println("Indeks : " + list3.indexOf(20));

        // Bulamazsa -1 döndürür
        System.out.println("Indeks :" + list3.indexOf(100));

        // Bulduðu son indeksi verir
        System.out.println("Indeks : " + list3.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = list3.toArray();
        System.out.println("Object dizisinin ilk elemaný :" + dizi[0]);

        // Liste veri türünde alt bir liste oluþturdu
        MyList<Integer> altListem = list3.subList(0, 3);
        System.out.println(altListem.toString());

        // Deðerim listedeki olup olmadýðýný sorguladý
        System.out.println("Listemde 20 deðeri : " + list3.contains(20));
        System.out.println("Listemde 120 deðeri : " + list3.contains(120));

        // Listeyi tamamen boþaltýr ve varsayýlan boyutuna çevirir
        list3.clear();
        System.out.println(list3.toString());
	}
	
}
