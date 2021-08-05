package patikaJavaHw.myList;

public class Main {
	public static void main(String[] args) {
		MyList<Integer> list = new MyList<>();
		System.out.println("Dizideki Eleman Say�s� : " + list.size());
		System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    System.out.println("Dizideki Eleman Say�s� : " + list.size());
	    System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
	    list.add(50);
	    list.add(60);
	    list.add(70);
	    list.add(80);
	    list.add(90);
	    list.add(100);
	    list.add(110);
	    System.out.println("Dizideki Eleman Say�s� : " + list.size());
	    System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
	    
	    System.out.println("---------------------");
	    
	    MyList<Integer> list2 = new MyList<>();
	    list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println("2. indisteki de�er : " + list2.get(2));
        list2.remove(2);
        list2.add(40);
        list2.set(0, 100);
        System.out.println("2. indisteki de�er : " + list2.get(2));
        System.out.println(list2.toString());
        
        System.out.println("---------------------");
        
        MyList<Integer> list3 = new MyList<>();
        System.out.println("Liste Durumu : " + (list3.isEmpty() ? "Bo�" : "Dolu"));
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(20);
        list3.add(50);
        list3.add(60);
        list3.add(70);

        System.out.println("Liste Durumu : " + (list3.isEmpty() ? "Bo�" : "Dolu"));

        // Buldu�u ilk indeksi verir
        System.out.println("Indeks : " + list3.indexOf(20));

        // Bulamazsa -1 d�nd�r�r
        System.out.println("Indeks :" + list3.indexOf(100));

        // Buldu�u son indeksi verir
        System.out.println("Indeks : " + list3.lastIndexOf(20));

        // Listeyi Object[] dizisi olarak geri verir.
        Object[] dizi = list3.toArray();
        System.out.println("Object dizisinin ilk eleman� :" + dizi[0]);

        // Liste veri t�r�nde alt bir liste olu�turdu
        MyList<Integer> altListem = list3.subList(0, 3);
        System.out.println(altListem.toString());

        // De�erim listedeki olup olmad���n� sorgulad�
        System.out.println("Listemde 20 de�eri : " + list3.contains(20));
        System.out.println("Listemde 120 de�eri : " + list3.contains(120));

        // Listeyi tamamen bo�alt�r ve varsay�lan boyutuna �evirir
        list3.clear();
        System.out.println(list3.toString());
	}
	
}
